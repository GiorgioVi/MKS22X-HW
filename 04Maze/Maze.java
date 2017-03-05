import java.util.*;
import java.io.*;

public class Maze{

   private char[][]maze;
   private boolean animate;

	public Maze(String filename){
		try{
		String body = "";
		File infile = new File(filename);
		Scanner inf = new Scanner(infile);
		int lineNum = 0;
		while(inf.hasNextLine()){
			lineNum += 1;
			String line = inf.nextLine();
			body += line;
		}
		maze = new char[lineNum][body.length() / lineNum];
		int counter = 0;
		for(int i = 0; i < maze.length; i++){

            for(int j = 0; j < maze[0].length; j++){
				maze[i][j] = body.charAt(counter);
				counter++;
			}
		}
		} catch(FileNotFoundException e){
		  System.out.println("File Not Found");
		 }
	}


	public String toString(){
	String visualBoard = "";
	for(int i = 0; i < maze.length; i++){
		for(int j = 0; j < maze[0].length; j++){
			visualBoard += maze[i][j];
		}
		visualBoard += "\n";
	}
	return visualBoard;
	}

	public boolean solve(){
    int startr = -1,startc = -1;
		for(int i = 0; i < maze.length ; i++){
			for(int j = 0; j < maze[0].length; j++){
			 if(maze[i][j] == 'S'){
				startr = i;
				startc = j;
			}
      }
    }
  maze[startr][startc] =' ';
	return solve(startr, startc);
	}

  private boolean solve(int r, int c){
    if(maze[r][c] == 'E') return true;
      else{maze[r][c] = '@';
    if(maze[r - 1][c] != '#' && maze[r -1][c] != '.'
      && maze[r-1][c] != '@' && solve(r-1,c)){
        return true;
    }
    if(maze[r +1][c] != '#' && maze[r +1][c] != '.'
      && maze[r+1][c] != '@' && solve(r+1,c)){
        return true;
    }
    if(maze[r][c + 1] != '#' && maze[r][c + 1] != '.'
      && maze[r][c + 1] != '@' && solve(r, c +1)){
        return true;
    }
    if(maze[r][c -1] != '#' && maze[r][c - 1] != '.'
      && maze[r][c -1] != '@' && solve(r, c -1)){
        return true;
    }
    else{
      maze[r][c] = '.';
    }
  }
  return false;
}



	public static void main(String[] arghhhhh){
		Maze cyclone = new Maze("data3.dat");
    cyclone.solve();
    System.out.println(cyclone.toString());

	}
}

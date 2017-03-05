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
		}System.out.println(lineNum);
		maze = new char[lineNum][body.length() / lineNum];
		int counter = 0;
		for(int i = 0; i < maze.length; i++){
			
            for(int j = 0; j < maze[0].length; j++){
				maze[i][j] = body.charAt(counter);
				counter++;
			}
		}
		} catch(FileNotFoundException e){
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
	
	public static void main(String[] arghhhhh){
		Maze cyclone = new Maze("data3.dat");
		System.out.println(cyclone.toString());	
	}
}	
	



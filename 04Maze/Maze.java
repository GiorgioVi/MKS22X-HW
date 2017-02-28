import java.util.*;
import java.io.*;

public class Maze{	
   
   private char[][]maze;
   private boolean animate;

	public Maze(String filename){ 
		throws FileNotFoundException{
		String body = "";
		File infile = new File(filename);
		Scanner inf = new Scanner(infile);
		int lineNum = 1;
		while(inf.hasNextLine()){
			String line = inf.nextLine();
			body += line;
			lineNum += 1;
		}
		maze = new char[lineNum][body.length() / lineNum];
		int counter = 0;
		for(int i = 0; i < maze.length; i++){
			for(int j = 0; j < maze[0].length; j++){
				maze[i][j] = body.charAt(counter);
				counter++;
			}
		}
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
		Maze cyclone = new Maze(data1.dat);
		System.out.println(cyclone.toString());	
	}
}	
	



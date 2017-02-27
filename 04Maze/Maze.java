import java.util.*;
import java.io.*;

public class Maze{	
   
   private char[][]maze;
   private boolean animate;

	public Maze(String filename){
	/*	String body = "";
		File infile = new File(filename);
		Scanner inf = new Scanner(infile);
		int line = 1;
		while(inf.hasNextLine()){
		String line = inf.nextLine()
		}
	*/	
	
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
	
	}
}	
	



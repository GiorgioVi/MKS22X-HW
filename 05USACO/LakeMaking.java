import java.util.*;
import java.io.*;
public class LakeMaking{

    private int R, C, E, N, R_s, C_s, D_s;
    private int[][] lake;
    private String moves;

    public LakeMaking(String filename){
	try{	
	    String body = "";
	    File infile = new File(filename);
	    Scanner inf = new Scanner(infile);
	    String firstLine = inf.nextLine();
	    String[] nums = firstLine.split(" ");
	    R = Integer.parseInt(nums[0]);
	    C = Integer.parseInt(nums[1]);
	    E = Integer.parseInt(nums[2]);
	    N = Integer.parseInt(nums[3]);
	    lake = new int[R][C];
	    int counter = 0;
	    int notherCounter= 0;
	    while(counter < R && inf.hasNextLine()){
		counter += 1;
		body += inf.nextLine();
	    }
	    String[] numbers = body.split(" ");
	    for(int i=0; i < R; i ++){
		for(int j=0; j< C;j++){
		    lake[i][j] = Integer.parseInt(numbers[i]);
		}
	    }
	    while(inf.hasNext()){
		moves += inf.nextLine();
	    }
		  	    
	}catch(FileNotFoundException e){
		System.out.println("File Not Found");
	    
	}//String inf.nextLi

	}

	public String toString(){
	    String lakeData = "";
	    lakeData += R + " " + C + " " + E + " " + N + " \n";
	    for(int r = 0; r<lake.length; r++){
		for(int c = 0; c<lake[0].length; c++){
		    lakeData += lake[r][c] + " ";
		}
		lakeData += "\n";
	    }
	    lakeData += moves;
	    return lakeData;
	}
	public static void main(String[] arghhhh){
	    LakeMaking jio = new LakeMaking("infile1.txt");
	    System.out.println(jio.toString());




	}
    }

import java.util.*;
import java.io.*;

//Worked With Joyce Wu

public class USACO{

  public USACO(){}

  public int bronze(String filename){
    try{
      File infile = new File(filename);
	    Scanner inf = new Scanner(infile);
	    String firstLine = inf.nextLine();
      Scanner scammer = new Scanner(firstLine);
      int R = scammer.nextInt();
	    int C = scammer.nextInt();
	    int E = scammer.nextInt();
	    int N = scammer.nextInt();
      int[][]lake = new int[R][C];
      for(int x = 0; x < R; x++){
        String elevations = inf.nextLine();
        Scanner elevationsS = new Scanner(elevations);
        for(int y = 0; y < C; y++){
          lake[x][y] = elevationsS.nextInt();
        }
      }
      while(inf.hasNextLine()){
        String input = inf.nextLine();
        Scanner inputScan = new Scanner(input);
        int R_s = inputScan.nextInt();
        int C_s = inputScan.nextInt();
        int D_s = inputScan.nextInt();

        int highest = lake[R_s - 1][C_s -1];
        for(int row = R_s-1; row<R_s+2; row++){
		        for(int col = C_s-1; col<C_s+2; col++){
			           if(lake[row][col] > highest){
			                highest = lake[row][col];
			            }
		         }
	      }
        int supposedEl = highest - D_s;
		    for(int row = R_s-1; row<R_s+2; row++){
		        for(int col = C_s-1; col<C_s+2; col++){
			            if(lake[row][col] > supposedEl){
			                 lake[row][col] = supposedEl;
			             }
		            }
		    }
	     }
       int depth = 0;
       for(int r = 0; r < R; r++){
         for(int c = 0; c < C; c++){
           if(lake[r][c] < E){
             depth += E - lake[r][c];
           }
         }
       }
       return depth * 72 * 72;
     }catch(FileNotFoundException e){
       System.out.println("No file");
     }

     return -1;
    }

    public int silver(String filename){
      try{
        Scanner scammer = new Scanner(new File(filename));
        int N = scammer.nextInt();
        int M = scammer.nextInt();
        int T = scammer.nextInt();
        scammer.nextLine();
        int[][] pasture = new int[N][M];
        String field = "";

        for(int i = 0; i < N; i ++){
          field += scammer.nextLine();
        }
        int R1 = scammer.nextInt() - 1;
        int C1 = scammer.nextInt() - 1;
        int R2 = scammer.nextInt() - 1;
        int C2 = scammer.nextInt() - 1;

        for (int r = 0; r < pasture.length; r++){
		        for (int c = 0; c < pasture[r].length; c++){
		            if (field.charAt(r*pasture[r].length+c) == '*'){
			               pasture[r][c] = -1;
		             } else { pasture[r][c] = 0;}

		         }
	       }
        pasture[R1][C1] = 1;
        for (int t = 0; t < T; t++){
	         int[][] temp = new int[N][M];
	         int sum = 0;
	          for (int r = 0; r < N; r++){
		            for (int c = 0; c < M; c++){
		                sum = 0;
		              if (r-1 >= 0 && pasture[r-1][c] > 0) {
			               sum += pasture[r-1][c];
		                  }
		              if (r+1 < pasture.length && pasture[r+1][c] > 0){
			               sum += pasture[r+1][c];
		                     }
		              if (c-1 >= 0 && pasture[r][c-1] > 0){
			                sum += pasture[r][c-1];
		                      }
		              if (c+1 < pasture[r].length && pasture[r][c+1] > 0){
			                 sum += pasture[r][c+1];
		                      }
		              if (pasture[r][c] >= 0){
			                 temp[r][c] = sum;
		              } else { temp[r][c] = -1; }
		                 }
	            }
       	    pasture = temp;
	        }
	        return pasture[R2][C2];

      }catch(FileNotFoundException e){
        System.out.println("no File");
      }
      return -1;
    }


    public static void main(String[] args) {
    USACO tester = new USACO();
    System.out.println(tester.bronze("makelake.1.in"));
    System.out.println(tester.bronze("makelake.2.in"));
    System.out.println(tester.bronze("makelake.3.in"));
    System.out.println(tester.silver("ctravel.2.in"));
    System.out.println(tester.silver("ctravel.3.in"));
    System.out.println(tester.silver("ctravel.4.in"));
  }

  }

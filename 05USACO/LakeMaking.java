public class LakeMaking{

    private int R, C, E, N;
    private int[][] lake;

    public LakeMaking(String fileInput){
	try{	
	    String body = "";
	    File infile = new File(filename);
	    Scanner inf = new Scanner(infile);
	    String firstLine = inf.nextLine();
	    String[] nums = firstLine.split(" ");
	    R = nums[0];
	    C = nums[1];
	    E = nums[2];
	    N = nums[3];
	    lake = new int[R][C];
	    int counter = 0;
	    int nothercount= 0;
	    while(counter < R && inf.hasNextLine()){
		counter += 1;
		body += inf.nextLine();
	    }
	    for(int i=0; i < R; i ++){
		for(int j=0; j< C;j++){
		    lake[i][j]=body.charAt(notherCounter);
		    notherCounter++;
		}
	    }
	    String inf.nextLine()
					   
	    
		
	}

	public static void main(String[] arghhhh){




	}
    }

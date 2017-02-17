public class KnightBoard{
	
	private int[][] board;

	public KnightBoard(int startingRow, int startingCol, int size){
		board = new int[size][size];
		fillWith0s();
		board[startingRow][startingCol] = 1;
	}

	public void fillWith0s(){
		for(int x = 0; x < board.length; x++){
			for(int y = 0; y < board.length; y++){
				board[x][y] = 0;
			}
		}
	}

	public String toString(){
		String visualBoard = "";
		for(int x = 0; x < board.length; x++){
			for(int y = 0; y < board.length; y++){
				if(board[x][y] < 10){
					visualBoard += " _" + board[x][y];
				}else{
					visualBoard += " " + board[x][y];
				}		
			}
				visualBoard += "\n";	
		}
		return visualBoard;
	}
	
	public boolean solveH(int row, int col, int level){
			
	}

	public void solve(){

	}
	public static void main(String[] arghhhh){
		KnightBoard cyclone = new KnightBoard(3, 2, 8);
		System.out.println(cyclone.toString());
	}

}

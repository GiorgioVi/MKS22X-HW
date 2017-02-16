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
		if((row < board.length && row > -1)
		 &&(col < board.length && col > -1){
			return false;
		}
		if(board[row + 2][col + 1] == 0)
		
		if(board[row + 2][col - 1])
		if(board[row - 2][col + 1])
		if(board[row - 2][col - 1])
		if(board[row + 1][col + 2])
		if(board[row - 1][col + 2])
	}

	public void solve(){

	}
	public static void main(String[] arghhhh){
		KnightBoard cyclone = new KnightBoard(3, 2, 8);
		System.out.println(cyclone.toString());
	}

}

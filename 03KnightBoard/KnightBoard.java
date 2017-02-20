public class KnightBoard{

	private int[][] board;

	public KnightBoard(int startingRow, int startingCol){
		board = new int[startingRow][startingCol];
		fillWith0s();
	}

	public void fillWith0s(){
		for(int x = 0; x < board.length; x++){
			for(int y = 0; y < board[0].length; y++){
				board[x][y] = 0;
			}
		}
	}

	public String toString(){
		String visualBoard = "";
		for(int x = 0; x < board.length; x++){
			for(int y = 0; y < board[0].length; y++){
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
		if(level > board.length * board[0].length){
			return true;
		}
		if(row > -1 && row < board.length &&
		col > -1 && col < board[0].length
		&& board[row][col] == 0){
		board[row][col] = level;
		level++;
		if(solveH(row + 1, col + 2, level)){
	 	return true;
			}
		if(solveH(row - 1, col + 2, level)){
	 	return true;
			}
		if(solveH(row + 1, col - 2, level)){
	 	return true;
			}
		if(solveH(row - 1, col - 2, level)){
	 	return true;
			}
		if(solveH(row + 2, col + 1, level)){
	 	return true;
	 		}
		if(solveH(row - 2, col + 1, level)){
	 	return true;
			}
		if(solveH(row + 2, col - 1, level)){
	 	return true;
			}
		if(solveH(row - 2, col - 1, level)){
	 	return true;
			}
		board[row][col] = 0;
			}
		return false;
}

	public void solve(){
		for(int x = 0; x < board.length; x++){
			for(int y = 0; y < board[0].length; y++){
				if(solveH(x, y, 1)){
					break;
				}
			}
		}
	}
	public static void main(String[] arghhhh){
		KnightBoard cyclone = new KnightBoard(6, 6);
		cyclone.solve();
		System.out.println(cyclone.toString());
	}

}

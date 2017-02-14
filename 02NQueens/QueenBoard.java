public class QueenBoard{
  private int[][] board;
  private int solutionCount;


  public QueenBoard(int size){
    board = new int[size][size];
    fillWith0s();
    solutionCount = 0;
  }

  public void fillWith0s(){
    for(int x = 0; x < board.length; x++){
	    for(int y = 0; y < board.length; y++){
		      board[x][y] = 0;
        }
     }
  }

  public boolean solve(){
     return solveH(0);
   }

   private boolean solveH(int col){
     if(col >= board.length) return true;
     for(int i = 0; i < board.length; i++){
       if(setQueen(i,col)){
         setQueen(i, col);
         if(solveH(col + 1)) return true;
         byeQueen(i, col);
     }
   }
    return false;
}


  public int getSolutionCount(){
     return solutionCount;
   }
   public void countSolutions(){
    if(!(solutionCount >= 2 && solutionCount <=3)) countH(0);
   }

   public void countH(int j){
     if(j >= board.length){
       solutionCount++;
       return;
     }
      for(int row = 0; row < board.length; row++){
        if(board[row][j] == 0){
          setQueen(row, j);
          countH(j + 1);
          byeQueen(row, j);
        }
      }
   }

public String toString(){
    String visualBoard = "";
    for(int x = 0; x < board.length; x++){
	   for(int y = 0; y < board.length; y++){
      if(board[x][y] == 1) visualBoard += "Q ";
       else{ visualBoard += "_ ";
        }
      }
     visualBoard += "\n";
    }
    return visualBoard;
}

public boolean setQueen(int row, int col){
  if(board[row][col] != 0) return false;
  board[row][col] = 1;
  for(int move = 1; move + col < board.length; move++){
    board[row][col+move]--;
    if(row - move >= 0){
      board[row-move][col+move]--;
    }
    if(row + move < board.length){
      board[row+move][col+move]--;
    }
   }
   return true;
}

public boolean byeQueen(int row, int col){
  if(board[row][col] != 1) return false;
  board[row][col] = 0;
  for(int move = 1; move + col < board.length; move ++){
    board[row][col+move]++;
    if(row - move >= 0){
      board[row-move][col+move]++;
    }
    if(row + move < board.length){
      board[row+move][col+move]++;
      }
    }
    return true;
}
}

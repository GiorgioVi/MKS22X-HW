public class QueenBoard{
  private int[][] board;
  private int solutionCount;


  public QueenBoard(int size){
    board = new int[size][size];
    fillWith0s();
    solutionCount = -1;
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
         if(solveH(col + 1)){
           return true;
         }
         byeQueen(i, col);
     }
   }
    return false;
}


   public int getSolutionCount(){
     return -1;
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
  int move = 1;
  while (col + move < board[row].length) {
    board[row][col+move]--;
    if(row - move >= 0){
      board[row-move][col+move]--;
    }
    if(row + move < board[row].length){
      board[row+move][col+move]--;
    }
    move++;
   }
   return true;
}


public boolean byeQueen(int row, int col){
  if(board[row][col] != 1) return false;

  board[row][col] = 0;
  int move = 1;
  while (col + move < board[row].length) {
    board[row][col+move]++;
    if(row - move >= 0){
      board[row-move][col+move]++;
    }
    if(row + move < board[row].length){
      board[row+move][col+move]++;
    }
    move++;
    }
    return true;
}


   public static void main(String[] args) {
     QueenBoard tester = new QueenBoard(8);
     System.out.println(tester.solve());
     //System.out.println(tester.setQueen(3,4));
     //System.out.println(tester.byeQueen(0,0));
     System.out.println(tester.toString());

   }
}

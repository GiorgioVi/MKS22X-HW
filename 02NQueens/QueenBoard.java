public class QueenBoard{
  private int[][] board;
  private int solutionCount;

  public QueenBoard(int size){
 	 board = new int[size][size];
	 fillWith0s();
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
			visualBoard += board[x][y] + " ";
		}
			visualBoard += "\n";
	}
	return visualBoard;
}
   /**
    *precondition: board is filled with 0's only.
    *@return false when the board is not solveable. true otherwise.
    *postcondition:
    *if false: board is still filled with 0's
    *if true: board is filled with the
    *final configuration of the board after adding
    *all n queens. Uses solveH
    */
   public boolean solve()
   {
 return solveH(0);
   }

   private boolean solveH(int col){
 return false;
   }

   /**
    *@return the number of solutions found, or -1 if the board was never solved.
    *The board should be reset after this is run.
    */
   public int getSolutionCount(){
     return -1;
   }
   /**toString
    *and all nunbers that represent queens are replaced with 'Q'
    *all others are displayed as underscores '_'
    */


 public static void main(String[] arghhhh){
	QueenBoard tester = new QueenBoard(8);
	System.out.println(tester.toString());
}


}

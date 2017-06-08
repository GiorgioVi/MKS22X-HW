//recieved help from md
public class MazeSolver{
  private Maze maze;
  private Frontier locations;
  private boolean animate, aStar;

  public MazeSolver(String filename, boolean animated){
    maze = new Maze(filename);
    animate = animated;
    aStar = false;
  }

  public MazeSolver(String filename){
    maze = new Maze(filename);
    animate = false;
    aStar = false;
  }

  public void solve(){
    solve(1);
  }

  public void solve(int style){
    if(style == 0) locations = new FrontierStack();
	  else if(style == 1) locations = new FrontierQueue();
    else locations = new FrontierPriorityQueue();
    if(style == 3) aStar = true;

    locations.add(maze.start);
    Location current = maze.start;

    while(current != maze.getEnd() && locations.size() != 0){
      current = locations.next();
      if(current.getDistanceToGoal() == 0){
        finish(current);
        break;
      }
      else{
        maze.set(current.getRow(),current.getCol(),'.');
        if(animate) System.out.println(maze.toString(30));
        int[][] moves = {{1,0},{0,1},{-1,0},{0,-1}};
        for(int i=0; i<moves.length; i++){
          int r = current.getRow() + moves[i][0];
          int c = current.getCol() + moves[i][1];
          if(maze.get(r,c) == ' '){
            int distToStart = Math.abs(r-maze.getStart().getRow()) + Math.abs(c-maze.getStart().getCol());
            int distToGoal = Math.abs(r-maze.getEnd().getRow()) + Math.abs(c-maze.getEnd().getCol());
            locations.add(new Location(r, c, current, distToStart, distToGoal, aStar));
            maze.set(r, c, '?');
            if(animate) System.out.println(maze.toString(30));
          }
        }
      }
    }
  }

  public void finish(Location current){
    while(current != null){
	    maze.set(current.getRow(),current.getCol(), '@');
      if(animate) System.out.println(maze.toString(30));
	    current = current.getPrevious();
    }
  }


 public String toString(){
   return maze.toString(); //maze instance variable is maze in this case
 }

 public String toString(int n){
    return maze.toString(n); //maze instance variable is maze in this case
 }

  public static void main(String[] args){
    MazeSolver g = new MazeSolver(args[0], true);
    g.solve(Integer.parseInt(args[1]));
  }
}

public class Location implements Comparable<Location>{
  private int col, row, distanceToStart, distanceToGoal;
  private Location prev;
  private boolean aStar;

  public Location(int c, int r, Location p, int dts, int dtg, boolean a){
    col = c;
    row = r;
    distanceToStart = dts;
    prev = p;
    distanceToGoal = dtg;
    aStar = a;
  }


//////GETTER METHODS
  public int getRow(){
    return row;
  }
  public int getCol(){
    return col;
  }
  public int getdistanceToGoal(){
    return distanceToGoal;
  }
  public boolean getAStar(){
    return aStar;
  }
  public void setAStar(boolean b){
    aStar = b;
  }
  public int getdistanceToStart(){
    return distanceToStart;
  }
  public Location getPrev(){
    return prev;
  }

  public static int dist(Location l, int r, int c){
	   return Math.abs(l.getRow() - r) + Math.abs(l.getCol() - c);
  }


  ////compareTo

  public int compareTo(Location o){
    if(aStar){
      return distanceToGoal+distanceToStart - (o.distanceToGoal + o.distanceToStart);
    }else{
      return distanceToGoal - o.distanceToGoal;
    }
  }

}

public class Location implements Comparable<Location>{
  private int row,col,distanceToGoal,distanceToStart;
  private Location previous;
  private boolean aStar;

  public Location(int r, int c, Location previous , int distToStart, int distToGoal, boolean aStar){
    row = r;
    col = c;
    this.previous = previous;
	  distanceToStart = distToStart;
	  distanceToGoal = distToGoal;
	  this.aStar = aStar;
  }

  public int compareTo(Location loc){
    if(aStar) return distanceToGoal+distanceToStart-(loc.distanceToGoal+loc.distanceToStart);
    else return distanceToGoal-loc.distanceToGoal;
  }

  public int getRow(){return row;}
  public int getCol(){return col;}
  public Location getPrevious(){return previous;}
  public int getDistanceToGoal(){return distanceToGoal;}
  public int getDistanceToStart(){return distanceToStart;}
}

public class Location implements Comparable<Location>{
  private int col, row, distanceToStart;
  private Location prev;

  public Location(int c, int r, int dts, Location p){
    col = c;
    row = r;
    distanceToStart = dts;
    prev = p;
  }

  public int compareTo(Location other){
    return
  }
}

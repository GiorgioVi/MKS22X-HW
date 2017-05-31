public interface Frontier{


  public void add(Location x);
  public Location next();
  public boolean hasNext();
  public int getSize();
}

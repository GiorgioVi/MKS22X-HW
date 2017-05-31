import java.util.LinkedList;

public class FrontierQueue implements Frontier{

  public LinkedList<Location> loci = new LinkedList<Location>();

  public void add(Location l){
 	  loci.add(l);
  }

  public Location next(){
 	  return loci.remove();
  }

  public boolean hasNext(){
    return loci.size() != 0;
  }

  public int getSize(){
    return loci.size();
  }

}

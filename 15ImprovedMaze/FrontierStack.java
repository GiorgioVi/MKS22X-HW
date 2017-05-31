import java.util.Stack;

public class FrontierStack implements Frontier{

  private Stack<Location> loci;

  public void add(Location x){ loci.push(x);}

  public Location next(){
    return loci.pop();
  }

  public boolean hasNext(){
    return loci.size() != 0;
  }

public int getSize(){
  return loci.size();
}



}

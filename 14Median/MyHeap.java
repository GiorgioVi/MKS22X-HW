import java.util.NoSuchElementException;

public class MyHeap{
    private int[] meap =  new int[10];
    private int max = 1, size;

    public MyHeap(){
      size = 0;
    }

    public MyHeap(boolean bool){
       size = 0;
       if(bool){
         max = 1;
       }else{
         max = -1;
       }
    }

    public void swap(int a, int b){
      int swapper = meap[b];
      meap[b] = meap[a];
      meap[a] = swapper;
    }
    public int peek(){
	     if(size == 0) throw new NoSuchElementException();
	     return meap[1];
    }
    private int comp(Integer a, Integer b){
      return a.compareTo(b);
    }
    private void pushUp(int i){
	     while(i != 1 && comp(meap[i],meap[i/2]) * max > 0){
	     int dad = i/2;
       swap(i,dad);
	     i = dad;
	    }
    }

    private void pushDown(int i){
	    while(2 * i <= size){
	       if(2 * i + 1 <= size && comp(meap[2 * i + 1], meap[2 * i]) * max > 0){
		         if(comp(meap[i], meap[2 * i + 1]) * max < 0){
		             int little = 2 * i + 1;
		             swap(i,little);
		             i = little;
		         }else{ break; }
	       }else{ if(comp(meap[i], meap[2 * i]) * max < 0){
		              int kid = 2 * i;
		              swap(i,kid);
		              i = kid;
		              }else{ break;}
	             }
	   }
  }

  public void add(int s){
     if(size+1 == meap.length) getBig();
     meap[size+1] = s;
     size++;
     pushUp(size);
  }

  public int remove(){
     if(size == 0) throw new NoSuchElementException();
     int prev = meap[1];
     meap[1] = meap[size];
     size--;
     pushDown(1);
     return prev;
  }

  private void getBig(){
    int[] big = new int[size*2];
    for(int i = 1; i <= size; i++){
      big[i] = meap[i];
    }
	   meap = big;
    }
  public int size(){
	   return size;
  }
}

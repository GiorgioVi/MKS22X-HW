import java.util.*;
import java.util.NoSuchElementException;

public class MyHeap{
   private String[] data = new String[10];
   private int max = 1;
   private int size;

	public MyHeap(){
  size = 0;
	}

	public MyHeap(boolean beta){
  size = 0;
		if(beta){
			max = 1;
		}else{
			max = -1;
		}
	}
  private void getBig(){
    String[]big = new String[size*2];
    for (int i =0;i <= size;i++ ) {
      big[i] = data[i];
    }
    data = big;
  }

  public void swap(int a, int b){
	   String feta = data[b];
	   data[b] = data[a];
	   data[a] = feta;
    }

	public void add(String s){
  if(size+1 == data.length) getBig();
  size++;
  data[size] = s;
  pushUp(size);

	}

	public String remove(){
		if(size == 0) throw new NoSuchElementException();
    String x = data[1];
    data[1] = data[size];
    size--;
    pushDown(1);
    return x;
	}

	public String peek(){
	if(size == 0){
		throw new NoSuchElementException();
	}else{
		return data[1];
	}
	}

  public boolean comp(String first, String sec){
	if(max >0){
	    return first.compareTo(sec) > 0;
	}else{
	    return sec.compareTo(first) > 0;
	}
  }

  private void pushUp(int k){
  if (k > 1 && comp(data[k],data[k/2])){
     swap(k, k/2);
     pushUp(k/2);
  }
  }

  private void pushDown(int k){
	if(k*2+1 <= size){
	    if(comp(data[k*2], data[k*2+1])){
		      swap(k, k*2);
		        pushDown(k*2);
	    }else{
		      swap(k, k*2+1);
		        pushDown(k*2+1);
	    }
	}else{
	    if (k * 2 <= size){
		      swap(k, k*2);
	    }
	    }
  }

  public String toString(){
	String x = "[";
	for (int i = 1;i <= size;i++){
	    x+=data[i] + ", "
	}
	return x + "]";
    }
}

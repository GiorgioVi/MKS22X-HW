import java.util.ArrayList;

public class MyHeap{
   private int size;
   private ArrayList<String> data;
   private boolean max;
 
	public MyHeap(){
	}

	public MyHeap(boolean beta){
		size = data.size();
		if(beta){
			max = true;
		}else{
			max = false;
		}
	}

	public void add(String s){
		if(size != 1) data.add(
	}
	
	public String remove(){
		return "";
	}

	public String peek(){
	if(size == 1){
		return null;
	}else{
		return data.get(1);
	}
	}

	private void pushUp(){
	}

	private void pushDown(){
	}

	public static void main(String[] argggg){
		MyHeap pizza = new MyHeap();


	}	
}

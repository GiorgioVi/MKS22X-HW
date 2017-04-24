import java.util.NoSuchElementException;

public class MyDeque{
  private String[] data;
  private int front = 0;
  private int end = data.length - 1;

public MyDeque(int x){
  data = new String[x];
  front = 0; end = 0;
}

public String toString(){
  String x = "[";
  for(int i = 0; i < data.length; i++){
    x += data[i];
  }
  return x + "]";
}
private boolean isEmpty(){
  return data[front] == null;
}

private boolean isFull(){
  return data[end] != null; 
}

public void addFirst(String noot){

}

public void addLast(String noot){

}

public String removeFirst(){
return "";
}

public String removeLast(){
return "";
}

public String getFirst(){
return "";
}

public String getLast(){
return "";
}

public static void main(String[] args) {
  MyDeque pizza = new MyDeque(10);

}

}

import java.util.NoSuchElementException;

public class MyDeque{
  private String[] data;
  private int front, end, size;

public MyDeque(){
  data = new String[10];
  size = 10;
  front = 1;
  end = 0;
}

public String toString(){
  if(data[front] == null) return "[]";
  String x = "[" + data[front] + ", ";
  for(int i = front+1; i != end+1; i++){
    if(i == size) i = 0;
    x += data[i] + ", ";
  }
  return x + "]";
}
public void getBig(){
  int head = front;
  String[] newDeq = new String [size * 2];
  for(int i = 0; i < size; i++){
    if(head == size) head = 0;
    newDeq[i] = data[head];
    head++;
  }
  data = newDeq;
  front = 0; end = size/2 - 1;

}

public void addFirst(String noot){
  if(noot == null) throw new NullPointerException();

  if((end + 1) % size == front && !(data[front] == null)) getBig();

  if(0 == front) front = size;

  front --;
  data[front] = noot;
}

public void addLast(String noot){
  if(noot == null) throw new NullPointerException();

  if((end + 1) % size == front && !(data[front] == null)) getBig();

  end = (end+1)%size;
  data[end] = noot;
}

public String getFirst(){
  if(data[front] == null) throw new NoSuchElementException();

  return data[front];
}

public String getLast(){
  if(data[front] == null) throw new NoSuchElementException();

  return data[end];
}

public String removeFirst(){
  if(data[front] == null) throw new NoSuchElementException();
  String removed = data[front];
  data[front] = null;
  front++;
  if(front == size) front = 0;

  return removed;
}

public String removeLast(){
  if(data[front] == null) throw new NoSuchElementException();
  String removed = data[end];
  data[end] = null;
  end--;
  if(end == -1)  end = size-1;

  return removed;
}



public static void main(String[] args) {
  MyDeque pizza = new MyDeque();
  pizza.addFirst("noot");
  System.out.println(pizza);
  pizza.addFirst("boo");
  pizza.addFirst("sho");
  pizza.addFirst("shop");
  pizza.addFirst("shol");
  pizza.addFirst("shoe");
  pizza.addLast("ship");


  System.out.println(pizza.toString());
  System.out.println(pizza.getLast());
  System.out.println(pizza.getFirst());
  System.out.println(pizza.removeLast());
  System.out.println(pizza.removeFirst());
  System.out.println(pizza.toString());
}
}

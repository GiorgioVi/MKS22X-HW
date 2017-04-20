import java.util.*;
public class MyLinkedList implements Iterable<Integer>{


    private class LNode{
	     LNode next,prev;
	     int value;
	       public LNode(int ele){
		         value = ele;
         }
         private LNode(int ele, LNode nextN){
           value = ele;
           next = nextN;
         }

	        public String toString(){
		         return value + "";
    	   }
    }

    public class LinkedListIterator implements Iterator<Integer>{
      LNode current = head;

      public boolean hasNext(){
        return current != null;
      }

      public Integer next(){
        if(hasNext()){
          LNode prev = current;
          current = current.next;

          return new Integer(prev.value);
        }else{ throw new NoSuchElementException();}
        }

        public void remove(){
          throw new UnsupportedOperationException();
        }
      }

    LNode head,tail;
    int size;

	public MyLinkedList(){
    size = 0;
	}
  public Iterator<Integer> iterator(){
    return new LinkedListIterator();
  }

  public int size(){
		return size;
	}

  private LNode getNthNode(int n){
    if(n < 0 || n > size()-1){
  	    throw new IndexOutOfBoundsException();
  	}
    LNode current = head;
    for(int i = 0; i < size; i++){
      if(i == n){ break;
      }else{current = current.next;}
    }
	return current;
	}


  public String toString(){
		String body = "[";
		LNode current = head;
		while(current != null){
			body += (current.value + ", ");
      current = current.next;
		}
		return body + "]";
	}

  private boolean add(int value){
    if(size() == 0){
      LNode beta = new LNode(value);
      head = beta;
    }else{
     LNode current = head;
     while(current.next != null){
        current = current.next;
     }
     LNode beta  =  new LNode(value);
     current.next = beta;
     beta.prev = current;
     this.tail = beta;
    }
    this.size += 1;
    return true;
   }

  public int get(int index){
	if(index < 0 || index >= size()){
	 throw new IndexOutOfBoundsException("Index Out Of Bounds");
	}
	LNode current = head;
	for(int i = 0; i < index; i++){
		current = current.next;
	}
	return current.value;
	}


  public int set(int index, int noot){
	LNode current = head;
	for(int i = 0; i < index; i++){
	current = current.next;
	}
	current.value = noot;
	return current.value;
	}

  public int indexOf(int noot){
	LNode current = head;
  int index = -1;
  for(int i = 0; i < size; i ++){
    if(current.value == noot){
      index = i;
      break;
    }
    current = current.next;
  }
  return index;
	}

  private void remove(LNode target){
	if(head == target){
    head = head.next;
    if(1 != size) head.prev =null;
  }else if(tail == target){
    tail = tail.prev;
    tail.next = null;
  }else{
    target.prev.next = target.next;
    target.next.prev = target.prev;
  }
  }


  public int remove(int index){
    if(index < 0 || index >= size()){
  	 throw new IndexOutOfBoundsException("Index Out Of Bounds");
  	}
	int noot = get(index);
  remove(getNthNode(index));
  size--;
  return noot;
	}

  public void add(int index,int noot){
    if(index < 0 || index > size()){
  	 throw new IndexOutOfBoundsException("Index Out Of Bounds");
  	}
LNode noob = new LNode(noot);
if(size == 0){
  head = noob;
  tail = noob;
}else if(index == 0){
  head.prev = noob;
  noob.next = head;
  head = noob;
}else if(index == size){
  tail.next = noob;
  noob.prev = tail;
  tail = noob;
}else{
  LNode v2 = getNthNode(index--);
  noob.prev = v2;
  noob.next = v2.next;
  v2.next.prev = noob;
  v2.next = noob;
}
size++;
}


  public static void main(String[] argggg){

  }
      /*  MyLinkedList pizza = new MyLinkedList();
        pizza.add(1);
        pizza.add(2);
        pizza.add(8);
        pizza.add(13);
	System.out.println(pizza.size());
        System.out.println(pizza.toString());
	System.out.println(pizza.get(2));
	System.out.println(pizza.set(2,5));
	System.out.println(pizza.toString());
	System.out.println(pizza.get(2));
  System.out.println(pizza.indexOf(10));
  System.out.println(pizza.getNthNode(2));
  pizza.remove(pizza.getNthNode(3));
  System.out.println(pizza.toString());
  //pizza.addAfter(pizza.getNthNode(3), pizza.getNthNode(0));
  //System.out.println(pizza.toString());
  //pizza.remove(0);
  //pizza.remove(3);

  System.out.println(pizza.toString());



}*/
}

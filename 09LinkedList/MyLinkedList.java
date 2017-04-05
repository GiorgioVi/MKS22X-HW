public class MyLinkedList{


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


    LNode head,tail;
    int size;

	public MyLinkedList(){
    size = 0;
	}

	public int size(){
		return size;
	}

  private LNode getNthNode(int n){
	/*complete this*/
	return head;
	}

  private void addAfter(LNode location, LNode toBeAdded){
	/*complete this*/
	}

  private void remove(LNode target){
	/*complete this*/
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
	/*complete this*/
	return 6;
	}

  public int set(int index, int value){
	/*complete this*/
	return 6;
	}

  public int indexOf(int value){
	/*complete this*/
	return 7;
	}

  public int remove(int index){
	/*complete this*/
	return 7;
	}

  public void add(int index,int value){
	/*complete this*/
	}

   	public static void main(String[] argggg){
      MyLinkedList pizza = new MyLinkedList();
      pizza.add(1);
      System.out.println(pizza.toString());


	}
}

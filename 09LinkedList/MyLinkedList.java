public class MyLinkedList{
   
  
    private class LNode{
	LNode next,prev;
	int value;
	public LNode(int ele){
		value = ele;
	}
	
	public String toString(){
		return value + "";
    	}
    }
	

    LNode head,tail;
    int size;
	
	public MyLinkedList(){
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
		}
		return "]" + body;	
	}

        public boolean add(int value){  
	/*complete this*/
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
	

	}
}

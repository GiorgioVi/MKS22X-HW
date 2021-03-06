import java.util.*;
public class RunningMedian {
    MyHeap min, moxxi;

    public RunningMedian() {
	     min = new MyHeap(false);
	     moxxi = new MyHeap(true);
    }

    public double getMedian() {
	     if (min.size() == 0 && moxxi.size() == 0) {
         throw new NoSuchElementException();
	     }else {
	        if (min.size() == moxxi.size()) {
		           return (min.peek() + moxxi.peek()) / 2.0;
	        }else if (min.size() > moxxi.size()) {
		           return min.peek();
	        }else {
		            return moxxi.peek();
	        }
	        }
        }

    public void add(Integer x) {
	     if (min.size() == 0 && moxxi.size() == 0) {
	    moxxi.add(x);
	     } else if (x < getMedian()) {
	    moxxi.add(x);
      } else {
	    min.add(x);
	   }

     if (min.size() - moxxi.size() > 1) {
	    moxxi.add(min.remove());
	   }else if (moxxi.size() - min.size() > 1) {
	    min.add(moxxi.remove());
	   }
   }
}

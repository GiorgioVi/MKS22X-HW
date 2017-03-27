import java.util.*;
public class Quick{

	public static int part(int[] data, int start, int end){
			Random gen = new Random();
			int randind = gen.nextInt(end-start) + 1 + start;
			int num = data[randind];
			swap(data,randind,end);
			int x = end-1;
			int y = start;
			while(x >= y){
				if(num > data[y]){
					y++;
				}
				else if(data[y] >= num){
					swap(data,x,y);
					x--;
				}
			}
			swap(data, end, y);
			return y;
	}


	public static void swap(int[] data, int orig, int replace){
		    int temp = data[orig];
		    data[orig] = data[replace];
		    data[replace] = temp;
		}

	public static int quickSelectH(int[] data, int i, int start,int end){
		int n = part(data,start,end);
		if(i == n){
			return data[n];
		}
		else{
			if(n>i){
				return quickSelectH(data,i,0,n-1);
			}
			return quickSelectH(data,i,n+1,data.length-1);
		}
	}

	public static int quickselect(int[]data, int i){
		return quickSelectH(data,i,0,data.length-1);
	}

	public static void quickHelper(int[] data, int start, int end){
		if(start == end) return;
    Random randgen = new Random();
		int randIndex = randgen.nextInt(end-start) + 1 + start;
		int value = data[randIndex];
		swap(data, randIndex, end);
		int st = start;
		int star = start;
		int en = end;
		while(st <= en){
	    	if(data[st] == value){
					st++;
				}else if(data[st] < value){
					swap(data, st, star);
					star++;
					st++;
	  }else{
			swap(data, st, en);
			en--;
	    }
	}

	if(star != 0){
	    quickHelper(data, start, star-1);
	}
	quickHelper(data, en, end);
    }

	public static void quicksort(int[] data){
		quickHelper(data,0,data.length -1);
	}

	public static void main(String[] arghhhhhhh){
        int[] pizza = {5,1,12,35,43,65,43,2,45};
				System.out.println(quickselect(pizza,0));
				quicksort(pizza);
				for(int i = 0; i < pizza.length;i++){
					System.out.println(pizza[i]);
				}
}


}

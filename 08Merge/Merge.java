public class Merge{

	public static void mergesort(int[] ary){
		int size = ary.length;
		if(size < 2) return;
		int half = size/2;
		int lSize = half;
		int rSize = size - half;
		int[] left = new int[lSize];
		int[] right = new int[rSize];
		for(int i = 0; i < half; i++){
			left[i] = ary[i];
		}
		for(int i = half; i < size; i++){
			right[i - half] = ary[i];
		}
		mergesort(left);
		mergesort(right);
		merge(left,right,ary);

	}

	public static void merge(int[] a, int[] b, int[] arry){
		int aSize = a.length;
		int bSize = b.length;
		int aIndex = 0, bIndex = 0, arryCounter = 0;
			while(aIndex < aSize && bIndex < bSize){
				if(a[aIndex] <= b[bIndex]){
					arry[arryCounter]= a[aIndex];
					aIndex++;
					//System.out.println(arry[arryCounter]);
					arryCounter++;
				}else{
					arry[arryCounter]= b[bIndex];
					bIndex++;
					//System.out.println(arry[arryCounter]);
					arryCounter++;
				}
			}
			while(aIndex < aSize){
					arry[arryCounter] = a[aIndex];
					aIndex++;
					//System.out.println(arry[arryCounter]);
					arryCounter++;
			}
			while(bIndex < bSize){
					arry[arryCounter] = b[bIndex];
					bIndex++;
					//System.out.println(arry[arryCounter]);
					arryCounter++;
			}

		}



	public static void main(String[] arghhhhh){
	int[] a = {1,3,5,7,9};
	int[] b = {1,2,4,7};
	int[] c = new int[a.length + b.length];
	merge(a,b,c);
	for(int i = 0; i < c.length; i++){
		System.out.print(c[i] + ", ");
	}

	int[] arr={1,4,6,13,5433,15,4,13,543,35435,2,3,5,56,4,234,5,65,4,3};
  mergesort(arr);
	for(int i = 0; i < arr.length; i++){
		System.out.print(arr[i] + ", ");
	}

}
}

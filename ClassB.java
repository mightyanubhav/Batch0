package tutorial.two;


public class ClassB {
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5};
		
		
		int lo = 0, hi = arr.length-1;
			
		while(lo<=hi) {
			int temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;
			
			lo++;
			hi--;
		}
		
		for(int x: arr) {
			System.out.println(x);
		}
	}
}

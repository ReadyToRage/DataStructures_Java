package SearchAlgos;

public class BinarySearch_Algorithms {

	public static void main(String[] args) {
		
		//1. It will pick the middle element in input and compare with target element
		//2. It will work only on the sorted elements

		int num[] = {1,2,3,4,5,6};
		int result = SearchBinary(num,3);
		System.out.println("int element found at index :"+result);
		
		
		/*********************************************/
		
		String [] arr = {"Apple","Ball","Cat","Dog"};		
		String res = SearchBinaryStr(arr,"Cat");		
		System.out.println("String element found at index :"+res);
		
	}

	public static int SearchBinary(int[] arr,int target) {
		int low = 0 , high = arr.length-1;
		while(low <= high ) {			
			int middle = low + (high-low) / 2;			
			if(arr[middle]==target) {
				return middle;
			}else if(arr[middle] > target){
				high = middle -1;
			}else {
				low = middle +1;
			}
		}
		return -1;
	}
	
	public static String SearchBinaryStr(String[] arr,String target) {		
		int low = 0 , high = arr.length-1;		
		while( low <= high ) {			
			int middle = low + (high-low) / 2;			
			if(arr[middle].compareTo(target) == 0) {
				return String.valueOf(middle);
			}else if(arr[middle].compareTo(target) < 0) {
				low = middle + 1;
			}else {
				high = middle - 1;
			}
		}		
		return "String not found";
	}
	
	
}

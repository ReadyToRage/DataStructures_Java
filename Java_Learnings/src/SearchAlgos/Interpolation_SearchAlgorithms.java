package SearchAlgos;

public class Interpolation_SearchAlgorithms {

	public static void main(String[] args) {
		
	//It will work on the sorted elements
	//It will find the position based on the formula
		
		/*********************************************/
		
		int num[] = {1,2,3,4,5,6};
		int result = Inter_Searchint(num,7);
		System.out.println("int element found at index :"+result);
				
		/*********************************************/
		
		String [] arr = {"Apple","Ball","Cat","Dog"};		
		String res = Interpolation_String(arr,"t");		
		System.out.println("String element found at index :"+res);
	}
		
	public static int Inter_Searchint(int[] arr,int target){		
		int low = 0 , high = arr.length-1;
		while( low <= high && target <= arr[high] && target >= arr[low]) {
			int position = low + ((target-arr[low])*(high-low))/(arr[high]-arr[low]);
			if(arr[position]==target) {
				return position;
			}else if(arr[position] > target) {
				high = position - 1;
			}else {
				low = position + 1;
			}			
		}
		return -1;
	}
	
	public static String Interpolation_String(String [] arr,String target) {		
		int low = 0 , high = arr.length-1;		
		while( low<= high && target.compareTo(arr[high]) < 0 && target.compareTo(arr[low]) > 0) {
			 int position = low + (target.compareTo(arr[low])* (high-low)) / (arr[high].compareTo(arr[low]));
			 if(arr[position]==target) {
				 return String.valueOf(position);
			 }else if(arr[position].compareTo(target) > 0) {
				 high = position - 1;
			 }else {
				 low = position + 1;
			 }
		}		
		return "String Not found";
	}

}

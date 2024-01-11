package JavaPrograms;

import java.util.Arrays;

public class MaxelementinArray {

	public static void main(String[] args) {
		
		int[] arr = {1,122,33,4,5,6,7};
		
		
		int maximumelementt = Getmax(arr);
		System.out.println("maximum element in an array is : Approach 1 :"+maximumelementt);
		int maximumelement = maxelement(arr);
		System.out.println("maximum element in an array is : Approach 2 :"+maximumelement);

	}
	
	//approach 1
	public static int maxelement(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
	//{1,122,33,4,5,6,7};
	public static int Getmax(int[] arr) {		
		int max=arr[0];		
		for(int i=0;i<arr.length-1;i++) {			
			if(arr[i] > max ) {
				max  = arr[i];
			}
		}		
		return max;
	}

}

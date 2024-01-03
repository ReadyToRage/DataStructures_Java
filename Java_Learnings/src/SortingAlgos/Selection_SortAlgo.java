package SortingAlgos;

import java.util.Arrays;

public class Selection_SortAlgo {

	public static void main(String[] args) {

		int num[] = {11,21,131,14,55,86};
		Selection(num);
		System.out.println(Arrays.toString(num));

		String[] st = {"Hi","Hello","How","Are","You","&^"};
		StrSelection(st);
		System.out.println(Arrays.toString(st));
	}

	public static void Selection(int[] arr) {
		int lengthofarray = arr.length;
		for(int i=0;i<lengthofarray-1;i++) {			
			int min = i;			
			for(int j=i+1;j<lengthofarray;j++) {				
				if(arr[j] < arr[min]) {
					min = j;
				}
			}			
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}		
	}

	public static void StrSelection(String[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j].compareTo(arr[min]) < 0 ) {
					min = j;
				}
			}
			String temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

}

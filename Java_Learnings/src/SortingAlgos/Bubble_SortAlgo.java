package SortingAlgos;

import java.util.Arrays;

public class Bubble_SortAlgo {

	public static void main(String[] args) {
		
		//Int
		int num[] = {11,21,131,14,55,86};
		SortBubble(num);
		System.out.println(Arrays.toString(num));
		
		//String 
		String[] str = {"d","r","h","v","a"};
		StrBubbleSort(str);
		System.out.println(Arrays.toString(str));
	}
	public static void SortBubble(int[] arr) {		
		int length = arr.length-1;		
		for(int i=0;i<length;i++) {
			for(int j=0;j<length-i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void StrBubbleSort(String[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j].compareTo(arr[j+1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}

}

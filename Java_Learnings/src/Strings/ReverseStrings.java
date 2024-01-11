package Strings;

import java.util.stream.IntStream;

public class ReverseStrings {

	public static void main(String[] args){
		String str = "Hello";
		System.out.println(usingrecursion(str));
		
		int num = 98765454;		
		int reverse=ReverseInteger(num);
		System.out.println(reverse);
		
		int[] arr = {1,2,3,4,5,6,7};

	
	
	}

	public static String ReverseString(String string){
		char[] str = string.toCharArray();             //1.Converting string to characters
		int low=0,high=str.length-1;          		
		while( low < high) {
			char temp = str[low];
			str[low] = str[high];
			str[high] = temp;
			low++;
			high--;
		}
		return new String(str);
	}
	
	public static int ReverseInteger(int number){		
		int reverse = 0;		
		while(number!=0) {			
			reverse = reverse * 10 + number % 10;
			number = number / 10;
		}		
		return reverse;		
	}
	
	public static int revint(int number){		
		String str1=ReverseInteger_1(Integer.toString(number));	
		return Integer.parseInt(str1);
	}
	
	public static String ReverseInteger_1(String num){
		char[] ch = num.toCharArray();		
		int low =0,high=ch.length-1;		
		while(low<high) {
			char temp=ch[low];
			ch[low]=ch[high];
			ch[high]=temp;
			low++;
			high--;
		}				
		return new String(ch);		
	}
	
	public static String Rev_Stringbuilder(String str){
		StringBuilder strb = new StringBuilder(str).reverse();
		return  strb.toString();		
	}
	
	public static String RevStringBuffer(String str) {
		StringBuffer strbu = new StringBuffer(str).reverse();
		return strbu.toString();
	}
	
	public static String usingrecursion(String str) {
		if(str.isEmpty()) {
			return str;
		}
		return usingrecursion(str.substring(1))+str.charAt(0);
	}

}

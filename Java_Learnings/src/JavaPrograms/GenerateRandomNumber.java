package JavaPrograms;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		// generate random number
		
		double randomnumber = Math.random();
		int n = (int)(randomnumber*10);
		System.out.println(n);
		
		//generate random object
		Random ran = new Random();
		double nu =  ran.nextDouble();
		System.out.println(nu);
		
		//select random value from array
		int[] num = {2,3,6,1,7,9,0};
		Random r = new Random();
		int array = r.nextInt(num.length);
		int index=num[array];
		System.out.println(index);
		
		
	}

}

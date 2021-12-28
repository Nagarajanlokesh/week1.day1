package week1.day1;

import java.util.Iterator;

public class FibonacciSeries {
	
	//0,1,1,2,3,8,13,21,34,55,89 like 0+1 =1, 1+2=3,3+2 = 5 
	

	public static void main(String[] args) {
		
		// 0 and 1 we should not calculated 
		
		int number1 = 0;
		int number2 = 1;
		int number3;
		
		System.out.println(number1);
		System.out.println(number2);
		
		// here we have already value for 1st two.so, we need to generated for remaining 8 so till 8 itration 
		
		
		for (int i = 1; i <=8; i++) {
			
		number3 = number1 + number2;
		System.out.println(number3);
		
		number1 = number2; 
		number2 = number3;
		// That means now number1 = 1 number2 = 1 number3= 1. so itration continuous till 8 
		
		
			
		}
		

		

	}

}

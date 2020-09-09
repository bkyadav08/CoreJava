package com.helloworld;

import java.util.Scanner;

public class FibonaciSeries {
	
	 public static void main(String[] args) {

		 int num, num1 = 0, num2 = 1;
	        System.out.println("How may numbers you want in the sequence:");
	        Scanner scanner = new Scanner(System.in);
	        num = scanner.nextInt();
	        scanner.close();
	        System.out.print("Fibonacci Series of "+num+" numbers:");

	        for (int i = 1; i <= num; i++)
	        {
	            System.out.print(num1+" ");

	            /* On each iteration, we are assigning second number
	             * to the first number and assigning the sum of last two
	             * numbers to the second number
	             */
	            int sumOfPrevTwo = num1 + num2;
	            num1 = num2;
	            num2 = sumOfPrevTwo;
	        }
	    }

		
       

}

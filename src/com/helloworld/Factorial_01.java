package com.helloworld;

import java.util.Scanner;

public class Factorial_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please Enter any number for its Factorial : ");
		int a = scan.nextInt();
		
		int fact = 1;
		
		for (int i = 1; i <= a; i++) {
			fact = fact*i;
		
			
		}
		
		System.out.println("Factorial is : "+ fact);
	
		scan.close();
		}



}
			

	

	



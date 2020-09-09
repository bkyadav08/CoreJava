package com.helloworld;

import java.util.Scanner;

public class SwapTwoNum {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Please enter First Number : ");
			int a = scan.nextInt();
			
			System.out.print("Please enter Second Number : ");
			int b = scan.nextInt();
			
			int c = a;
			a = b;
			b = c;
			
			
			
			
			System.out.println("The First Swap number is : " +a);
			
			
			System.out.println("The Second Swap number is : "+b);
			
			scan.close();
			
			
			}
}


/// get number from user and print in a table of a number.
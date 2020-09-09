package com.helloworld;

import java.util.Scanner;

public class Calculator_02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter First Number :");
		System.out.println("Please Enter Second Number :");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("\"Please Enter 1 for Addision\"\nPlease Enter 2 for Subrtaction");
		
		int c = scan.nextInt();
		
		int d = a+b;
		int e = a-b;
		int f = a*b;
		int g = a/b;
		int h = a%b;
		
		if(c==1) {
		System.out.println("The sum is = "+d);
		}
		
		else if(c==2) {
		System.out.println("The Difference is ="+e);
		}
		
		else if (c==3) {
		System.out.println("The Factors is ="+f);
		}
		
		else if (c==4) {
		System.out.println("The Quotient is ="+g);
		}
		
		else if(c==5) {
		System.out.println("The Remainder is ="+h);
		}
		
		else {
			System.out.println("Please Enter valid number");
		}
		scan.close();
		}
	
	

}

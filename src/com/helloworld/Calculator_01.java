package com.helloworld;

import java.util.Scanner;

public class Calculator_01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first num");
		System.out.println("Please enter second num");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("Please press 1 for addision or 2 for subtraction or 3 for multiplication or 4 for Division");
		 int c = scan.nextInt();
		 
		 int d = a+b;
		 int e = a-b;
		 int f = a/b;
		 int g = a*b;
		 
		 if(c==1) {
			 System.out.println("Addision "+d);
			 
		 }
		 
		 else if(c==2){
			 System.out.println("Difference"+e);
		 }
		 
		 else if(c==3) {
			 System.out.println("Multiplication"+g);
		 }
		 else if(c==4){
			 System.out.println("Division"+f);
		 }
		 else {
			 System.out.println("Please enter a valid number ");
		 }
		scan.close(); 
	}

}

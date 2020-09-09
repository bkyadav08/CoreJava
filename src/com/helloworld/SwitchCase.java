package com.helloworld;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter First Number :");
		
		
		int a = scan.nextInt();
		System.out.println("Please Enter Second Number :");
		int b = scan.nextInt();
		
		System.out.println("\"Please Enter 1 for Addision\"\nPlease Enter 2 for Subrtaction");
		
		int c = scan.nextInt();
		
		int d = a+b;
		int e = a-b;
		int f = a*b;
		int g = a/b;
		//int h = a%b;
		
	switch(c) {
	
	case 1: 
		System.out.println("The sum is = "+d);
		break;
	case 2: 
		System.out.println("The sub is = "+e);
		break;
	case 3: 
		System.out.println("The multi is = "+f);
		break;
	case 4: 
		System.out.println("The div is = "+g);
		break;
		
		default :
			System.out.println("please enter a valid number");
		
	}
	
	
	scan.close();
	
	}

	// loops
	
	
	//while
	//do while
	//for
	//starting
	//end condition
	// iterator (++/--)



}

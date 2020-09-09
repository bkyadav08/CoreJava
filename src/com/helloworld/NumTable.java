package com.helloworld;


import java.util.Scanner;

public class NumTable {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number :");
		int num = scan.nextInt();
		
		for (int i = 0; i <=10; i++) {
			
			int table = (num*10)-(num*i);
			System.out.println("The table of an input number is: "+table);
		}
		
		
		
		scan.close();
		
		
		
	}

}



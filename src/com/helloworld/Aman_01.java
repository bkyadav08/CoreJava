package com.helloworld;

import java.util.Scanner;

public class Aman_01 {
	
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter two new numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("The value of a = "+ a+ " The value of b = "+b);
		
		scan.close();
	}

}

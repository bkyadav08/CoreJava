package com.helloworld;

import java.util.Scanner;

public class Fab {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a Number: ");
		int a = scan.nextInt();
		int num = 0;
		
		for (int i = 1; i<=a; i++) {
			
				num = a+i ;
			}
		
		System.out.println("Fibonaci sequence");
		for (int i = 0; i <= a; i++) {
			
			System.out.print(num + " ");
		}
		scan.close();
		
	}

}

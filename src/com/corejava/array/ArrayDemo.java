package com.corejava.array;

import java.util.Scanner;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		int a[] = new int [12];
		//int b[] = {1,2,3,4,5,6};// It can also be written like this.
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			a[i]=scan.nextInt();
			
			System.out.println("Please enter the value : "+a[i]);
		}
		
		int c = 0;
		
		a[4]=0;//replace value to the given position i.e [4]
		for (int i = 0; i < 5; i++) {
			System.out.println("The value of I is :"+a[i]);
			 c = c+a[i];
			//System.out.println("The sum is  :"+c);
		}
		
		System.out.println("The sum is  :"+c);
		scan.close();
    }

}

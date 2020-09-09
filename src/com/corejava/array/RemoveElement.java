package com.corejava.array;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class RemoveElement {

	public static void main(String[] args) {
		int a[] = new int[12];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			a[i] = scan.nextInt();
			System.out.println("Please enter a value :" + a[i]);

		}
		System.out.println("What position value you want to remove :");
		int c = scan.nextInt();

		for (int i = c; i < 5; i++) {

			a[i] = a[i + 1];
		}

		for (int i = 0; i < 5; i++) {

			System.out.println("The new arry is :" + a[i]);

		}

		System.out.println("What position value you want to add :");
		int add = scan.nextInt();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				if (add == j) {
					a[i] = a[c];
				}
			}
		}

		for (int i = 0; i < 5; i++) {

			System.out.println("The new arry is :" + a[i]);

		}

	}

	// 1,2,3,5,6
	// user input
	// replace any value
	// delete any value

}

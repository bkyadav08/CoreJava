//4444
//3333
//2222
//1111


package com.helloworld;

public class Series_01 {
	
public static void main(String[] args) {
		
	for(int i=5; i>=1; i--) 
	{
		for(int j=1; j<=5; j++) 
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int k=5; k>=i; k--) 
		{
		System.out.print(" ");
		}
		
	}
	
	}
}
	

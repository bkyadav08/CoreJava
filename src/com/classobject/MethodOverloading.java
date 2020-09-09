package com.classobject;

public class MethodOverloading {
	void sum() {
		System.out.println("No parameter provided");
	}
	void sum(int a)
	{
		System.out.println("single parameter provided");
	}
	void sum(int a, int b) {
		System.out.println("two parameter provided");
		
		int sum=a+b;
		
		System.out.println("Sum = "+sum);
	}
	
	
	void sum(float a, float b) {
		System.out.println("two parameter provided");
		
		float sum=a+b;
		
		System.out.println("Sum = "+sum);
	}
	
	
	public static void main(String[] args) {
		
	MethodOverloading d = new MethodOverloading();
	
	d.sum();
	d.sum(5);
	d.sum(4,5);
	d.sum(5.5f,6.5f);
	
	
	}
	
}

// Same name but different parameters. 

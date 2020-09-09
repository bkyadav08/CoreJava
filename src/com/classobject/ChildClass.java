package com.classobject;

public class ChildClass extends ParentClass{

@Override
	 void sum(){
		System.out.println("My name is Child");
		
	}

@Override
void sum(int a, int b) {
	int c = a+b;
	System.out.println("Add is "+c);
	
}
	public static void main(String[] args) {
		
		
		ChildClass c = new ChildClass();
		c.sum();
		c.sum(5,6);
	
	}
	
}
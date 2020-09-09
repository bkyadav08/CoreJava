package com.abstraction;

public class MainAbtract extends AbstractClass {

	@Override
	void sum() {
		// TODO Auto-generated method stub
		System.out.println("This is sum method");
		
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("This is display");
		
	}
	public static void main(String[] args) {
		MainAbtract mainAbtract;
		mainAbtract=new MainAbtract();
		
		mainAbtract.sum();
		mainAbtract.display();
		
//AbstractClass abstractClass = new AbstractClass(); This cannot be done, since object is created without reference.
		
		AbstractClass abstractClass;
		abstractClass = new MainAbtract();// We can make parent class reference pointing to child class object.
		
		abstractClass.sum();
		abstractClass.display();
		
		}

}
//Abstract class is just a collection of methods i.e declaration of methods. It doesn't contain anything inside method.
// Abstract class object cannot be created. We need to make the reference of abstract class then object is created.
//Object class reference can be stored in parent class.







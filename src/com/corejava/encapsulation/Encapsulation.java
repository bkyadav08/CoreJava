package com.corejava.encapsulation;

public class Encapsulation {
	
	int a=10;
	int b=9;
	static int c=19;
	
	static void display() {
		System.out.println("Nothing");
		
	}
	public static void main(String[] args) {
		
	
		display();
		System.out.println(c);
	}

}


// Here We didn't made an object for the class.
// To call static variable and static function,
// we don't have to make object of class to call it. 
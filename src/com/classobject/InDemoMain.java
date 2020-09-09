package com.classobject;

public class InDemoMain extends InheritanceExample {
	{
		System.out.println("instance block is called");	
	}
	static {
		System.out.println("static block is called");
	}
	
	
	
	
	public static void main(String[] args) {
		
		InDemoMain c = new InDemoMain();
		c.run();
		
		//InheritanceExample d = new InheritanceExample();
		
		//c.sum();
		//c.add();
		
		
		
	}
	void run() {
		System.out.println("Class is running"+super.b);
		System.out.println("Class is running"+super.a);
		super.add();
		super.sum();
	}
		
		
}
//0,1,1,2,3,5,8...

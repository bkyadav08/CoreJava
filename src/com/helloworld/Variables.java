package com.helloworld;

public class Variables {
	
	public final int a = 9;
	public static int b = 98;
	
	public static void main(String[] args) {
		
		int c = 0;
		System.out.println(c);
		System.out.println(b);
		
		Variables vb = new Variables();
		System.out.println(vb.a);
		
		Car car = new Car();
		car.run(60);
		car.start();
		System.out.println(car.color);
		
		Car car1 = new Car(8, "White");
		car1.run(70);
		car1.start();
		System.out.println(car1.color);
		
		Car car2 = new Car(5, "Green");
		car2.run(80);
		car2.start();
		System.out.println(car2.color);
		
		}
	

}

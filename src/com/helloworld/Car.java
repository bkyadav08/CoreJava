package com.helloworld;

public class Car {
	public int wheel=5;
	public String color="Red";
	
	Car(){

	}
	
	public Car(int wheel, String color) {
		this.wheel=wheel;
		this.color=color;
		         
	}
	
	public void run(int speed) {
		System.out.println("Car is running at "+speed);
	}
	
	public void start() {
		System.out.println("Car has been Started.");
	}
	
	void property() {
		System.out.println("color = "+color);
		System.out.println("wheel = "+wheel);
		
		
	}
}
//0,1,1,2,3,5...- fibonaci Series
//factorial 
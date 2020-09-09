package com.helloworld;

public class While_01 {
	public static void main(String[] args) {
		int i = 7;
		while (i<10) 
		{
			System.out.println("Hello World"+i);
			++i;// this means i=i+1;
		}
		int j=10;
		System.out.println("j = "+j);
		System.out.println("++j = "+(++j));
		System.out.println("j++ = "+j++);
		System.out.println("j = "+j);
	}

}

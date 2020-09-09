package com.corejava.loops;

public class Loop1 {
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("i = "+i+" j = "+j);
				for (int k = 0; k < 5; k++) {
					System.out.println("k = "+k);
				}
			}
			System.out.println("-----------------------------------------i = "+i);
			
		}
	}

}

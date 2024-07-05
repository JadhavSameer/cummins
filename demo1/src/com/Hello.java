package com;

public class Hello {
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < 5000000; i++) {
			System.out.print("Hello World");			
			System.out.print("Hello World");			
			System.out.print("Hello World");			
		}
		System.out.println();
		long stop = System.currentTimeMillis();
		System.out.println(stop-start);

		long start2 = System.currentTimeMillis();
		for (int i = 0; i < 5000000; i++) {
//			System.out.print("Hello World");			
		}
		System.out.println();
		long stop2 = System.currentTimeMillis();
		System.out.println(stop2-start2);
	}
}

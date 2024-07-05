package com;

public class Calculator {

	int add(int a, int b) {
		System.out.println("a1");
		return a + b;
	}

	int add(long a, long b) {
		System.out.println("a3");
		return (int) (a + b);
	}

	int add(int a, int b, int c) {
		System.out.println("a2");
		return a + b + c;
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		int res = c.add(5L, 10L);
		System.out.println(res);
		res = c.add(5, 10, 20);
		System.out.println(res);
	}
}

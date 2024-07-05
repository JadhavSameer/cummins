package com;

interface Printable4 {
	void print();

	default void m2() {
		System.out.println("p m2");
	}
	static void m3() {
		System.out.println("p m3");
	}
}

interface Showable4 extends Printable4 {
	void print();

	default void m2() {
		System.out.println("s m2");
	}
	static void m3() {
		System.out.println("s m3");
	}
}

public class TestInterface4 implements Showable4 {

	void m1() {
		System.out.println("m1");
	}

	public static void main(String[] args) {
		Printable4 t = new TestInterface4();
		t.print();
		t.m2();
		Printable4.m3();
		Showable4.m3();

	}

	@Override
	public void print() {
		System.out.println("Print");
	}
}

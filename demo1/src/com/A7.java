package com;

interface Printable {
	void print();
	default void a() {
		System.out.println("Printable a");
	}
	static void b() {
		System.out.println("Printable b");
	}
}

interface Showable {
	void show();
	default void a() {
		System.out.println("Showable a");
	}
	static void b() {
		System.out.println("Showable b");
	}

}

public class A7 implements Printable, Showable {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	@Override
	public void a() {
//		Printable.super.a();
		System.out.println("A7 a");
	}

	public static void main(String args[]) {
		A7 obj = new A7();
		obj.print();
		obj.show();
		obj.a();
//		Showable.b();
	}
}
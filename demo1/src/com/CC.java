package com;

class AA {
	void m1() {
		System.out.println("m1");
	}
}

class BB {
	void m1() {
		System.out.println("m1");
	}
}

interface AAA {
	void m1();

	default void m2() {
		System.out.println("A m2");
	}
}

interface BBB {
	void m1();

	default void m2() {
		System.out.println("B m2");
	}
}

public class CC implements AAA, BBB {

	@Override
	public void m1() {
		System.out.println("CC");	
	}

	@Override
	public void m2() {
		AAA.super.m2();
	}

}

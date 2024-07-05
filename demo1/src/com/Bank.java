package com;

interface A1 {
	void a();

	void b();
}

abstract public class Bank implements A1 {
	@Override
	public void a() {
		System.out.println("Bank a");
	}

	public Bank() {
		System.out.println("Bank constructor");
	}

	abstract int getInterestRate();

	void displayBalance() {
		System.out.println("Bank balance");
	}
}

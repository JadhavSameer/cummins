package com;

public class BankTest {
	public static void main(String[] args) {
//		Bank b = new Bank(); // cannot instantiate abstract class
//		System.out.println(b.getInterestRate());

		Bank b1 = new SBI();
		System.out.println(b1.getInterestRate());		
		b1.displayBalance();
		b1.a();
		b1.b();
		
		ICICI b2 = new ICICI();
		System.out.println(b2.getInterestRate());
		b2.displayBalance();
		b2.a();
		b2.b();
		
	}
}

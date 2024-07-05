package com;

public class SBI extends Bank {
	@Override
	public int getInterestRate() {
		return 9;
	}

	@Override
	public void a() {
		System.out.println("SBI a");
	}

	@Override
	public void b() {
		System.out.println("SBI b");		
	}

}

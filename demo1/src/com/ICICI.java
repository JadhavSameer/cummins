package com;

public class ICICI extends Bank {
	@Override
	protected int getInterestRate() {
		return 10;
	}

	@Override
	public void b() {
		System.out.println("ICICI b");
	
	}
}

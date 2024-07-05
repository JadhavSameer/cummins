package com;

import java.io.IOException;

public class TestThrow1 {

	public static void validateAge(int age) throws IOException {
		if (age < 18) {

			// checked
			throw new IOException("Invalid");

			// unchecked
			// throw new ArithmeticException("Invalid age");

		} else {
			System.out.println("Valid");
		}
	}

	public static void main(String[] args) throws IOException {
		validateAge(15);
	}
}

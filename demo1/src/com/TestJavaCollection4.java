package com;

import java.util.*;

public class TestJavaCollection4 {
	public static void main(String args[]) {
		Stack<String> stack = new Stack<String>();
		stack.push("Ayush");
		stack.push("Garvit");
		stack.push("Amit");
		stack.push("Ashish");
		stack.push("Garima");
		String res = stack.pop();
		System.out.println(res);
		System.out.println(stack.pop());
		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
package com;

class InstanceInitializerBlockParent {
	static {
		System.out.println("parent static block1");
	}

	public InstanceInitializerBlockParent() {
		System.out.println("parent constructor");
	}
	{
		System.out.println("parent block1");
	}
}

public class InstanceInitializerBlock extends InstanceInitializerBlockParent {

	static {
		System.out.println("static block1");
	}
	
	public InstanceInitializerBlock() {
		System.out.println("constructor");
	}

	{
		System.out.println("block1");
	}

	public static void main(String[] args) {
		InstanceInitializerBlock block = new InstanceInitializerBlock();
	}
}

package sam;

public class OverLoadingScenarios {
	void m1(A a) {
		System.out.println("I am in m1 A");
	}

	void m1(B b) {
		System.out.println("I am in m1 B");
	}

	void m1(C c) {
		System.out.println("I am in m1 C");
	}
	
	public static void main(String[] args) {
		OverLoadingScenarios o = new OverLoadingScenarios();
		o.m1(new A());
	}
}
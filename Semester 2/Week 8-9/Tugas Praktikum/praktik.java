interface InterfaceA {
	void method1();
	void method2();
}

interface InterfaceB {
	void method3();
	void method4();
}

class Implement implements InterfaceA, InterfaceB {
	public void method1() {
		System.out.println("Implementasi method1");
	}

	public void method2() {
		System.out.println("Implementasi method2");
	}

	public void method3() {
		System.out.println("Implementasi method3");
	}

	public void method4() {
		System.out.println("Implementasi method4");
	}
}

public class praktik {
	public static void main(String[] args) {
		Implement impl = new Implement();
		impl.method1();
		impl.method2();
		impl.method3();
		impl.method4();
	}
}
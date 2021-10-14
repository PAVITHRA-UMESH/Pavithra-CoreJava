package Lab;

class A {
	public String classA_member;

	public void ShowA() {
		System.out.println("A is the Parent Class");
	}

}

class B extends A {
	public String classB_member;

	public void ShowB() {
		System.out.println("B is the Child Class of A");
	}

}

public class InheritDemo {

	public static void main(String[] args) {
		InheritDemo obj = new InheritDemo();
		A obj2 = new A();
		B obj3 = new B();
		obj3.ShowA();
		obj3.ShowB();

	}

}

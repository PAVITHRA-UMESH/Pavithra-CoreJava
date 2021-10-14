package Lab;

interface myA {
	public void meth1();

	public void meth2();
}

public class MyClass implements myA {

	@Override
	public void meth1() {

		System.out.println("THIS IS METHOD1");

	}

	@Override
	public void meth2() {

		System.out.println("THIS IS METHOD2");

	}

	public static void main(String[] args) {
		MyClass myobj = new MyClass();
		myobj.meth1();
		myobj.meth2();

	}

}

package Lab;

public class CallingDemo {

	private int data = 40;

	int change(int b) {
		++b;
		return b;
	}

	void change2(CallingDemo op) {
		op.data = op.data + 100;
	}

	public static void main(String[] args) {
		CallingDemo obj = new CallingDemo();
		CallingDemo op = new CallingDemo();
		System.out.println("CALL BY VALUE");

		int a = 201;
		int x = obj.change(a);
		System.out.println("Value of a after passing : " + a);
		System.out.println("Value of x after modifying : " + x);

		System.out.println("------------------------------------------");

		System.out.println("CALL BY REFERENCE");

		System.out.println("Before value : " + op.data);
		op.change2(op);
		System.out.println("After value : " + op.data);

	}
}

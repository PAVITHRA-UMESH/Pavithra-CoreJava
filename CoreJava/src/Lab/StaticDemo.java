package Lab;

public class StaticDemo {

	static int x = 1;
	static int y;

	static void calculate(int z) {
		System.out.println("x Value : " + x);
		System.out.println("y Value : " + y);
		System.out.println("z Value : " + z);
	}

	static {
		System.out.println("STATIC BLOCK");
		y = x + 10;
	}

	public static void main(String args[]) {
		calculate(20);
	}

}

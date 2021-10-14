package Lab;

public class TryCacheFinallyDemo {

	public static void main(String[] args) {
		int x = 50, y = 5, z = 10;
		int result;
		try {
			result = x / (y - z);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divided by zero!!!!!" + e);
		} finally {
			System.out.println("This is Finally Block!!!!!");
		}
		result = x / (y + z);
		System.out.println("Result is : " + result);

	}

}

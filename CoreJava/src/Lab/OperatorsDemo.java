package Lab;

public class OperatorsDemo {

	public static void main(String[] args) {
		int a = 10, b = 40, e = 4, f = 8, x = 5, y = 7;
		a++;
		b--;
		System.out.println("INCREMENT AND DECREMENT OPERATORS");
		System.out.println("Increment and Decrement of a and b : " + a + " " + b);

		System.out.println("-----------------------------------------------------------");

		System.out.println("BITWISE COMPLEMENT OPERATOR");
		System.out.println("Bitwise Complement of e : " + ~e);

		System.out.println("-----------------------------------------------------------");

		System.out.println("ARITHMETIC OPERATORS");
		System.out.println("Sum : " + (e + f));
		System.out.println("Difference : " + (e - f));
		System.out.println("Product : " + (e * f));
		System.out.println("Quotient : " + (f / e));

		System.out.println("-----------------------------------------------------------");

		System.out.println("RELATIONAL OPERATORS");
		if (e == f) {
			System.out.println("Equal");
		} else if (e >= f) {
			System.out.println("e is greater than or equal to f");
		} else if (e <= f) {
			System.out.println("e is lesser than or equal to f");
		}
		if (e != f) {
			System.out.println("e is not equal to f");
		}

		System.out.println("-----------------------------------------------------------");

		System.out.println("BITWISE OPERATORS");
		System.out.println("Bitwise AND of x and y : " + (x & y));
		System.out.println("Bitwise OR of x and y : " + (x | y));
		System.out.println("Left Shift of x : " + (x << 1));
		System.out.println("Right Shift of y : " + (y >> 1));
		System.out.println("Bitwise XOR of x and y : " + (x ^ y));

		System.out.println("-----------------------------------------------------------");

		System.out.println("CONDITIONAL OPERATORS");
		boolean m = true, n = false;
		if ((m && n) == true) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		String r = (x == y) ? "yes" : "no";
		System.out.println("Value of r : " + r);
		System.out.println("Conditional OR : " + (m || n));

	}

}

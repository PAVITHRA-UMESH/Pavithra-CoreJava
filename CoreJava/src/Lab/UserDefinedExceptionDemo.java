package Lab;

public class UserDefinedExceptionDemo {

	public static void main(String args[]) {
		try {
			throw new MyExceptionTest(4);
		} catch (MyExceptionTest e) {
			System.out.println(e);
		}
	}
	   
static class MyExceptionTest extends Exception//USER DEFINED EXCEPTION
{
	int x;

	MyExceptionTest(int y) {
		x = y;
	}

	public String toString() {
		return ("Exception Number : " + x);
	}
}
}

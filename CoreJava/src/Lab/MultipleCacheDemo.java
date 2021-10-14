package Lab;

public class MultipleCacheDemo {

	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} 
		//MULTIPLE CATCHE BLOCKS STARTS HERE
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs!!!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs!!!!");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs!!!!!");
		}
		//MULTIPLE CATCHE BLOCKS ENDS HERE
		System.out.println("Rest of the Code here");
	}
}

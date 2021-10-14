package Lab;

public class NegativeDemo {

	public static void main(String[] args) {

		try {
			int a[] = new int[-5];
			System.out.println("The First Element is : " + a[0]);
		} catch (NegativeArraySizeException n) {
			System.out.println("The Exception generated is : " + n);
		}
		System.out.println("After the try block");
	}

}


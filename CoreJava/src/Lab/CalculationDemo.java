package Lab;

public class CalculationDemo {

	public static void main(String[] args) {

		System.out.println("LENGTH OF ARRAY");
		int[] array1 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		System.out.println("The length of the given array is : " + array1.length);

		System.out.println("------------------------------------------");

		System.out.println("ONE DIMENSIONAL ARRAY");
		String[] str1 = new String[] { "JAVA", "PYTHON", "C", "DBMS", "C++" };
		for (int i = 0; i < str1.length; i++) {
			System.out.println("The Array Element in index" + i + " is " + str1[i]);
		}

		System.out.println("------------------------------------------");

		System.out.println("TWO DIMENSIONAL ARRAY");
		int array2[][] = new int[][] { { 1, 2 }, { 3, 4 } };
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(array2[i][j] + " ");
			}
		}

		System.out.println("------------------------------------------");

		System.out.println("MULTIDIMENSIONAL ARRAY");
		int[][][] array3 = { { { 1, -2, 3 }, { 2, 3, -4 }, { 1, 5, 7 } }, { { -4, -5, 6 }, { 1, 2, 5 }, { 7, 0, 2 } } };

		for (int[][] row : array3) {
			for (int[] col : row) {
				for (int item : col) {
					System.out.println(item);
				}
			}
		}
	}

}

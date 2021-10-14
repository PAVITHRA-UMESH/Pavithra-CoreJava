package Lab;

public class MatrixOperationsDemo {

	public static void main(String[] args) {
		int a[][] = { { 1, 5, 4 }, { 9, 4, 3 }, { 3, 8, 5 } };
		int b[][] = { { 1, 3, 4 }, { 7, 4, 3 }, { 1, 2, 4 } };
		int c[][] = new int[3][3];

		System.out.println("ADDITION OF MATRICES : ");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("---------------------------------");

		System.out.println("MULTIPLICATION OF MATRICES : ");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

}

package Session;

import java.util.Scanner;

public class PatternDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = scan.nextInt();
		int k = 1;
		for (int i = 0; i <= n; i++) {
			for (int j = i - 1; j < n * 2; j = j + 1) {
				System.out.print("  ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(k + "   ");
				k = k + 1;
			}
			System.out.println();
		}
	}
}

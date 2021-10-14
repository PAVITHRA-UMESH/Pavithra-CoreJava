package Lab;

import java.util.Scanner;

public class PrimeSumDemo {

	public static void main(String[] args) {
		PrimeSumDemo obj = new PrimeSumDemo();
		Scanner scan = new Scanner(System.in);

		System.out.println("PRIME NUMBER CHECKING");

		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		int m = num / 2, flag = 0;
		if (num == 0 || num == 1) {
			System.out.println(num + " is not a Prime Number!!!");
		} else {
			for (int i = 2; i < m; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not a Prime Number!!!");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(num + " is a Prime Number!!!");
			}

		}
		System.out.println("---------------------------------");

		System.out.println("SUM OF DIGITS");

		System.out.println("Enter the number : ");
		int number = scan.nextInt();
		int sum = 0, digit;
		while (number > 0) {
			digit = number % 10;
			sum = sum + digit;
			number = number / 10;
		}
		System.out.println("SUM  : " + sum);

	}

}

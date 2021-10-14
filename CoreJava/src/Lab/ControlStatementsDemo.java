package Lab;

import java.util.Scanner;

public class ControlStatementsDemo {

	public static void main(String[] args) {

		int y = 7;
		System.out.println("IF STATEMENT");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int x = scan.nextInt();
		if (x < y) {
			System.out.println("x is lesser than y ");
		} else if (x > y) {
			System.out.println("x is greater than y");
		} else {
			System.out.println("x is equal to y");
		}

		System.out.println("-----------------------------------------------------");

		System.out.println("SWITCH STATEMENT");

		System.out.println("Enter your choice : ");
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			System.out.println("You have selected the choice 1 ");
			break;
		case 2:
			System.out.println("You have selected the choice 2");
			break;
		default:
			System.out.println("Invalid choice");
		}

		System.out.println("-----------------------------------------------------");

		System.out.println("FOR LOOP");

		String str1 = "Hi Java";
		for (int i = 0; i < 5; i++) {
			System.out.println(str1);
		}

		System.out.println("-----------------------------------------------------");

		System.out.println("WHILE STATEMENT");

		System.out.println("Enter the value of a : ");
		int a = scan.nextInt();
		while (a <= 5) {
			a++;
			System.out.println("Value of a : " + a);
		}

		System.out.println("-----------------------------------------------------");

		System.out.println("DO WHILE LOOP");

		System.out.println("Enter b : ");
		int b = scan.nextInt();
		do {
			b--;
			System.out.println("b : " + b);
		} while (b > 10);

	}

}

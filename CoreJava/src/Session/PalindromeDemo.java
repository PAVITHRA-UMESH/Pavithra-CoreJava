package Session;

import java.util.Scanner;

public class PalindromeDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scan.nextInt();
		int r, sum = 0, temp;

		temp = n;
		while (n > 0) {
			r = n % 10; 
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("The Number is Palindrome!!!!!");
		else
			System.out.println("The Number is not a Palindrome!!!!!");
	}
}
			
				
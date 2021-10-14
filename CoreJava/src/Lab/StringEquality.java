package Lab;

import java.util.*;

public class StringEquality {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String1");
		String str1 = scan.next();
		System.out.println("Enter String2");
		String str2 = scan.next();

		if (str1.equalsIgnoreCase(str2) == true) {
			System.out.println("EQUAL");
		} else {
			System.out.println("NOT EQUAL");
		}

	}

}

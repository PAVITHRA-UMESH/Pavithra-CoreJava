package com.MyBank2;

import java.util.*;

public class EnterBOption {

	Scanner sc = new Scanner(System.in);

	int selectOption() {

		System.out.println("==========================");
		System.out.println("      BANK OF MYBANK      ");
		System.out.println("==========================");
		System.out.println("1. REGISTER ACCOUNT");
		System.out.println("2. LOGIN");
		System.out.println("3. UPDATE ACCOUNT");
		System.out.println("4. EXIT");

		System.out.print("ENTER YOUR CHOICE : ");
		int opt = sc.nextInt();
		if (opt <= 0 || opt > 5) {
			System.out.println("PLEASE CHOOSE CORRECT OPTION !! " + opt + " NOT FOUND!!!");
			selectOption();
		} else {
			return opt;
		}
		return 0;

	}

	int userOption() {

		System.out.println("-----------------------");
		System.out.println("     W E L C O M E     ");
		System.out.println("-----------------------");
		System.out.println("1. DEPOSIT");
		System.out.println("2. SHOW BALANCE");
		System.out.println("3. TRANSFER");
		System.out.println("4. LAST 5 TRANSACTIONS");
		System.out.println("5. USER INFORMATION");
		System.out.println("6. LOGOUT ");
		// Scanner sc = new Scanner(System.in);
		System.out.print("ENTER YOUR CHOICE : ");
		int uopt = sc.nextInt();
		System.out.println();
		if (uopt <= 0 || uopt > 6) {
			System.out.println("PLEASE CHECK THE OPTION !! " + uopt + " NOT FOUND!!!");
			selectOption();
		} else {
			return uopt;
		}
		return 0;

	}

}

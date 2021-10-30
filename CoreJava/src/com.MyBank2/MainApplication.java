package com.MyBank2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class MainApplication {

	static List<Users> users1 = new ArrayList<Users>();

	static void selectOpt() throws FileNotFoundException, IOException, ClassNotFoundException {
		EnterBOption Eo = new EnterBOption();
		int option = Eo.selectOption();
		switch (option) {
		case 1:
			// Registering into account
			RegisterAccount rg = new RegisterAccount(users1);
			rg.enterDetails();
			selectOpt();
			break;
		case 2:
			// Logging in
			Login lg = new Login();
			lg.loginAcc();
			selectOpt();
			break;
		case 3:
			// Updation of Account
			@SuppressWarnings("unused")
			UpdateAccount ua = new UpdateAccount();
			System.out.println("ACCOUNT UPDATED SUCCESSFULLY!!!");
			selectOpt();
			break;
		case 4:
			System.out.println("YOU EXIT FROM THE CONSOLE APPLICATION!!!!!");
			System.out.println("THANK YOU!!!!!");
			break;
		}

	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		selectOpt();
	}

}

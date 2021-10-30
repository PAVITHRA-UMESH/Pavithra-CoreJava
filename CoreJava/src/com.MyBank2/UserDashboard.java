package com.MyBank2;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDashboard {

	Scanner sc = new Scanner(System.in);
	int depamt;
	int tramt;
	String payuname;
	String username;

	public static ArrayList<String> transactions1;
	Users u;

	public UserDashboard(String username) {
		this.username = username;
	}

	public UserDashboard(ArrayList<String> transactions2) {
		transactions1 = transactions2;

	}

	void Dashboard() throws FileNotFoundException, IOException, ClassNotFoundException {
		EnterBOption Eo = new EnterBOption();
		int option1 = Eo.userOption();

		switch (option1) {
		case 1:
			deposit();
			Dashboard();
			break;
		case 2:
			viewbalance();
			Dashboard();
			break;
		case 3:
			transfer();
			Dashboard();
			break;
		case 4:
			for (String transaction : transactions1) {
				System.out.println(transaction);
			}
			Dashboard();
			break;
		case 5:
			userInfo();
			Dashboard();
			break;
		case 6:
			System.out.println("TRANSACTION SUCCESSFUL!!!");
			MainApplication.selectOpt();
			break;
		}
	}

	private void viewbalance() throws FileNotFoundException, IOException, ClassNotFoundException {
		@SuppressWarnings("resource")
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("MyResources/MyBankUsers.db"));

		while (true) {
			Users use = (Users) ois.readObject();
			if (use.getUsername().equals(username)) {
				System.out.println("Your Bank Balance:" + use.getBalance());
				break;
			}

		}

	}

	/*
	 * Deposit to user account by reading object and again write objects from
	 * MyBankUsers.db file and store
	 */

	void deposit() throws FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println("ENTER AMOUNT : ");
		depamt = sc.nextInt();
		List<Users> userlist = new ArrayList<Users>();// Created one list and read all objects to it
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("MyResources/MyBankUsers.db"));

		try {
			while (true) {
				Users user = (Users) ois.readObject();
				userlist.add(user);
			}

		} catch (EOFException e) {

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (Users user : userlist) {
			if (user.username.equals(username)) {

				user.balance = user.balance + depamt;
				LocalDateTime date = LocalDateTime.now(); // java 8 feature LocalDateTime
				DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("yyyy-mm-dd hh:mm:ss");
				String initdate = date.format(dateformat);
				addTransaction(String.format(
						depamt + " CREDITED TO YOUR ACCOUNT. BALANCE = " + user.balance + " AS ON " + initdate));
				System.out.println(depamt + " DEPOSITED SUCCESSFULLY TO " + user.name);

			}
		}
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("MyResources/MyBankUsers.db"));
		for (Users u : userlist)
			oos.writeObject(u);
		oos.close();
		ois.close();

	}

	void userInfo() throws FileNotFoundException, IOException {

		@SuppressWarnings("resource") // Java 8 feature annotation
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("MyResources/MyBankUsers.db"));
		List<Users> lst = new ArrayList<Users>();
		try {
			while (true) {
				Users user = (Users) ois.readObject();
				lst.add(user);
			}

		} catch (EOFException e) {

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Java 8 feature filter ,stream usage
		System.out.println("<<--ACCOUNT HOLDER DETAILS-->>");
		lst.stream().filter(el -> el.getUsername().equals(username))
				.forEach(ele -> System.out.println(" ACCOUNT HOLDER NAME : " + ele.getName()
						+ "\n ACCOUNT HOLDER ADDRESS : " + ele.getAddress() + "\n ACCOUNT HOLDER CONTACT :"
						+ ele.getContactno() + "\n ACCOUNT HOLDER USERNAME :" + ele.getUsername()));

	}

	public void addTransaction(String message) {
		transactions1.add(0, message);
		if (transactions1.size() > 5) {
			transactions1.remove(5);
			transactions1.trimToSize();
		}

	}

	void transfer() throws FileNotFoundException, IOException {
		System.out.print("ENTER PAYEE NAME : ");
		payuname = sc.next();
		System.out.print("ENTER THE AMOUNT TO BE TRANSFERRED : ");
		tramt = sc.nextInt();
		int f = 0;
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("MyResources/MyBankUsers.db"));
			List<Users> userlist = new ArrayList<Users>();// Created one list and add all objects to it

			try {
				while (true) {
					Users user = (Users) ois.readObject();
					userlist.add(user);
				}

			} catch (EOFException e) {

			} catch (IOException e) {

				e.printStackTrace();
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}

			ois.close();

			for (Users ul : userlist) {
				if (ul.username.equals(payuname)) {

					// user.balance = user.balance + tramt;
					System.out.println(tramt + " IS TRANSFERRED TO " + payuname + ".");
					LocalDateTime date1 = LocalDateTime.now(); // Java 8 feature LocalDateTime
					DateTimeFormatter dateformat1 = DateTimeFormatter.ofPattern("yyyy-mm-dd hh:mm:ss");
					String initdate1 = date1.format(dateformat1);
					addTransaction(String.format(tramt + " TRANSFERRED TO " + payuname + " AS ON " + initdate1));

					ul.balance = ul.balance + tramt;

					for (Users el : userlist) {
						if (el.username.equals(username)) {
							el.balance = el.balance - tramt;
							System.out.println("YOUR BALANCE IS : " + el.balance);
							f = 1;
						}
					}
				}

			}
			if (f == 1) {
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("MyResources/MyBankUsers.db"));
				for (Users u : userlist)
					oos.writeObject(u);
				oos.close();
			}
			if (f == 0) {
				System.err.println("USER DOES NOT EXISTS!!!");
			}

		} catch (EOFException e) {

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}

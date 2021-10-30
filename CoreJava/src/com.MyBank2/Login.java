package com.MyBank2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Login {

	String username;
	String password;
	Scanner sc = new Scanner(System.in);

	void loginAcc() throws FileNotFoundException, IOException, ClassNotFoundException {

		System.out.print("ENTER USERNAME : ");
		username = sc.next();
		System.out.print("ENTER PASSWORD : ");
		password = sc.next();
		int f = 0;
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("MyResources/MyBankUsers.db"));
		List<Users> userlist = new ArrayList<Users>();

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

		ois.close();
		Base64.Decoder decoder = Base64.getDecoder();// Java 8 feature Base64 ecryption and decryption

		for (Users user : userlist) {
			String decypassword = new String(decoder.decode(user.getPassword()));
			if (user.getUsername().equals(username) && decypassword.equals(password)) {
				f = 1;

				UserDashboard ud = new UserDashboard(username);
				System.out.println("LOGIN SUCCESSFUL!!!");
				ud.Dashboard();
			}
		}
		if (f == 0) {
			System.err.println("USER DOES NOT EXISTS!!!");
			loginAcc();
		}

	}

}

package com.MyBank2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class UpdateAccount {

	Scanner sc = new Scanner(System.in);

	void updateuser() throws FileNotFoundException, IOException {
		System.out.println("ENTER USERNAME : ");
		String uname = sc.next();
		System.out.println("ENTER PASSWORD : ");
		String pswrd = sc.next();

		List<Users> userlist = new ArrayList<Users>();// Created one list and read all objects to it
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("MyResources/MyBankUsers.db"));

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

		for (Users user : userlist) {
			Base64.Decoder decoder = Base64.getDecoder();// Java 8 feature Base64 ecryption and decryption
			String decypassword = new String(decoder.decode(user.getPassword()));

			if (user.username.equals(uname) && decypassword.equals(pswrd)) {
				System.out.println("ENTER THE NAME TO BE UPDATED : ");
				String name = sc.next();
				System.out.println("ENTER THE ADDRESS TO BE UPDATED : ");
				String Address = sc.next();
				System.out.println("ENTER THE CONTACT NUMBER TO BE UPDATED : ");
				String contactno = sc.next();
				System.out.println("ENTER THE PASSWORD TO BE UPDATED : ");
				String password = sc.next();

				user.name = name;
				user.address = Address;
				user.contactno = contactno;
				Base64.Encoder encoder = Base64.getEncoder(); // Java 8 feature Base64 ecryption and decryption
				String encyPassword = encoder.encodeToString(password.getBytes());
				user.password = encyPassword;

			}

		}

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("MyResources/MyBankUsers.db"));
		for (Users u : userlist)
			oos.writeObject(u);
		oos.close();
		ois.close();
	}
}

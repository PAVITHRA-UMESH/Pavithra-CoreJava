package Session;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentTask {
	int stid;
	String stname, email, mobile;

	public StudentTask(int stid, String stname, String email, String mobile) {
		this.stid = stid;
		this.stname = stname;
		this.email = email;
		this.mobile = mobile;
	}

	public void show() {
		System.out.println("ID : " + stid + ", NAME : " + stname + ", EMAIL ID : " + email + ", MOBILE : " + mobile);
	}

	public void show1() {
		System.out.println("ID : " + stid + ", NAME : " + stname + ", EMAIL ID : " + email + ", MOBILE : " + mobile);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String emailpat = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		StudentTask[] St = new StudentTask[5];
		System.out.println("ENTER 5 STUDENT DETAILS : ID   NAME   EMAIL-ID   MOBILE-NUMBER");

		for (int i = 0; i < 5; i++) {
			int sid = sc.nextInt();
			String na = sc.next();
			String em = sc.next();
			String mob = sc.next();
			if (em.matches(emailpat) && mob.matches("\\+?\\d{10}"))
				St[i] = new StudentTask(sid, na, em, mob);
			else {
				System.out.println("Please check your Email id or Mobile number!!!");
				break;
			}
		}

		try {

			System.out.println("Details of Students whose Mobile number starts with 98 : ");
			for (StudentTask std : St) {

				if (std.mobile.startsWith("98")) {

					std.show();

				}

			}
			int count = 0;
			System.out.println("Student's Email id from mail");
			for (StudentTask std : St) {
				Pattern p = Pattern.compile("@g(oogle)?mail\\.com$");
				Matcher m = p.matcher(std.email);
				if (m.find())

					std.show();
				else {

					count++;

				}
			}
			System.out.println("");
			System.out.println(" Number of Students whose email id is not from gmail is : " + count);

		} catch (Exception e) {
			System.out.println(" Make sure you have entered right Email id and Mobile Number!!!!!");
		}

	}
}
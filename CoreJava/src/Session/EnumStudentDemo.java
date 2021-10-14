package Session;

import java.util.Scanner;

class MyStudent {
	int stid;
	String stname;
	Subject s;
	int marks;

	public MyStudent(int stid, String stname, Subject s, int marks) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.s = s;
		this.marks = marks;
	}
}

public class EnumStudentDemo {

	public static void main(String[] args) {
		MyStudent s1 = new MyStudent(11, "Kushal", Subject.JAVA, 1000);
		MyStudent s2 = new MyStudent(12, "Ravish", Subject.CPP, 700);
		MyStudent s3 = new MyStudent(13, "Aruna", Subject.C, 400);
		MyStudent s4 = new MyStudent(14, "Brunda", Subject.PYTHON, 800);
		MyStudent s5 = new MyStudent(14, "Chaya", Subject.C, 900);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Subject to display the respective Student : ");
		MyStudent sm[] = {s1, s2, s3,s4,s5};
		String sub = sc.next().toUpperCase();
		//Subject s;
		System.out.println("Details of Student : ");
		for (MyStudent std : sm) {
			if (Subject.valueOf(sub)==(std.s)) {
				System.out.println("STUDENT ID : "+std.stid+", STUDENT NAME : " + std.stname + ", SUBJECT : " + std.s+", MARKS : "+std.marks );
			}
		}

	}

}

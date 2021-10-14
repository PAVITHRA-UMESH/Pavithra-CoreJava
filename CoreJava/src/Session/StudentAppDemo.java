package Session;

import java.util.Scanner;

public class StudentAppDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students that you want to add");
		int numstd = sc.nextInt();
		StudentDemo std[];
		std = new StudentDemo[numstd];

		int stdid, stdmarks;
		String stdname, stdcourse;
		int k = 0;
		for (int i = 0; i < numstd; i++) {
			System.out.println("Enter Student " + (++k) + " details : ");
			System.out.println("ID-----NAME-----COURSE-----MARKS");
			stdid = sc.nextInt();
			stdname = sc.next();
			stdcourse = sc.next();
			stdmarks = sc.nextInt();
			std[i] = new StudentDemo(stdid, stdname, stdcourse, stdmarks);
		}
		System.out.println("Students having more than" + " 60 " + "marks in BCA");
		for (int i = 0; i < numstd; i++) {
			if (std[i].marks > 60 && std[i].course.equals("BCA")) {
				System.out.println("ID : " + std[i].stid + " ,  NAME : " + std[i].name + ", COURSE : " + std[i].course
						+ " , MARKS : " + std[i].marks);
			}
		}
	}

}

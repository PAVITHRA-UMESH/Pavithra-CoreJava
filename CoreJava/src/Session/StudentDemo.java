package Session;

public class StudentDemo {

	int stid;
	String name;
	String course;
	int marks;

	public StudentDemo(int stid, String name, String course, int marks) {
		this.stid = stid;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}

	public void show() {
		System.out.println("Stid : " + stid + "--Name : " + name + "--Course : " + course + "--Marks : " + marks);
	}

	public static void main(String[] args) {
		StudentDemo student = new StudentDemo(123, "Pavithra", "B.E", 1000);
		student.show();

	}

}

package Lab;

public class ThisDemo {

	String name;

	public ThisDemo(String name) {
		this.name = name;
	}

	void display(String name) {
		System.out.println("My name is " + name);
	}

	public ThisDemo getDemo() {
		return this;
	}

	void msg() {
		System.out.println("Hello java");
	}

	public static void main(String args[]) {

		System.out.println("THIS KEYWORD");
		ThisDemo demo = new ThisDemo("name");
		demo.display("Pavithra");

		System.out.println("------------------------------");

		System.out.println("THIS AS A RETURN");
		demo.getDemo().msg();
	}
}
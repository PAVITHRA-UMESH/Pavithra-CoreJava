package Lab;

public class SimpleObject {

	SimpleObject() {
		System.out.println("This is the constructor with no parameters!!!");
	}

	SimpleObject(String str) {
		str = "Hi Constructor";
		System.out.println(str);
	}

	public static void main(String[] args) {

		new SimpleObject();
		new SimpleObject("obj");

	}

}
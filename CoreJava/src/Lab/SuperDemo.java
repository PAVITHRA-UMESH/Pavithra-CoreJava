package Lab;

class Flower {
	String color = "White";
}

class Rose extends Flower {
	String color = "Red";

	void Color() {
		System.out.println("COLOR : "+color);
		System.out.println("----------SUPER KEYWORD----------");
		System.out.println("COLOR : "+super.color);
	}
}

public class SuperDemo {

	public static void main(String args[]) {
		Rose rose = new Rose();
		rose.Color();
	}
}
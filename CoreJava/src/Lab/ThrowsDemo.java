package Lab;

import java.io.*;

public class ThrowsDemo {

	void check() throws IOException {
		System.out.println("Checking Machine!!!!!");
	}

	public static void main(String[] args) throws IOException {
		ThrowsDemo demo = new ThrowsDemo();
		demo.check();
		System.out.println("CHECKED SUCCESSFULLY!!!!!");
	}

}

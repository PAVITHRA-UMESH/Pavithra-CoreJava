package Lab;

import java.io.*;

public class ExceptionPrecedence {

	void msg() throws ArithmeticException {
		System.out.println("Parent method!!!!!");
	}

	public static void main(String args[]) {

		ExceptionPrecedence p = new ExceptionChild();

		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}
      
   
    
class ExceptionChild extends ExceptionPrecedence {

	void msg() throws ArithmeticException {
		System.out.println("Child method!!!!!");
	}
}

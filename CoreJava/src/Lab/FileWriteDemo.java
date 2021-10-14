package Lab;

import java.io.*;
import java.io.FileOutputStream;

public class FileWriteDemo {

	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("MyFiles/SampleWrite.txt");
			String s = "Hi!!! This is Pavithra.";
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("SUCCESSFUL!!!!!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

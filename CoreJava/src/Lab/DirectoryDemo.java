package Lab;

import java.io.File;
import java.io.IOException;

public class DirectoryDemo {

	public static void main(String[] args) throws IOException{
		File f = new File("MyFiles/MyDirectory.txt");
		if (f.mkdir())
			System.out.println("Directory has been created!!!");
		else
			System.out.println("Unable to create a directory!!!!!");
	}

}

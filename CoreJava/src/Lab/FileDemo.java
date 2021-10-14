package Lab;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		
		 File f1 = new File( "c:\\java", "abc.txt") ; 
		 System.out.println("File name : " + f1.getName()); 
		 System.out.println("Path : "+ f1.getPath()); 
		 System.out.println("Absolute path : "+f1.getAbsolutePath()); 
		 System.out.println(f1.exists() ? "File exists" : "File does not exists"); 
		 System.out.println(f1.isDirectory() ? "File is a directory": "File is not"+ " a directory"); 
		 System.out.println(f1.isFile()? "File is an ordinary file": "File may be a named pipe") ; 
		 
		 } 
		 
}

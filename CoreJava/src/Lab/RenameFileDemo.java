package Lab;

import java.io.File;

public class RenameFileDemo {

	public static void main(String[] args) {
		for (int i = 0; i<args.length; i++) 
		 { 
		 File f = new File("MyFiles", args[i]); 
		 File f1 = new File("MyFiles/Demo.txt"); 
		 if (f.exists()) 
		 { 
		 System.out.println(f + " Does exists!!!"); 
		 System.out.println("Its size is " + f.length()+ " bytes"); 
		 f.renameTo(f1); 
		 System.out.println("Renamed file name : " + f1 + (i+1)); 
		 System.out.println("Deleting the renamed file "+f1+(i+1)); 
		 
		 System.out.println ("-----------------------------------------"); 
		 
		 f.delete(); 
		 } 
		 else 
		 System.out.println(f+" "+"Does not exists!!!"); 

	}

}
}

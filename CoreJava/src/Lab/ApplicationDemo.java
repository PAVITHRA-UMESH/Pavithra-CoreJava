package Lab;

import java.io.*;

public class ApplicationDemo {

	public static void main(String[] args) throws IOException {

		Runtime rt;
		rt = Runtime.getRuntime();
		System.out.println(rt.freeMemory());
		int x[] = { 1 };
		rt.gc();
		System.out.println(rt.freeMemory());
		Process p = rt.exec("pbrush.exe");
		System.out.println(rt.freeMemory());
	}

}

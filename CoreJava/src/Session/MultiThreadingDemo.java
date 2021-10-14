package Session;

class Thread1 extends Thread {

	String str;

	public Thread1(String str) {
		super();
		this.str = str;
	}

	@Override
	public void run() {
		try {
			System.out.println(
					"Thread1 reverses the string" + " Java is nice " + "in order with pause of 2 seconds : Wait!!!");
			int n = str.length();
			// Creating a character array of the same size as that of string
			char[] temp = new char[n];
			// Filling character array backward with characters in the string
			for (int i = 0; i < n; i++) {
				temp[n - i - 1] = str.charAt(i);
			}
			Thread.sleep(2000);
			System.out.println(String.copyValueOf(temp));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

class Thread2 extends Thread {
	String str;

	public Thread2(String str) {
		super();
		this.str = str;
	}

	@Override
	public void run() {
		try {
			System.out.println(
					"Thread2 executes" + " Java is nice " + "with alternate characters with pause of 1 second!!!");
			int n = str.length();

			// Creating a character array of the same size as that of string
			char[] temp = new char[n];
			// Filling character array backward with characters in the string
			for (int i = 0; i < n; i = i + 2) {
				temp[i] = str.charAt(i);
			}
			Thread.sleep(1000);
			System.out.println(String.copyValueOf(temp)); // j v s n c
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

public class MultiThreadingDemo {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1("Java is nice");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println();

		Thread2 t2 = new Thread2("Java is nice");
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

}

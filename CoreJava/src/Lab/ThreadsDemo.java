package Lab;

public class ThreadsDemo implements Runnable {
	Thread t;

	ThreadsDemo() {
		t = new Thread(this, "Test thread");
		System.out.println("Child thread : " + t);
		t.start();
	}

	public void run() {
		try {
			for (int i = 5; i < 0; i--) {
				System.out.println("Child thread : " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
		}
		System.out.println("Exiting child thread ");
	}

	public static void main(String args[]) {
		ThreadsDemo i = new ThreadsDemo();
		try {
			for (int j = 5; j > 0; j--) {
				System.out.println("Main thread : " + j);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
		}
		System.out.println("Main thread exiting");
	}
}
package Lab;

public class ThreadPriority extends Thread {

	private int delay;

	ThreadPriority(String name, float seconds) {
		super(name);
		delay = (int) seconds * 1000;
		start();
	}

	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				return;
			}
		}
	}

	public static void main(String[] args[]) {

		new ThreadPriority("one", 1.1F);
		new ThreadPriority("two", 1.3F);
		new ThreadPriority("three", 0.5F);
		new ThreadPriority("four", 0.7F);
	}
}

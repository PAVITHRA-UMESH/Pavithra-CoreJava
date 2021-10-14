package Lab;

public class InventoryDemo {

		static int qoh = 800;
		static int req = 0;

		static public synchronized void request(int order) {
			if (order <= qoh) {
				System.out.println("Quantity ordered : " + order);
				qoh -= order;
				req += order;
				System.out.println("Quantity on hand : " + qoh);
				System.out.println("Total quantity taken away by way of order : " + req);
			} else {
				System.out.println("Ordered quantity more than quantity on hand");
			}
		}

		public static void main(String args[]) {
			new OurThread();
			new OurThread();
			try {
				for (int p = 3; p > 0; p--) {
					System.out.println("-------------------------------");
					System.out.println("Main thread : " + p);
					System.out.println("-------------------------------");
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
			}

			System.out.println("Exiting main thread!!!!!");
		}
	}

	class OurThread extends Thread {
		OurThread() {
			super("test thread");
			System.out.println("Child thread :" + this);
			start();
		}

		public void run() {
			for (int i = 7; i > 0; i--) {
				try {
					sleep(100);
				} catch (InterruptedException e) {
				}

				InventoryDemo.request((int) (Math.random() * 100));
			}
		}
	}

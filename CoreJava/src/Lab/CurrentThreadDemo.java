package Lab;

public class CurrentThreadDemo {

	public static void main(String[] args) {
		
		Thread mythread = Thread.currentThread();
		System.out.println("Current thread : " + mythread);
		System.out.println("Name of the current thread : " + mythread.getName());
		System.out.println("Priority : " + mythread.getPriority());
		mythread.setName("MyThread");
		System.out.println("After name change : " + mythread);
		mythread.setPriority(2);
		System.out.println("After priority change : " + mythread);

		System.out.println("Number of active thread : " + mythread.activeCount());
	}

}

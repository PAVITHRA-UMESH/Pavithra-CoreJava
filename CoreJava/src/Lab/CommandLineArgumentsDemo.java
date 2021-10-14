package Lab;

public class CommandLineArgumentsDemo {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		String name;
		CommandLineArgumentsDemo obj = new CommandLineArgumentsDemo();
		int invalid = 0;
		int result = 0;
		try {
			result = a + b;
		} catch (NumberFormatException e) {
			invalid++;
		}
		System.out.println("Total no.of arguments: " + args.length);
		System.out.println("The Sum is: " + result);
		System.out.println("Invalid Integers: " + invalid);

		System.out.println("-------------------------------");

		System.out.println("My name is " + args[2]);
	}

}

package Lab;

class Animal {
	public void sound() {
		System.out.println("All animals have their own sounds!!!!!");
	}
}

class Dog extends Animal {
	public void sound() {
		System.out.println("Dogs bark!!!!!");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {

		OverridingDemo ob = new OverridingDemo();
		System.out.println("----------OVERRIDING----------");
		Animal ob2 = new Animal();
		Dog ob3 = new Dog();
		ob3.sound();

	}

}

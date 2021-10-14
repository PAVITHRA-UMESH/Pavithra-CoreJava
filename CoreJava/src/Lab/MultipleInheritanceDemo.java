package Lab;

interface AnimalEat {
	void eat();
}

interface AnimalTravel {
	void travel();
}

class MyAnimal implements AnimalEat, AnimalTravel {
	public void eat() {
		System.out.println("Animal is Eating");
	}

	public void travel() {
		System.out.println("Animal is Travelling");
	}
}

    public class MultipleInheritanceDemo {

	public static void main(String args[]) {
		MyAnimal a = new MyAnimal();
		a.eat();
		a.travel();
	}
}

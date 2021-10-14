package Session;

class Shape {
	void area() {
		System.out.println("The Area of the shapes can be found!!!");
	}

	void draw() {
		System.out.println("We can draw the shapes using co-ordinates!!!");
	}
}

class Circle extends Shape {
	int r;

	void area(int r) {
		System.out.println("Area of Circle : " + 3.14 * r * r);
	}

	void draw() {
		System.out.println("We are drawing Circle!!!");
	}
}

class Triangle extends Shape {
	double b, h;

	public Triangle(double b, double h) {
		super();
		this.b = b;
		this.h = h;
	}

	void area() {
		System.out.println("Area of Triangle : " + 0.5 * b * h);
	}

	void draw() {
		System.out.println("We are drawing Traingle!!!");
	}
}

class Square extends Shape {
	int a;

	public Square(int a) {
		super();
		this.a = a;
	}

	void area() {
		System.out.println("Area of Square : " + a * a);
	}

	void draw() {
		System.out.println("We are drawing Square!!!");
	}
}

public class InheritancePolymorphismDemo {

	public static void main(String[] args) {
		
		Shape s = new Shape();
		s.area();
		s.draw();
		
		System.out.println("-----------------------------");
		
		Circle c = new Circle();
		c.area(8);
		c.draw();
		
		System.out.println("-----------------------------");
		Triangle t = new Triangle(7, 5);
		t.area();
		t.draw();
		
		System.out.println("-----------------------------");
		Square sq = new Square(15);
		sq.area();
		sq.draw();

	}

}

package Lab;

class Box {
	public int length;
	public int breadth;

	public Box() {
		length = 0;
		breadth = 0;
	}

	public Box(int x, int y) {
		length = x;
		breadth = y;
	}

	public void setval(int x, int y) {
		length = x;
		breadth = y;
	}

	public int area() {
		return (length * breadth);
	}
}

class Box3d extends Box {
	public int height;

	public Box3d() {
		super();
		height = 0;
	}

	public Box3d(int x, int y, int z) {
		super(x, y);
		height = z;
	}

	public void setval(int x, int y, int z) {
		super.setval(x, y);
		height = z;
	}

	public int volume() {
		return (super.area() * height);
	}
}
 
	public class BoxDemo {
		public static void main(String arga[]) {
			BoxDemo box = new BoxDemo();
			Box box1 = new Box();
			Box3d box2 = new Box3d(5, 10, 15);
			box1.setval(25, 50);

			System.out.println("The Area of Box1 is : " + box1.area());
			System.out.println("The Volume of Box2 is : " + box2.volume());
		}
	}



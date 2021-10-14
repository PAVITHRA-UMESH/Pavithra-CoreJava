package Lab;

public class DefaultDemo {

	private short s;
	private int i;
	private long l;
	private float f;
	private double d;
	private char c;
	private String str;
	private boolean b;

	public static void main(String[] args) {
		{
			DefaultDemo obj = new DefaultDemo();
			System.out.println("short " + obj.s);
			System.out.println("int " + obj.i);
			System.out.println("long " + obj.l);
			System.out.println("float " + obj.f);
			System.out.println("double " + obj.d);
			System.out.println("char " + obj.c);
			System.out.println("String " + obj.str);
			System.out.println("boolean " + obj.b);
		}
	}

}

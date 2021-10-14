package Lab;

public class AutomaticTypeConversation {

	public static void main(String[] args) {
		
		byte b = getStatusValue(255);
		System.out.println(b);
		b = MyClass2.getStatusValue(122);
		System.out.println(b);

	}

	static byte getStatusValue(Object obj) throws NullPointerException {
		if (obj != null)
			return 127;
		else
			return -1;
	}
}

class MyClass2 extends AutomaticTypeConversation {
	static byte getStatusValue(Object obj) {
		if (obj != null)
			try {
				return (Byte) obj;
			} catch (Exception e) {
				System.out.println("Can't type cast");
			}
		else
			return -1;
		return (byte) 255;
	}
}

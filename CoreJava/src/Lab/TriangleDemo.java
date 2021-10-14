package Lab;

public class TriangleDemo {

	public static void main(String[] args) {

		String k = "1", l = " ", s = "1";
		int m = 0;
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < m; j++) {
				l += "0";
			}
			System.out.println(k + l + s + "\n");
			l = " ";
			m += 2;

		}
		
		System.out.println("===========================================");
		
		String y = " ";

		int x = 5;
		for (int i = 5; i >= 0; i--) {
			y = i + "" + y;
			System.out.println(y + "\n");
		}
		
		System.out.println("===========================================");

		String p = " ";

		int q = 5;
		for (int i = 1; i <= q; i++) {
			p += i + " ";
			System.out.println(p + "\n");
		}

	}
}

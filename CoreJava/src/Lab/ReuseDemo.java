package Lab;

public class ReuseDemo extends Room {

	public String City;

	public void CityFunc() {
		String city = "Bangalore";
		System.out.println("The room is located in" + " " + city);
	}

	public static void main(String[] args) {
		ReuseDemo reuse = new ReuseDemo();
		System.out.println("REUSING THE CLASS");
		System.out.println("------------------------------");
		reuse.setdata(345, "Double", 89.34d, false);
		reuse.displaydata();
		System.out.println("------------------------------");
		reuse.CityFunc();

	}

}

package Lab;

public class Room {
	public int roomno;
	public String roomtype;
	public double roomarea;
	public boolean ACmachine;

	public void setdata(int num, String type, double area, boolean mac) {
	    roomno = num;
		roomtype = type;
		roomarea = area;
		ACmachine = mac;
	}

	public void displaydata() {
		System.out.println("ROOM NUMBER : " + roomno);
		System.out.println("ROOM TYPE : " + roomtype);
		System.out.println("ROOM AREA : " + roomarea);
		String str1 = (ACmachine) ? "yes" : "no";
		System.out.println("AC MACHINE : " + str1);
	}

	public static void main(String[] args) {
		Room myroom = new Room();
		myroom.setdata(123, "Single", 20.80, true);
		myroom.displaydata();
	}

}

package Session;

import java.util.*;

public class MapDemo {
	public static void main(String[] args) {

		Map<String, MyEmployee> firstMap = new HashMap<String, MyEmployee>();
		firstMap.put("N00", new MyEmployee("N00", "Rahul", 13000));
		firstMap.put("N01", new MyEmployee("N01", "Rakshith", 500000));
		firstMap.put("N02", new MyEmployee("N02", "Venkatesh", 700000));
		firstMap.put("N03", new MyEmployee("N03", "Niharikha", 12000));
		firstMap.put("N07", new MyEmployee("N07", "Vihan", 300000));
		firstMap.put("N04", new MyEmployee("N04", "Vinay", 400000));
		firstMap.put("N09", new MyEmployee("N09", "Udayami", 600000));
		firstMap.put("N05", new MyEmployee("N05", "Veeresh", 11000));
		firstMap.put("N06", new MyEmployee("N06", "Sachin", 50000));
		firstMap.put("N08", new MyEmployee("N08", "Yashwanth", 90000));

		TreeMap<String, MyEmployee> sorted = new TreeMap<String, MyEmployee>(firstMap);

		Iterator<String> it = sorted.keySet().iterator();
		System.out.println("SORTED VALUE OF MAP : ");
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key + " " + firstMap.get(key));
		}

		Iterator<String> itr = firstMap.keySet().iterator();

		while (itr.hasNext()) {
			String key = (String) itr.next();

			MyEmployee sal = firstMap.get(key);

			if (sal.esal < 15000.0) {
				itr.remove();

			}
		}

		Map<String, MyEmployee> finalMap = new HashMap<String, MyEmployee>();
		for (Map.Entry<String, MyEmployee> entry : firstMap.entrySet()) {
			finalMap.put(entry.getKey(), entry.getValue());
		}

		System.out.println("=============================================================================================");
		
		System.out.println("Value of new Map after removing the employees having salary less than 15000 : ");
		Iterator<String> itr1 = finalMap.keySet().iterator();
		while (itr1.hasNext()) {
			String key = (String) itr1.next();
			System.out.println(key + " " + firstMap.get(key));
		}
		firstMap.clear();
		sorted.clear();
		finalMap.clear();
	}

}

class MyEmployee {
	String eid;
	String ename;
	double esal;

	public MyEmployee(String eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "eid=" + eid + ", ename=" + ename + ", esal=" + esal;
	}

}
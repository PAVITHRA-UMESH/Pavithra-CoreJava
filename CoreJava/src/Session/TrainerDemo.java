package Session;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TrainerDemo {

	public static void main(String[] args) {

		List<Trainer> trainers = new ArrayList<Trainer>();
		trainers.add(new Trainer(1234, "Ram", "Java", 13245.97));
		trainers.add(new Trainer(5678, "Pavish", "Java", 25456.78));
		trainers.add(new Trainer(9101, "Gita", "Python", 34567.89));
		trainers.add(new Trainer(7410, "Vishu", "Java", 49215.69));
		trainers.add(new Trainer(9630, "Prem", "HTML", 18000.36));
		List<Trainer> filteredList = new ArrayList<Trainer>();
		int count = 0, i = 0;
		Iterator<Trainer> itr = trainers.iterator();
		while (itr.hasNext()) {
			Trainer t = itr.next();
			if ((t.salary > 20000.0) && (t.course == "Java")) {
				filteredList.add(t);
				i++;
			}
			count++;
		}
		Iterator<Trainer> itr1 = filteredList.iterator();
		System.out.println("---FILTERED LIST---");
		while (itr1.hasNext()) {
			Trainer t = itr1.next();
			System.out.println(t);
		}
		int[] index = new int[i];
		i = 0;
		count = 0;
		Iterator<Trainer> itr2 = trainers.iterator();
		while (itr2.hasNext()) {
			Trainer t = itr2.next();
			if ((t.salary > 20000.0) && (t.course == "Java")) {
				index[i] = count;
				i++;
			}
			count++;
		}

		for (int j = 0; j < index.length; j++) {
			trainers.remove(index[j]);
			trainers.add(index[j], null);
		}
		
		System.out.println("==============================================================================");
		
		System.out.println("---ORIGINAL LIST---");
		Iterator<Trainer> itr3 = trainers.iterator();
		while (itr3.hasNext()) {
			Trainer t = itr3.next();
			System.out.println(t);
		}

		trainers.clear();
		filteredList.clear();
	}

	private static String type(Object ob) {
		return null;
	}

}

class Trainer {
	int tr_id;
	double salary;
	String name, course;

	public Trainer(int tr_id, String name, String course, double salary) {
		super();
		this.tr_id = tr_id;
		this.name = name;
		this.course = course;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Trainer_id : " + tr_id + ", NAME : " + name + ", COURSE : " + course + ", SALARY : " + salary;
	}
}

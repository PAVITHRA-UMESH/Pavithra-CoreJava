package Lab;

import java.io.*;
import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {

		int n = 10;

		Vector<Integer> vec = new Vector<Integer>(n);// Declaring the Vector with initial size n

		for (int i = 1; i <= n; i++)// Appending new elements at the end of the vector
		{
			vec.add(i);
		}
		System.out.println(vec); // Printing elements
		vec.remove(7);// Remove element at index 7

		System.out.println(vec);// Displaying the vector after deletion

		for (int i = 0; i < vec.size(); i++)// Printing elements one by one
		{
			System.out.print(vec.get(i) + " ");
		}
	}
}

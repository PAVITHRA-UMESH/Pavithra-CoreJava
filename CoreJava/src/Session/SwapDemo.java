package Session;

import java.util.Scanner;

public class SwapDemo {

	public static int[] swap(int[] array) {
		int minIndex = 0, maxIndex = 0;
		for (int i = 1; i < array.length; ++i) {
			if (array[i] < array[minIndex])
				minIndex = i;
			if (array[i] > array[maxIndex])
				maxIndex = i;
		}
		int t;
		if (maxIndex != minIndex) {
			t = array[minIndex];
			array[minIndex] = array[maxIndex];
			array[maxIndex] = t;
		}
		return array;
	}

	public static void main(String[] args) {
		for (int i : swap(new int[] { 3, 2, 20, 5, 1 }))
			System.out.println(i);
	}
}
package Arrray_Programs;

import java.util.Arrays;

public class Insertion_Sort {
	static void insertionSort(int array[]) {
		int size = array.length;
		for (int step = 1; step < size; step++) {
			int key = array[step];
			int j = step - 1;
			while (j >= 0 && key < array[j]) {
				array[j + 1] = array[j];
				--j;
			} // while loop closing
			array[j + 1] = key;
		} // for loop closing
	} // insertionSort method closing

	public static void main(String args[]) {
		int[] array = { 9, 5, 1, 4, 3 };
		insertionSort(array);
		System.out.println("Sorted Array in Ascending Order: ");
		System.out.println(Arrays.toString(array));
	} // main method is closing
} // class closing

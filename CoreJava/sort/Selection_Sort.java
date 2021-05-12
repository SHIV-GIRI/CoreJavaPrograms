package Arrray_Programs;
public class Selection_Sort {
	public static void main(String[] args) {
		int[] array = { 5, 2, 4, 1, 9 };
		int temp, min; // local variable declare
		for (int i = 0; i < array.length; i++) {
			min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				} // if closing
			} // 1st for loop closing
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		} // 1st for loop closing
		System.out.println("After Sorting");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		} // 2nd for loop for loop closing
	} // main closing
} // class closing
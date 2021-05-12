package Arrray_Programs;

import java.util.Scanner;

public class Array_Elememt_Print_Reverse_order {
	static void display(int[] number) {
		System.out.println("Before reverse of Array :");
		for (int row = 0; row < number.length; row++) {
			System.out.println(number[row]);
		} // display method 1st for loop closing

		System.out.println("After Array reverse order: ");

		for (int row = number.length - 1; row >= 0; row--) { // Loop through the
																// array in
																// reverse order
			System.out.println(number[row]);
		} // display method 2nd for loop closing
	} // display method closing

	public static void main(String[] args) {
		int[] arrayNumbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		display(arrayNumbers);
	} // main closing
} // class closing

// Scanner scan = new Scanner (System.in);
// int numbers = scan.nextInt();
// System.out.println(" enter the Array elements");
// int[] arrayNumbers = new int[numbers];
// */
// System.out.println(display(scan.nextInt(););

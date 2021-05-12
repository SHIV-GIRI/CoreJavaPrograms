package Arrray_Programs;

import java.util.Scanner;

public class Jagged_Array {
	static void display(int cse[][]) {
		for (int j = 0; j < cse.length; j++) {
			for (int k = 0; k < cse[j].length; k++) {
				System.out.print(cse[j][k] + " ");
			}
			System.out.println();
		}
	} // display method closed
	public static void main(String[] args) {
		int cse[][] = new int[3][];
		cse[0] = new int[4];
		cse[1] = new int[2];
		cse[2] = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter " + cse.length + " Students info");
		for (int j = 0; j < cse.length; j++) {
			System.out.println((j + 1) + " student " + cse.length + " marks");
			for (int k = 0; k < cse[j].length; k++) {
				cse[j][k] = sc.nextInt();
			}
		}
		display(cse);
	} // closing main method
} // class closed
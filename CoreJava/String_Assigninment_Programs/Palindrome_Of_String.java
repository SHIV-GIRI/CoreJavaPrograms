package classoom_Task_Program;

import java.util.Scanner;

public class Palindrome_Of_String {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = scanner.next(), revers = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			revers += name.charAt(i);
		}
		if (name.equals(revers)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
		scanner.close();
	} // main method closing
} // class closing

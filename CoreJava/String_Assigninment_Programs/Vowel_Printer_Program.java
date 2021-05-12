package classoom_Task_Program;

import java.util.Scanner;

public class Vowel_Printer_Program {

	static String removeVowels(String words) {
		String vowels = "";
		for (int i = 0; i < words.length(); i++) {
			if ("AEIOU".contains("" + words.toUpperCase().charAt(i))) {
				vowels += words.charAt(i);
			}
		}
		if (vowels == "") {
			return null;
		}
		return vowels;
	} // removeVowels method closing

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the words you want to print vowels in it: ");
		String words = scanner.next();
		System.out.println(removeVowels(words));
		scanner.close();
	} // main method closing
} // class closing

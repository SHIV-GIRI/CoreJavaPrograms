package classoom_Pra_Program;

import java.util.Scanner;

public class Char_Count_Ending_With_YZ {
	public static int countYZ(String character) {

		// LowerCase change toUpperCase character
		character = character.toUpperCase();
		String[] words = character.split(" ");

		// Declare local variable
		int count = 0;
		for (int i = 0; i < words.length; i++) {

			// Checking condition Ending_With_YZ
			if (words[i].endsWith("Y") || words[i].endsWith("Z"))
				count++;
		}

		return count;
	} // Char_Count_Ending_With_YZ method closing

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Please Enter any charcter ");
		System.out.println(countYZ(scan.next()));

	} // main method closing
} // class closing

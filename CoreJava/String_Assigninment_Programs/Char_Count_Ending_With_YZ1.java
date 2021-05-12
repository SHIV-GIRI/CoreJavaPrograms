package classoom_Task_Program;

import java.util.Scanner;

public class Char_Count_Ending_With_YZ1 {
	
	public static int countYZ(String str) {
		int len = str.length();
		int count = 0; // Declare local variable
		str = str.toLowerCase(); // LowerCase change toUpperCase character
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == 'y' || str.charAt(i) == 'z') {
				if (i < len - 1 && !Character.isLetter(str.charAt(i + 1)))
					count++;
				else if (i == len - 1)
					count++;
			} // if loop closing
		} // for loop closing
		return count;
	} // Char_Count_Ending_With_YZ method closing

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Please Enter any charcter ");
		System.out.println(countYZ(scan.next()));
	} // main method closing
} // class closing

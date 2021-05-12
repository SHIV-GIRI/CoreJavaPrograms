package classoom_Task_Program;

import java.util.Scanner;

public class String_Using_Mask_The_Mail_ID {

	static String maskMailID(String mailID) {
		String maskID = "";
		int midValue = mailID.indexOf('@');
		for (int i = 0; i < mailID.length(); i++) {
			if (i >= 2 && midValue > i) {
				maskID += "X";
				continue;
			}
			maskID += mailID.charAt(i);
		}
		return maskID;
	} // maskMailID method closing

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the emailID: ");
		System.out.println(maskMailID(scanner.next()));
		scanner.close();
	} // main method closing
} // class closing

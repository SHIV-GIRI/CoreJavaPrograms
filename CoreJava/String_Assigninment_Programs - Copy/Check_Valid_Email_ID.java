package classoom_Task_Program;

import java.util.Scanner;

public class Check_Valid_Email_ID {

	static String isValidMailID(String mailID) {
		String res = "vaild";
		if (mailID.charAt(0) == mailID.toUpperCase().charAt(0)) {
			return "-1";
		} else if (!mailID.contains("@")) {
			return "-2";
		}

		else if (!(mailID.substring(mailID.length() - 6, mailID.length()).contains(".com"))) {
			if (!((mailID.substring(mailID.length() - 6, mailID.length()).contains(".co.in")))) {
				return "-4";
			}
		} else if (!(mailID.contains("_"))) {
			if (!(mailID.contains("."))) {
				return "-5";
			}

		}
		return res;
	} // isValidMailID method closing

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the emailID: ");
		System.out.println(isValidMailID(scanner.next()));
		scanner.close();
	} // main method closing
} // class closing

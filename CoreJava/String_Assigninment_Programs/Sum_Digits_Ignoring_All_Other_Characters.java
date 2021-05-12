package classoom_Pra_Program;

import java.util.Scanner;

public class Sum_Digits_Ignoring_All_Other_Characters {
	
	public static int sumDigits(String str) {
		String integers = " ";
		int result = 0;
		for(int count=0; count<str.length(); count++) {
		if(Character.isDigit(str.charAt(count))==true) 
		integers += Character.toString(str.charAt(count));
		}
		for(int count=0; count<integers.length(); count++) {
		result += Integer.parseInt(Character.toString(integers.charAt(count)));
		}
		return result;
		} // sumDigits method closing
	public static void main(String args[]) {
		
		Scanner scan = new Scanner (System.in);
		String str = scan.next();
		System.out.println("Please Enter the Given a string : ");
		System.out.println(sumDigits(str));
	} // main method closing	
} // class closing 

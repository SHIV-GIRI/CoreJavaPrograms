package com.inheritance;

import java.util.Scanner;

public class CheckInRangeOrNot {
	
	static boolean checkNumRange(int number1, int number2) {
		if (number1 >= 30 && number1 <= 40 && number2 >= 30 && number2 <= 40) {
			return true ;
		}
		if (number1 >= 40 && number1 <= 50 && number2 >= 40 && number2 <= 50) {
			return true ;
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		while(true) {
		System.out.println("Enter two numbers to check last Digit Same OR Not");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Num : ");
		int number1 = sc.nextInt();
		System.out.println("Enter First Num : ");
		int number2 = sc.nextInt();
		System.out.println(checkNumRange(number1, number2));
		}
	}

}

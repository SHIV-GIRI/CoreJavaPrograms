package com.strings.Assignment;

import java.util.Scanner;

public class ReplaceVowelsWithZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input String");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				ch[i] = '0';
			}
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
	}

}

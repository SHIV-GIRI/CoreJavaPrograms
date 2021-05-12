package com.strings.Assignment;

public class ReverseTheString {
	public static String reverseString(String str) {
		char ch[] = str.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];
		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println(reverseString("my name is shiva"));
		System.out.println(reverseString("I am from Karnataka"));
	}

}

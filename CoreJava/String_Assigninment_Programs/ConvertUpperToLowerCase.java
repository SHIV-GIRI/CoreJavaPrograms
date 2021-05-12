package com.strings.Assignment;

public class ConvertUpperToLowerCase {

	public static void main(String[] args) {
		String str1 = "ShIvGIri";
		StringBuffer newStr = new StringBuffer(str1);
		for (int i = 0; i < str1.length(); i++) {
			// checks for lower case character
			if (Character.isLowerCase(str1.charAt(i))) {
				// convert it into upper case using toUpperCase() Function
				newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
			}
			// checks for upper case character
			else if (Character.isUpperCase(str1.charAt(i))) {
				// convert it into upper case using toLowerCase() function
				newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
			}
		}
		System.out.println("String after case conversion: " + newStr);

	}

}

package com.strings.Assignment;

public class WordCount {
	static int wordCount(String str) {
		int count = 0;
		char ch[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "Hi How Are you and what are you doing";
		System.out.println(wordCount(str) + " words.");

	}

}

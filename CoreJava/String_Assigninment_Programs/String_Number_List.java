package classoom_Task_Program;

import java.util.*;

public class String_Number_List {

	static String getNumberList(String list) {
		String numberList = "";
		if (list == null) {
			return null;
		}
		String[] array = (list.replaceAll("-", ",").split(","));
		int[] numbers = new int[array.length];
		for (int index = 0; index < array.length; index++) {
			numbers[index] = Integer.parseInt(array[index]);
		}
		Arrays.sort(numbers);

		for (int i = numbers[0]; i <= numbers[numbers.length - 1]; i++) {
			numberList += i + ",";
		}
		return numberList.substring(0, numberList.length() - 1);
	} // getNumberList method closing

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number list: ");
		String list = scanner.next();
		// "1,2,3,4,5-8,6-10,8-15,16-25,20-30,22-2"

		System.out.println(getNumberList(list));
		scanner.close();
	} // main closing
} // class closing

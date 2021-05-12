package classoom_Task_Program;

import java.util.*;

public class Find_Nearest_Min_Value {

	static int findGetNearestMinValue(int[] numbers) {
		Arrays.sort(numbers);
		return numbers[0] - 1;
	} // findGetNearestMinValue method closing

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = scanner.nextInt();
		int[] numbers = new int[size];
		System.out.println("Enter " + size + " numbers:");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}
		System.out.println(findGetNearestMinValue(numbers));
		scanner.close();
	} // main method closing
} // class closing

package occurenceCounterInArray;

import java.util.Scanner;

import occurenceCounterInArray.OccurrenceCounter;

public class Tester 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int arraySize = scanner.nextInt();
		int[] array = new int[arraySize];
		System.out.println("Enter the " + arraySize + "  values: ");
		for (int index = 0; index < array.length; index++) 
		{
			array[index] = scanner.nextInt();
		}
		System.out.println("Enter the number you want to count in the array: ");
		int number = scanner.nextInt();
		int count = OccurrenceCounter.getCount(array, number);
			System.out.println(count);
		scanner.close();

	}

}

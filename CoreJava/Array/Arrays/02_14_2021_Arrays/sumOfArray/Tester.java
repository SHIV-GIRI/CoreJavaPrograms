package sumOfArray;

import java.util.Scanner;
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
		int sum = ArraySum.getSum(array);
		System.out.println(sum);
		scanner.close();
	}

}

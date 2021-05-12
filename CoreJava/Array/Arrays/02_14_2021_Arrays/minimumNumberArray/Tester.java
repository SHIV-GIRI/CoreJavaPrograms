package minimumNumberArray;

import java.util.Scanner;


public class Tester 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array 10: ");
		int arraySize = scanner.nextInt();
		
		
		System.out.println("Enter the  values: ");
		int[] array = new int[arraySize];
		for (int index = 0; index < 10; index++) 
		{
			array[index] = scanner.nextInt();
		}
		int min = MinNumber.getMin(array);
		System.out.println(min);
		scanner.close();
		
	}

}

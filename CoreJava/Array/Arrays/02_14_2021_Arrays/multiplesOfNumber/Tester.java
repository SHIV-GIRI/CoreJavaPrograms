package multiplesOfNumber;

import java.util.Scanner;


public class Tester 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number greater than zero: ");
		int number = scanner.nextInt();
		int[] multiples = FillMultiples.getMultiples(number);
		if(multiples == null)
		{
			System.out.println("Null");
		}
		else
		{
			for (int index : multiples) 
			{
				System.out.print(index + "  ");
			}
		}
		scanner.close();

	}

}

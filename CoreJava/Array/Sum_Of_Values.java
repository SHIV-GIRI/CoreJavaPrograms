package exercise16th;

import java.util.Scanner;

public class Sum_Of_Values 
{
	public static int sumDouble(int number1, int number2)
	{
		if(number1 == number2)
		{
			return (number1 + number2) * 2; 
		}
		else
		{
			return number1 + number2;
		}
		
	}
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two values to check the sum: ");
		System.out.println("Enter number 1: ");
		int number1 = scanner.nextInt();
		System.out.println("Enter number 2: ");
		int number2 = scanner.nextInt();
		System.out.println(sumDouble(number1, number2));
		scanner.close();
		
	}

}

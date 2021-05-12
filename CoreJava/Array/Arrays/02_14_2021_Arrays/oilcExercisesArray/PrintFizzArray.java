package oilcExercisesArray;

import java.util.Scanner;

public class PrintFizzArray 
{
	public static int[] fizzArray(int start, int end)
	{
		int count = 0;
		int[] fizzArray = new int[end - start];
	    for (int index = start; index < end; index++)
	    {
	       fizzArray[count] = index;
	       count++;
	    }
	    return fizzArray;
	   
	}
	public static void main(String[] args)
	{
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter Start Value: ");
	    int start = scanner.nextInt();
	    System.out.println("Enter end value: ");
	    int end = scanner.nextInt();
	    int[] fizzArray = fizzArray(start, end);
	    for (int index : fizzArray) 
	    {
	    	System.out.print(index + " ");
			
		}
	    scanner.close();
	}

}

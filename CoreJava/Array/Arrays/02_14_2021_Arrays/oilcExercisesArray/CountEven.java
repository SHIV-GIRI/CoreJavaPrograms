package oilcExercisesArray;

import java.util.Scanner;

public class CountEven 
{
	
	
	public static int countEven(int[] array)
	{
	    int count = 0;
	    for (int index = 0; index < array.length; index++)
	    {
	        if(array[index] % 2 == 0)
	        {
	            count++;
	        }
	       
	    }
	    return count;
	   
	}
	public static void main(String[] args)
	{
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter how many numbers you want to enter in array: ");
	    int arraySize = scanner.nextInt();
	    int[] array =  new int[arraySize];
	    for (int index = 0; index < array.length; index++)
	    {
	        System.out.print("Enter number " + (index + 1) + ": ");
	        array[index] = scanner.nextInt();
	       
	    }
	    int count = countEven(array);
	    System.out.println(count);
	    scanner.close();
	}
}
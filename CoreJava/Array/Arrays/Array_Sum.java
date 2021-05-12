package com.Arrays;

import java.util.Scanner;

public class Array_Sum 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size : ");
		int arraySize =sc.nextInt();
		int[] arrayElem = new int[arraySize];
		System.out.println("Enter the Array elements : ");
		for (int index =0; index < arrayElem.length; index++)
		{
			arrayElem [index] = sc.nextInt();
		}
		System.out.println("sum of Array Elements : "+ getSum(arrayElem));
	}


		public static int getSum(int[] inputArray)
			{
			int sum = 0;
				if(inputArray != null)
				{
			
						for(int index=0; index < inputArray.length; index++)
						{
							sum =sum + inputArray[index];
						}
				
			
			}
			else
			{
				return sum=-1;
			}
			return sum;
			}
		}
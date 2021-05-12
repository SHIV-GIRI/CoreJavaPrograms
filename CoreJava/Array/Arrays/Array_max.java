package com.Arrays;

import java.util.Scanner;

public class Array_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		System.out.println("________________________________");
		
		int arraySize = scan.nextInt();
		System.out.println(" Please enter the Array elements : ");
		int arrayElements[] = new int[arraySize];
		
		for (int i= 0; i<arraySize; i++)
		{
			arrayElements[i] = scan.nextInt();
		}
				for (int i= 0; i<arraySize; i++)
				{
					for (int j=i+1; j<arraySize; j++)
					{
						if(arrayElements[i] > arrayElements[j])
						{
							int team =0;
							
							team= arrayElements[i];
							arrayElements[i] = arrayElements[j];
							arrayElements[j] = team;
						}
					}
				}
				System.out.println("___________________________________");
				System.out.println("Enter Array elements in Sorted Order ");
				for (int i = 0; i<arraySize; i++ )
				{
					System.out.println("arrayElements"+arrayElements[i]);
				}
				System.out.println("_____________________________________");
				System.out.println("You Enter Array Largest Elements is  " +arrayElements[arraySize-1] );
	}
		}



package com.arrays;

import java.util.Scanner;

public class EqualMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		
		System.out.println("Enter arr1 Matrix rows and columns");
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		System.out.println("Enter arr2 Matrix rows and columns");
		int row2 = sc.nextInt();
		int col2 = sc.nextInt();
		
		int[][] arr1 = new int[row1][col1];
		int[][] arr2 = new int[row2][col2];
		
		if(row1 == row2 && col1 == col2) {
			System.out.println("Insert elements to arr1 Matrix");
			for (int indexR = 0; indexR < arr1.length; indexR++) {
				for (int indexC = 0; indexC < arr1[indexR].length; indexC++) {
					arr1[indexR][indexC] = sc.nextInt();
					
				}
				
			}
			
			System.out.println("Insert elements to arr2 Matrix");
			for (int indexR = 0; indexR < arr2.length; indexR++) {
				for (int indexC = 0; indexC < arr2[indexR].length; indexC++) {
					arr2[indexR][indexC] = sc.nextInt();
					
				}
			}
			
			System.out.println("print 1st matrix");
			for (int indexR = 0; indexR < arr2.length; indexR++) {
				for (int indexC = 0; indexC < arr2[indexR].length; indexC++) {
			         System.out.print(arr1[indexR][indexC]+" ");			
				}
				System.out.println();
			}
			
			System.out.println("print 2nd matrix");
			for (int indexR = 0; indexR < arr2.length; indexR++) {
				for (int indexC = 0; indexC < arr2[indexR].length; indexC++) {
			         System.out.print(arr2[indexR][indexC]+" ");			
				}
				System.out.println();
			}
			
			
			int count = 0;
			int notvalid = 0 ;
			for (int indexR = 0; indexR < arr2.length; indexR++) {
				for (int indexC = 0; indexC < arr2[indexR].length; indexC++) {
			         if(arr1[indexR][indexC] == arr2[indexR][indexC]) {
			        	 count++ ;
			         }
			         else {
			        	 notvalid++ ;
			         }
				}
			}
			
			if (notvalid > 0) {
				System.out.println("The Two matrix are different");
			}
			else {
				System.out.println("Both are same matrix");
			}
			
//			System.out.println("Print Addition of two Matrix");
//			for (int indexR = 0; indexR < arr2.length; indexR++) {
//				for (int indexC = 0; indexC < arr2[indexR].length; indexC++) {
//			         System.out.print(arr1[indexR][indexC]+" ");			
//				}
//				System.out.println();
//			}
			
		}
		else {
			
			System.out.println("Equalization Not Possible");
		
		
		
		
		}

	}

}

package com.arrays;

import java.util.Scanner;

public class MultiplicationOfArray {

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
			
			if(col1 != row2) {
				System.out.println("Multiplication Not Possible");
			}else {
			
			int[][] arr3 = new int[row2][col2] ;
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
			
	//		System.out.println("For Additipon ");
			
//			for (int indexR = 0; indexR < arr2.length; indexR++) {
//				for (int indexC = 0; indexC < arr2[indexR].length; indexC++) {
//			         arr3[indexR][indexC] = arr1[indexR][indexC]+arr2[indexR][indexC];				
//				}
//			}
			
			System.out.println("Doing Multiplication operation");
			
			for (int indexR = 0; indexR < row1; indexR++) {
				for (int indexC = 0; indexC < col2; indexC++) {
					arr3[indexR][indexC] = 0;
					for (int indexK = 0; indexK < col1; indexK++) {
						arr3[indexR][indexC] += arr1[indexR][indexK]*arr2[indexK][indexC];
					}
					System.out.print(arr3[indexR][indexC]+" ");
					
					
				}
				System.out.println();
		    }
			
			
			}
		

	}

}

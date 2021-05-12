package Arrray_Programs;

import java.util.Scanner;

public class Find_Smallest_Array_Elements {
		
		static int findSmall(int number[]) {
			
		int big = number[0];
		for(int i= 1; i <= number.length-1 ; i++ ) {
			if(number[i] < big) {
			big = number[i];
			}
		}
		return big;
		}
		public static void main(String[] args) {
			int[] number = new int[5];
			Scanner sc = new Scanner (System.in);
			System.out.println("Please Enter the five Elements : ");
			for(int i= 0; i < number.length; i++ ) {
				number[i] = sc.nextInt();
			}
			System.out.println("Assigned  Smallest value is :" +number+  " " + findSmall(number) +" ");
			
		}

	}

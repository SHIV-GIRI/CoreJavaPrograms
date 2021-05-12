package Arrray_Programs;

import java.util.Scanner;

public class Big_Of_Array_Elements {
	
	static int findbig(int number[]) {
		
	int big = number[0];
	for(int i= 0; i <= number.length-1 ; i++ ) {
		if(number[i] > big) {
		big = number[i];
		}
	}
	return big;
	}

	public static void main(String[] args) {
		int[] number = new int[5];
		Scanner sc = new Scanner (System.in);
		System.out.println(" Enter five Elemenys: ");
		for(int i= 0; i < number.length; i++ ) {
			number[i] = sc.nextInt();
		}
		System.out.println(findbig(number));
		
	}

}

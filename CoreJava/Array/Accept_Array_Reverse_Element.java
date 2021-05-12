package Arrray_Programs;
import java.util.Scanner;
public class Accept_Array_Reverse_Element {		
		static int[] reverseArray(int number[]) {	
		int rev[] = new int [number.length];
		int k = 0;
		for(int i= number.length-1; i >= 0; i-- ) {
			rev[k] = number[i];
			k++;
			return rev;
			}
		return rev;
		
		}
		public static void main(String[] args) {
			int[] number = new int[4];
			Scanner sc = new Scanner (System.in);
			System.out.println(" Enter five Elemenys: ");
			for(int i= 0; i < number.length-1; i++ ) {
				number[i] = sc.nextInt();
				System.out.println(" rev Order ");
				for(int x : reverseArray(number))
			
			System.out.println(x);
			
		}

	}
}

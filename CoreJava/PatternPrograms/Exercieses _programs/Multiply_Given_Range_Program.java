package PatternPrograms;

import java.util.Scanner;

public class Multiply_Given_Range_Program { 

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Eneter start range");
			
			
			int start = sc.nextInt();
			System.out.println("Enter end  number");
			int end  = sc.nextInt();
			for (int i = start ; i <=end  ; i++) {
				for (int j = 1; j <=10; j++) {
					System.out.println(i+"*"+j+"="+(i*j));
				}
				System.out.println("=============================");
					
			}

		} //  main method closing 

	} // class closing




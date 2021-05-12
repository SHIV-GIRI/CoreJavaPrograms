package Arrray_Programs;

public class Array_Element_Display {
		static void display(int[] number) {
			System.out.println("Array of elements :");
			for (int row = 0; row < number.length; row++) {
				System.out.println(number[row]);
			} // display method for loop closing
		} // display method closing 
	public static void main(String[] args) {	
		int[] arrayNumbers = new int[10];
		int k = 0;
		System.out.println(" enter the row and colm");
		for (int row = 0; row < arrayNumbers.length; row++) {
			
			arrayNumbers[row] = Integer.parseInt(args[row]);
		display(arrayNumbers);
	} // for closing
	} // main method closing 
} // class closing 
			

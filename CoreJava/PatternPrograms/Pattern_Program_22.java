package PatternPrograms;

public class Pattern_Program_22 {

	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (int col = 5; col >= 1; col--) {
				if (col==1 || col==3 || col==5) {
					System.out.print(" 1 ");
					
				}
				else{
					System.out.print(" * ");
				}
			}
			System.out.println();

	}

	}
}

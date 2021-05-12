package PatternPrograms;

public class Pattern_Program_25 {

	public static void main(String[] args) {
		int count=10;
		for (int row = 1; row <=4; row++) {
			for (int col = 4; col>=row; col--) {
				System.out.print(count +" ");
				count--;
			}
			System.out.println();

	}
		

}
}
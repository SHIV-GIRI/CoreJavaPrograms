package PatternPrograms;

public class Pattern_Program_9 {

		public static void main(String[] args) {

			String res ="";
			for (int row = 1; row <= 5; row++) {
				for (int col = 5; col >= 1; col--) {
					res += col+" ";
				}
				res+="\n";
			}
			System.out.println(res);
		}
	}



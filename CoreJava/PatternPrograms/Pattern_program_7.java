package PatternPrograms;

public class Pattern_program_7 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int count = 1;
			for (int row=1; row<=5; row++)
			{
				for(int col = 1; col<=row; col++)
				{
					System.out.print(count + " " );
					count++;
				}
				System.out.println();
			}
			

		}

	}


package PatternPrograms;

public class Pattern_Program_10 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int count = 65;
			for (int row=1; row<=5; row++)
			{
				for(int col = 1; col<=row; col++)
				{
					char ch = (char)count;
					System.out.print(ch+ " " );
					count++;
				}
				System.out.println();
			}
			

		}

	}



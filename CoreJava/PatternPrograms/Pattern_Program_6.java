package PatternPrograms;

public class Pattern_Program_6 {


		public static void main(String[] args) {
		
			int count = 5;
			
			        for (int row = 1; row <= 5; row++)
			        {
			            	for (int col = 1; col <= row; col++)
			            	{
			            
			                System.out.print(count+" ");
			            	}
			                
			            
			            count--;
			            System.out.println();
			        }
		}

	}



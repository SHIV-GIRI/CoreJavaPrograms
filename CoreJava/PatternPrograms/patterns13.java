package PatternPrograms;

public class patterns13 {
	 public static void main(String[] args) {

		 	    for (int row = 1; row <= 4; row++ )
		 	    {
		 	        for(int column = 1; column <= 7; column++)
		 	        {
		 	            if(5 - row <= column && row + 3 >= column)
		 	            {
		 	                System.out.print("*");
		 	            }
		 	            else
		 	            {
		 	                System.out.print(" ");
		 	            }
		 	                
		 	        }
		 	        System.out.println();
		 	    }
		 	}

		 }




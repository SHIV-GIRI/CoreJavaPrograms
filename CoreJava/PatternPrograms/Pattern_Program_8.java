package PatternPrograms;

public class Pattern_Program_8
	{

	    public static void main(String[] args) 
	    {
	        
	        for (int row = 1; row <= 5; row++)
	        {    
	            int count = row;
	            for (int col = 1; col <= row; col++)
	            {                
	                System.out.print(count+" ");    
	                count=  count+1;          
	                
	            }                                
	            
	            System.out.println();
	        }
	    }
	}

	 




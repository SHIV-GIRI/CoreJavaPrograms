package PatternPrograms;

public class Pattern_Program_18 {
	public static void main(String[] args) {
		
		String result ="";
		int num = 1;
		
		for (int row=1; row<=5; row++)
		{
			if(row  % 2 ==0) {
				num = 0;
			}
			else {
				num = 1;
			}
			for(int col = 1; col<=5; col++)
			{
				result += num +" ";
				;
				
			}
			 result +="\n";
			
		}
		
		System.out.println(result);
	}

}







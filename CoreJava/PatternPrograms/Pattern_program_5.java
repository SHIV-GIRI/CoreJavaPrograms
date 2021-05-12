package PatternPrograms;

import java.util.Scanner;

public class Pattern_program_5
{
	public static void main(String[] args) 
	{
		int rows,columns;
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		n=scanner.nextInt();
		
		for(rows = n;rows >= 1;rows--)
		{
			for(columns = n;columns >= 1;columns--)
			{
				System.out.print(rows+" ");
			}
			System.out.println();
		}
	}
}




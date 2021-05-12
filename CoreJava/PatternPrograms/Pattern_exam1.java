package PatternPrograms;

import java.util.Scanner;

public class Pattern_exam1
	{
		public static void main(String[] args)
		{
			int number=0;
			int n;
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the number");
			n=scan.nextInt();
			
			for(int rows = 1;rows <= n;rows++)
			{
				number++;

				for(int columns = 1;columns <= number;columns++)
				{
					System.out.print(columns+" ");
				}
				System.out.println(" ");
			}
		}
	}




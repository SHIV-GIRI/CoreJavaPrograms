package PatternPrograms;

import java.util.Scanner;

public class Multiply_number 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.println(" Plese enter the number in given range  : ");
		
		int range   = scan.nextInt();
		
		for ( int i = 1 ; i <= range; i++)
		{
			for  ( int j = 1 ; j<=10; j++ )
			{
				System.out.println(i +" * " + j + " = "+ (i*j));
			
			}
		}System.out.println(" ");
		
		
		

	}

}

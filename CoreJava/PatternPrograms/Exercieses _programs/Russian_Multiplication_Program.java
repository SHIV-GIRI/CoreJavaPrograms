package PatternPrograms;
import java.util.Scanner;
public class Russian_Multiplication_Program {
	public static void getProdut(int num1, int num2)
	{
		int product = 0;
		if(num1<0 && num2<0)
		{
			System.out.println("-1");
		}
		else
		{
			while(num2 > 0)
			{
				if(num2%2!=0)
				{
					product = product + num1;
				}
				num1 = num1*2;
				num2 = num2/2;
			}
			System.out.println(product);
		}
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the a number");
		int a = sc.nextInt();
		System.out.println("Please Enter b number");
		int b = sc.nextInt();
		Russian_Multiplication_Program rm = new Russian_Multiplication_Program();
		rm.getProdut(a, b);
	}


}

import java.util.Scanner;

public class Start_End 
{
	public static void main(String[] args) 
	{
		int size=20;
		int start;
		int end;
		
		Scanner scanner=new Scanner(System.in);
		
//		System.out.println("enter the size");
//		size=scanner.nextInt();
		
		System.out.println("enter the starting number");
		start=scanner.nextInt();
		
		System.out.println("enter the end number");
		end=scanner.nextInt();
		
		int arr[]=new int[size];
		for(int i=start;i<end;i++)
		{
			arr[i]=scanner.nextInt();
		}
		
		for(int i=start;i<end;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i=start;i<end;i++)
		{
			System.out.println(i);
		}
	}
}

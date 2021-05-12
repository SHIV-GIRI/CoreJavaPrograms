import java.util.Scanner;

public class Even 
{
	public static void main(String[] args) 
	{
		int i;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size");
		int size=scanner.nextInt();
		
		if(size==10)
		{
			System.out.println("enter the elements into arrays");
			System.out.println("==========================");
			int arr[]=new int[size];
			for(i=0;i<arr.length;i++)
			{
				arr[i]=scanner.nextInt();
			}
			
			System.out.println("========================");
			for(i=0;i<arr.length;i++)
			{
				if(arr[i]%2==0)
				{
					System.out.println(arr[i]);
				}
				else
				{
					System.out.println("not an even number");
				}
			}
		}
		else
		{
			System.out.println("enter valid size");
		}
	}
}

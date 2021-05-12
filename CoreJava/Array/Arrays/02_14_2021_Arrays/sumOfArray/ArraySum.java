package sumOfArray;

public class ArraySum 
{
	public static int getSum(int[] givenArray)
	{
		int sum = 0;
			for (int index = 0; index < givenArray.length; index++) 
			{
					sum = sum + givenArray[index];
			}
			return sum;
		
	}

}

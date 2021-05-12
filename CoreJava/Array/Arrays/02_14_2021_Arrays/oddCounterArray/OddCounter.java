package oddCounterArray;

public class OddCounter 
{
	public static int getOddCount(int[] givenArray) 
	{
		int count = 0;
		if(givenArray.length >= 10)
		{
			for (int index = 0; index < givenArray.length; index++) 
			{
				if(givenArray[index] % 2 != 0)
				{
					count++;
				}
			}
			return count;
		}
		else
		{
			return -1;
		}
	}

}

package maximumNumberArray;

public class MaxNumber 
{
	public static int getMax(int[] givenArray)
	{
		int temp = 0;
		if(givenArray.length != 10)
		{
			return -1;
		}
		else
		{
			if(givenArray[0] >= givenArray[1])
			{
				temp = givenArray[0];
			}
			else
			{
				temp = givenArray[1];
			}
			
			for (int index = 2; index < givenArray.length; index++) 
			{
					if(temp <= givenArray[index])
					{
						temp = givenArray[index];
					}
			}
			return temp;
		}
	}

}

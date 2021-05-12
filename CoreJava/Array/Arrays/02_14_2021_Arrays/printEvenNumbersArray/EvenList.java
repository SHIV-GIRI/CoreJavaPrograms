package printEvenNumbersArray;

public class EvenList 
{

	public static int[] getEvenArray(int[] givenArray) 
	{
		int count = 0;
		if(givenArray.length >= 10)
		{
			for (int index = 0; index < givenArray.length; index++) 
			{
				if(givenArray[index] % 2 == 0)
				{
					count++;
				}
			}
			int[] evenArray = new int[count];
			count = 0;
			for (int index = 0; index < givenArray.length; index++) 
			{
				if(givenArray[index] % 2 == 0)
				{
					evenArray[count] = givenArray[index];
					count++;
				}
			}
			return evenArray;
		}
		else
		{
			return null;
		}
	}
}

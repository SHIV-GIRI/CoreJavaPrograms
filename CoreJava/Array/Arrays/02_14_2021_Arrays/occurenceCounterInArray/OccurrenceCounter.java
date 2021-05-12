package occurenceCounterInArray;

public class OccurrenceCounter 
{
	public static int getCount(int[] givenArray, int givenNumber)
	{
		int count = 0;
			for (int index = 0; index < givenArray.length; index++) 
			{
				if(givenArray[index] == givenNumber)
				{
					count++;
				}
			}
		if(count == 0)
		{
			return -1;
		}
		return count;
		
	}

}

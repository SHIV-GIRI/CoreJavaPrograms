package multiplesOfNumber;

public class FillMultiples 
{
	public static int[] getMultiples(int givenNumber) 
	{
		if(givenNumber <= 0)
		{
			return null;
		}
		else
		{
			int[] multiples = new int[10];
			for (int index = 0; index < 10; index++) 
			{
				multiples[index] = givenNumber * (index + 1);
			}
			return multiples;
		}
		
			
	}

}

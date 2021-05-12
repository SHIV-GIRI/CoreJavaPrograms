package PatternPrograms;
public class Collatz_Sequence {
	static void printCollatz(int n) { 

		while (n != 1) { 
			System.out.print(n + " "); 

			if ((n & 1) == 1) 
				n = 3 * n + 1; 


			else
				n = n / 2;
		} // while close 
		System.out.print(n); 
	} 


	public static void main (String[] args)  { 
		printCollatz(3); 
	} 
}
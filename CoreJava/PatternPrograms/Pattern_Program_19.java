//16 15 14 13 
//12 11 10 9 
//8 7 6 5 
//4 3 2 1 



package PatternPrograms;

public class Pattern_Program_19 {

	public static void main(String[] args) {
		int count=16;
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <= 4; j++) {
				
				System.out.print(count +" ");
				count--;
			}
			System.out.println();
		}
		

	}

}

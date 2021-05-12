package PatternPrograms;

public class Pattern_Program_23 {

	public static void main(String[] args) {
		String result = " ";
			int num = 5, temp = num;
			
			for (int row = 1; row <= 5; row++) {
				for (int col = 1; col <= 5 ; col--) {
					result += num + " ";
					num--;
				}
				result +="\n";
				
				num = temp + 5;
				temp += 5; 
		} 
			System.out.println(result);
	}
}

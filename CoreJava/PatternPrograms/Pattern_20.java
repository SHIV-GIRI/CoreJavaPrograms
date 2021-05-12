package PatternPrograms;

public class Pattern_20 {

		public static void main(String[] args) {
			int rows,columns;
			String result = "";
			for( rows=1;rows<=4;rows++) {
				for( columns=1;columns<=4;columns++) {
					if (rows % 2 != 0) {
						if (columns % 2 == 0) {
							result += " 1 ";
						} // close  2nd if
						else {
							result += " 0 ";
						} // close else
					} // close 21st if
					else {
						if (columns % 2 == 0) {
							result += " 0 ";
						}
						else {
							result += " 1 ";
						}
					}
				}
				result +="\n";
			}
			System.out.println(result);

		}

	}


package classoom_Task_Program;

public class Revers_String {

	public static void main(String[] args) {

		String name = "SHIVGIRI", revers = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			revers += name.charAt(i);
		}
		System.out.println(revers);
	} // main closing
} // class closing

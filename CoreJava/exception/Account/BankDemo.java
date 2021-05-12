package exception.account;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {

		try {
			CheckingAccount ch = new CheckingAccount();
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your account number :");

			if (ch.checkAccount(scan.nextInt())) {
				System.out.println("Enter amount to deposite");
				ch.deposit(scan.nextDouble());
			} // 1st if loop closing

			else {
				System.out.println("You entered wrong accountNo ");
				System.exit(0);
			} // 1st else loop closing

			System.out.println("Enter amount you want to withdraw");
			System.out.println("Enter your account number :");

			if (ch.checkAccount(scan.nextInt())) {
				System.out.println("Enter amount to withdraw");
				ch.withdraw(scan.nextDouble());
			} // 2nd if loop closing

			else {
				System.out.println("You entered wrong accountNo ");
				System.exit(0);
			} // 2nd else loop closing

		} catch (InsufficientFundsException e) {
			System.out.println(e);
		} // InsufficientFundsException catch closing

	} // main method closing
} // BankDemo class closing

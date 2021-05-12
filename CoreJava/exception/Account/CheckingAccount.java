package exception.account;

public class CheckingAccount {

	int accountNo = 1011;
	double balance;

	public boolean checkAccount(int accountNo) {

		if (accountNo == 1011) {
			return true;
		} // if loop checkAccount method closing
		else {
			return false;
		} // else loop checkAccount method closing
	} // checkAccount method closing

	public void withdraw(double amount) throws InsufficientFundsException {
		if (accountNo == 1011) {
			if (amount < balance) {
				
				System.out.println("Withdrawn succesfully");
				System.out.println("Remaining blance : " + (balance - amount));
			} // 2nd if loop withdraw method closing
			else {
				throw new InsufficientFundsException("Insufficient balance in your account");
			} // 1st else loop withdraw method closing
		} // 1st if loop withdraw method closing
		else {
			System.out.println("You entered wrong accountNo ");
		} // 2nd else loop withdraw method closing
	} // withdraw method closing

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited succesfully");
	} // deposit method closing

} // CheckingAccount class closing

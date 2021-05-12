package exception.account;

public class InsufficientFundsException extends Exception {

	public InsufficientFundsException(String msg) {
		super(msg);
	} // InsufficientFundsException method closing

	double amount;

	public double getAmount() {
		return amount;
	} // getAmount closing
} // InsufficientFundsException class closing

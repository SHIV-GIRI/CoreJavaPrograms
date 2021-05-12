package com.object_oriented_programs;

public class Account {
		Customer customer;
		int accountNo;
		double balance = 0;
		float intrest;

		void deposit(double amount) {
			balance += amount;
		} // deposit method closing

		void withdraw(double amount) {
			if (amount < balance) {
				balance -= amount;
				System.out.println("Account balance = " + balance);
			} else {
				System.out.println("Not Sufficent balance.");
			}
		} // withdraw method closing

		@Override
		public String toString() {
			return "Account [customer=" + customer + ", accountNo=" + accountNo + ", balance=" + balance + ", intrest="
					+ intrest + "]";
		} // public String toString closing

	} //  class closing

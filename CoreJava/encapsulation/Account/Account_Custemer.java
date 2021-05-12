package com.object_oriented_programs;

public class Account_Custemer {

	public static void main(String[] args) {
		Customer customer = new Customer("Rama", "Krishna");
		Account account = new Account();
		account.accountNo = 101;
		account.balance = 10000;
		account.intrest = 2;
		account.customer = customer;
		System.out.println(account.toString());

		account.deposit(20000);
		account.withdraw(5000);

		System.out.println(account.toString());

	} // main closing

} // closing class
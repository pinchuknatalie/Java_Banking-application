package ca.poltech.mybank.account;

import java.util.UUID;

public class Account {

	private String accountNumber;
	private String accountType;
	private double balance;
	private double limit;
	
	public static String SAVING_ACCOUNT = "savings";
	public static String CHEKING_ACCOUNT = "checking";
	
	
	
	public Account(int accountNumber, String accountType) {
		//getting an universal Identifier for this account
		this.accountNumber = UUID.randomUUID().toString();
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		super.toString();

		return "Account [accountNumber=" + accountNumber + ", accountType=" + accountType + ", balance=" + balance + ", limit=" + limit + "]";
	}

	public Account(int accountNumber, String accountType, double balance, double limit) {
		super();
		//
		this.accountNumber = UUID.randomUUID().toString();
		this.accountType = accountType;
		this.balance = balance;
		this.limit = limit;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance + limit;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}

}

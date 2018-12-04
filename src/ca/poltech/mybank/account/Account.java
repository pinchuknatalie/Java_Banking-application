package ca.poltech.mybank.account;

import java.util.Date;
import java.util.UUID;

public class Account {
	
	public static int ACCOUNT_STATUS_ACTIVE = 1;
	public static int ACCOUNT_STATUS_INACTIVE = 0;

	
	protected String accountNumber;
	protected Date openingDate;
	protected int status;
	protected double balance;
	
	
	public Account(Date openingDate, String status, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.openingDate = openingDate;
		this.balance = balance;
		this.status = ACCOUNT_STATUS_ACTIVE;
	}

	public boolean deposit(double value) {
		
		this.balance += value;
		return true;
	
	public boolean withdraw(double value) {
		
		final double finalBalance = this.balance
	}
	
	
	}
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Date getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public Account(int accountNumber, Date openingdate) {
		super();
		this.accountNumber = accountNumber;
		this.openingDate = openingDate;
	}
	
	public boolean deposit(double value) {
		// we will work on that logic later
		return true;
	}
	public boolean withdraw(double value) {
		//we will work on that logic later
		return true;
	}
}
	
	


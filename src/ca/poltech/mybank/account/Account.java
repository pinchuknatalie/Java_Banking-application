package ca.poltech.mybank.account;

import java.util.Date;
import java.util.UUID;

public abstract class Account {
	
	public static int ACCOUNT_STATUS_ACTIVE = 1;
	public static int ACCOUNT_STATUS_INACTIVE = 0;

	
	protected String accountNumber;
	protected Date openingDate;
	protected int status;
	protected double balance;
	
	public Account() {
		
	}
	public Account(Date openingDate, double balance) {
		super();
		this.accountNumber = UUID.randomUUID().toString();
		this.openingDate = openingDate;
		this.balance = balance;
		this.status = ACCOUNT_STATUS_ACTIVE;
	}

	public final boolean deposit(double value) {
		
		if(value < 0) {
			return false;
		}
		
		this.balance += value;
		return true;
	}
	
	public final boolean transferTo(Account destination, double value) {
		
		//dont accept null destinations
		if(destination == null) {
			return false;
		}
		//first withdraw from my account and then send it to the destination
		if(this.withdraw(value)) {
			destination.deposit(value);
			return true;
		}
		
		return false;
	}
	
	public abstract boolean withdraw(double value);
		
	public String getAccountNumber() {
			return accountNumber;
		}
		
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public Date getOpeningDate() {
			return openingDate;
			
	}
	
	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
		
	}
	
	public void setSatus(int status) {
		this.status = status;
		
	}
		
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	
	public String toString() {
		return "from the parent";
		
		
	}
	
}		
		
	
	
	
	
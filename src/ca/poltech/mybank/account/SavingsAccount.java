package ca.poltech.mybank.account;

import java.util.Date;

public class SavingsAccount extends Account {

	private double interestRate;
	private double interestInterval;
	
	
	public SavingsAccount(int accountNumber, Date openingDate, String status, double balance, double interestRate,
			double interestInterval) {
		super(accountNumber, openingDate, status, balance);
		this.interestRate = interestRate;
		this.interestInterval = interestInterval;
	}
	
	
}

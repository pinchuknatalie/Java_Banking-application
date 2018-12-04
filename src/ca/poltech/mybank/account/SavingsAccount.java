package ca.poltech.mybank.account;

import java.util.Date;

public abstract class SavingsAccount extends Account {

	private double interestRate;
	private double interestInterval;
	
	
	public SavingsAccount(Date openingDate, double interestRate, double interestInterval, double balance) {
			
		super(openingDate, balance);
		this.interestRate = interestRate;
		this.interestInterval = interestInterval;
	}
	
	public boolean withdraw(double value) {
		final double finalBalance = this.balance - value;
		
		if(finalBalance >= 0) {
			this.balance = finalBalance;
			
			return true;
		
		}
		
		return false;
		
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestInterval() {
		return interestInterval;
	}

	public void setInterestInterval(double interestInterval) {
		this.interestInterval = interestInterval;
	}

	@Override
	public String toString() {
		return "SavingsAccount [interestRate=" + interestRate + ", interestInterval=" + interestInterval
				+ ", accountNumber=" + accountNumber + ", openingDate=" + openingDate + ", status=" + status
				+ ", balance=" + balance + "]";
	}
	
		
}



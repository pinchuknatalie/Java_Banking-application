package ca.poltech.mybank.product.account;

import java.util.Date;

import ca.poltech.mybank.misc.Utilities;
import ca.poltech.mybank.product.Product;

public class CheckingAccount extends Product implements Account {
 	

	private double transactionFee;
	private double limit;
	private double balance;
 	
	
	/**
	 * @param openingDate
	 * @param balance
	 * @param limit
	 * @param serviceFee
	 * @param transactionFee
	 */
	
	public CheckingAccount(Date openingDate, double balance, double limit,double serviceFeeInterval, double serviceFee, double transactionFee) {
		
		super(openingDate,serviceFeeInterval, serviceFee);
 		this.balance = balance;
		this.transactionFee = transactionFee;
		this.limit = limit;
	}
 	public double getServiceFee() {
		return transactionFee;
	}
 	public void setServiceFee(double serviceFee) {
		this.transactionFee = serviceFee;
	}
 	public double getLimit() {
		return this.balance = balance;
	
 	}
 	
 	@Override
	public final boolean transferTo(Account destination, double value) {
		return Utilities.transferMoney(this, destination, value);
 	}
		
		
 	@Override
	public boolean withdraw(double value) {
		
		final double finalBalance = this.balance - value - this.transactionFee;
 		if (finalBalance < 0) {
 		}
		return false;
 		}
 			
 		
 
 			
 	@Override
	public String toString() {
		
		return "CheckingAccount [serviceFee=" + transactionFee + ", limit=" + limit + ", balance=" + balance
				+ ", monthlyFee=" + transactionFee + ", id=" + id + ", openingDate=" + creationDate + ", lastUpdate="
				+ lastUpdate + ", status=" + status + "]";
	}
	@Override
	public boolean deposit(double value) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
}
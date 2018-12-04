package ca.poltech.mybank.account;
import java.util.Date;

import ca.poltech.mybank.account.Account;

public class CheckingAccount extends Account {

		private double serviceFee;
		private double limit;
		
		public boolean payBill(double value) {
			return withdraw(value);
		}
		
		public CheckingAccount(Date openingDate, double serviceFee, double limit, double balance) {
			super(openingDate, balance);
			this.serviceFee = serviceFee;
			this.limit = limit;
		}
		
		public boolean transferTo(Account destination, double value) {
			// dont acceptnull destinations
			if(destination ==null) {
				return false;
						
			}
			// first withdraw from one account and sends to another account
			if (this.withdraw(value)) {
				destination.deposit(value);
			}
			
		@Override
		public boolean withdraw(double value) {
			final double finalBalance = this.balance + this.limit - value - this.serviceFee;
			
			if (finalBalance >= 0)
				this.balance = finalBalance;
		
			return true;
			
		}
		// TODO Before showing the message, check if the user 


		@Override
		public String toString() {
			return "CheckingAccount [serviceFee=" + serviceFee + ", limit=" + limit + ", accountNumber=" + accountNumber
					+ ", status=" + status + ", balance=" + balance + "]";
		}
		
		
			
		
		}

		public double getServiceFee() {
			return serviceFee;
		}

		public void setServiceFee(double serviceFee) {
			this.serviceFee = serviceFee;
		}

		public double getLimit() {
			return limit;
		}

		public void setLimit(double limit) {
			this.limit = limit;
		}
}

package ca.poltech.mybank.account;
import java.util.Date;


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

		@Override
		public boolean withdraw(double value) {
			
			final double finalBalance = this.balance - value - this.serviceFee;
		
			if(finalBalance < 0) {
				
				if(finalBalance >= this.limit) {
					this.balance = finalBalance;
					
					return true;
				}
			}
				
			
			else if(finalBalance >= 0) {
				this.balance = finalBalance;
				return true;
			}
			//TODO Before showing the message, check if the user is already using
			//his limit and show information
			System.out.println("You dont have enough funds to execute this transaction. Your current balanc is :"
			                     + (this.balance +this.limit));
			return false;
		}

		@Override
		public String toString() {
			return "CheckingAccount [serviceFee=" + serviceFee + ", limit=" + limit + ", accountNumber=" + accountNumber
					+ ", openingDate=" + openingDate + ", status=" + status + ", balance=" + balance + "]";
		}
	
}
		
		
		
		
		
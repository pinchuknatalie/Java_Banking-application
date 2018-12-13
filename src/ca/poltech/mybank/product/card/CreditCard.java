package ca.poltech.mybank.product.card;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ca.poltech.mybank.misc.Constants;
import ca.poltech.mybank.misc.Utilities;
import ca.poltech.mybank.product.Product;

public class CreditCard extends Product implements Card {
	private Date expirationDate;
	private String brand;
	private double creditLimit;
	private double amountOwned;
	private String pinNumber;
	private List<Payment> paymentHistory;
	private List<Purchase> purchaseHistory;

	public CreditCard(Date creationDate, double serviceFeeInterval, double serviceFee, Date expirationDate,
			String brand, double creditLimit, double amountOwned, String pinNumber) {
		super(creationDate, serviceFeeInterval, serviceFee);
		this.expirationDate = expirationDate;
		this.brand = brand;
		this.creditLimit = creditLimit;
		this.amountOwned = amountOwned;
		this.pinNumber = pinNumber;
		this.paymentHistory = new ArrayList<>();
		this.purchaseHistory = new ArrayList<>();
	}

	public boolean purchase(Purchase purchase) {
		final double finalBalance = this.getAvailableCredit() - purchase.getAmount();
		if (finalBalance >= 0) {
			this.amountOwned += purchase.getAmount();
			this.purchaseHistory.add(purchase);
			return true;
		}
		System.out.println("You dont have enough funds to execute this transaction. Your current credit is :"
				+ this.getAvailableCredit());
		return false;
	}

	public double pay(double value) {
		if (value < getMinPaymentAmount()) {
			System.out.println("Sorry, the minimum reqeuired payment is " + getMinPaymentAmount());
		} else {
			// first applying possible charges by delay
			chargeByLatePayment();
			chargeByIncompletePayment();
			final double remainingAmount = (amountOwned - value);
			this.amountOwned -= value;
			this.paymentHistory.add(new Payment(value, Payment.SOURCE_ONLINE, new Date(), remainingAmount));
		}
		return this.amountOwned;
	}

	private void chargeByIncompletePayment() {
		if (!this.paymentHistory.isEmpty()) {
			final Payment lastPayment = this.paymentHistory.get(this.paymentHistory.size() - 1);
			final double totalCharge = lastPayment.getRemainingAmount()
					* Constants.CREDIT_CARD_INCOMPLETE_PAYMENT_CHARGE;
			this.amountOwned += totalCharge;
		}
	}

	private void chargeByLatePayment() {
		final Date lastPaymentDate = this.paymentHistory.isEmpty() ? creationDate
				: this.paymentHistory.get(this.paymentHistory.size() - 1).getDate();
		final double diffInDays = Utilities.getDateDiffInDays(lastPaymentDate, new Date());
		double daysToCharge = diffInDays - Constants.CREDIT_CARD_PAYMENT_PERIOD_IN_DAYS;
		while (daysToCharge > 0) {
			this.amountOwned = this.amountOwned * (1 + Constants.CREDIT_CARD_LATE_PAYMENT_DAYLY_CHARGE);
			daysToCharge--;
		}
	}

	public double getMinPaymentAmount() {
		return this.amountOwned * (1 + Constants.MINIMUM_CREDIT_CARD_PAYMENT);
	}

	public double getAvailableCredit() {
		return this.creditLimit - this.amountOwned;
	}

	@Override
	public Date getExpirationDate() {
		return this.expirationDate;
	}

	@Override
	public void SetExpirationDate(Date expiration) {
		this.expirationDate = expiration;
	}

	@Override
	public String getBrand() {
		return this.brand;
	}

	@Override
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public double getAmountOwned() {
		return amountOwned;
	}

	public void setAmountOwned(double amountOwned) {
		this.amountOwned = amountOwned;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(String pinNumber) {
		this.pinNumber = pinNumber;
	}

	public void addPayment(Payment payment) {
		this.paymentHistory.add(payment);
	}

	public List<Payment> getPaymentHistory() {
		return paymentHistory;
	}

	public void setPaymentHistory(List<Payment> paymentHistory) {
		this.paymentHistory = paymentHistory;
	}
}
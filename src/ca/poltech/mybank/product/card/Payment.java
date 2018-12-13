package ca.poltech.mybank.product.card;

import java.util.Date;

public class Payment {
	
	public static final String SOURCE_ONLINE = "ONLINE";
	public static final String SOURCE_OTHER = "OTHER";
	
	private double amount;
	private Date date;
	private double remainingAmount;
	private String source;

	public Payment(double amount, String source, Date date, double remainingAmount) {
		super();
		this.amount = amount;
		this.source = source;
		this.remainingAmount = remainingAmount;
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getRemainingAmount() {
		return remainingAmount;
	}

	public void setRemainingAmount(double remainingAmount) {
		this.remainingAmount = remainingAmount;
	}
}
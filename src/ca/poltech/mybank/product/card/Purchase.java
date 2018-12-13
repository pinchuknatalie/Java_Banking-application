package ca.poltech.mybank.product.card;

import java.util.Date;

public class Purchase {
	private Date date;
	private double amount;
	private String description;

	public Purchase(Date date, double amount, String description) {
		super();
		this.date = date;
		this.amount = amount;
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
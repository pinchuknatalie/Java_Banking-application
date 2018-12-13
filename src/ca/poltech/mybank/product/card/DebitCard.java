package ca.poltech.mybank.product.card;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ca.poltech.mybank.product.Product;
import ca.poltech.mybank.product.account.CheckingAccount;

public class DebitCard extends Product implements Card {
	private CheckingAccount linkedAccount;
	private Date expirationDate;
	private String brand;
	private List<Purchase> purchaseHistory;

	public DebitCard(CheckingAccount linkedAccount, String brand, Date creationDate, Date expirationDate,
			double serviceFeeInterval, double serviceFee) {
		super(creationDate, serviceFeeInterval, serviceFee);
		this.linkedAccount = linkedAccount;
		this.expirationDate = expirationDate;
		this.brand = brand;
		this.purchaseHistory = new ArrayList<Purchase>();
	}

	public boolean purchase(Purchase purchase) {
		if (this.linkedAccount == null) {
			System.out.println("There is no account linked to this card");
			return false;
		}
		if (linkedAccount.withdraw(purchase.getAmount())) {
			this.purchaseHistory.add(purchase);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Date getExpirationDate() {
		return expirationDate;
	}

	@Override
	public void SetExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Override
	public String getBrand() {
		return brand;
	}

	@Override
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public CheckingAccount getLinkedAccount() {
		return linkedAccount;
	}

	public void setLinkedAccount(CheckingAccount linkedAccount) {
		this.linkedAccount = linkedAccount;
	}

	public List<Purchase> getPurchaseHistory() {
		return purchaseHistory;
	}

	public void setPurchaseHistory(List<Purchase> purchaseHistory) {
		this.purchaseHistory = purchaseHistory;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
}
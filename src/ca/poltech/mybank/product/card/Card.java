package ca.poltech.mybank.product.card;

import java.util.Date;

public interface Card {
	public Date getExpirationDate();

	public void SetExpirationDate(Date expiration);

	public String getBrand();

	public void setBrand(String brand);
}

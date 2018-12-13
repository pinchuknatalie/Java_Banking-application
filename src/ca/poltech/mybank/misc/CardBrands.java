package ca.poltech.mybank.misc;

public enum CardBrands {
	
	
	visa("visa", "Visa cards"),
	masterCard("master", "Master Card"),
	dinnersclub("dinners", "Dinners club"),
	americanexpress("ame", "American express");
	
	
	public final String key;
	public final String name;
	
	
	private CardBrands(String key, String name) {
		this.key = key;
		this.name = name;
	}


	public String getKey() {
		return key;
	}



	public String getName() {
		return name;
	}
}

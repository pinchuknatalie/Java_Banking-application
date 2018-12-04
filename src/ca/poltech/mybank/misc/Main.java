package ca.poltech.mybank.misc;

import java.text.ParseException;
import java.util.Date;

import ca.poltech.mybank.account.CheckingAccount;


public class Main {

	public static void main(String[] args) throws ParseException {
		
		CheckingAccount account = new CheckingAccount(new Date(), 2, 45.0, 100);
		
	}
}

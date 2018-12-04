package ca.poltech.mybank.misc;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ca.poltech.mybank.account.Account;
import ca.poltech.mybank.address.Address;


public class Utilities {
	private static Pattern canadaZipCodePattern = Pattern.compile(Constants.CANADA_POSTAL_CODE_REGEX);
	private static Pattern decimalNumberPattern = Pattern.compile(Constants.DECIMAL_NUMBER_REGEX);
	private static Pattern datePattern = Pattern.compile(Constants.BIRTH_DATE_REGEX);
	private static SimpleDateFormat dateFormatter = new SimpleDateFormat(Constants.BIRTH_DATE_ACCEPTED_FORMAT);
	
	/**
	 * This method returns a Date out of a calendar
	 * @param year
	 * @param month (first month of the year is 0
	 * @param dayOfMonth
	 * @return the Date
	 */
	
	
	public static Date getDate(int year, int month, int dayOfMonth) {
	
	final Calendar myCalendar = Calendar.getInstance();
	
	myCalendar.set(Calendar.YEAR, year);
	myCalendar.set(Calendar.MONTH, month);
	myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
	
	return myCalendar.getTime();
	
	}
	
	/*public static Account CreateAccount() {
	Scanner scan = new Scanner(System.in);
	
		// use
	String AccountType = getUserInput("Enter the Account Type (c for checking and s for savings):", scan, false);
		
		//tip: use regex to make sure we are getting a double and fix the error below
		//double balance = getUserInput("Enter the Account balance, scan, false", scan, false);
		double limit = getUserInput("Enter the Account limit, scan, false", scan, false);
	}
		*/
		
	public static Address createAddress () {
	
	
	Scanner scan = new Scanner(System.in);
	
	String zipCode;
	
	do {
		zipCode = getUserInput("Please enter the ZipCode: ", scan, false);
	} while (!validePostalCode(zipCode));
	
	
	//String zipCode = getUserInput("Enter zipCode: ", scan, false);
	String address = getUserInput("Enter address: ", scan, false);
	String unitNumber = getUserInput("Enter unitNumber: ", scan, false); 
	String city = getUserInput("Enter city: ", scan, false);
	String province = getUserInput("Enter province: ", scan, false);
	String country = getUserInput("Enter country: ", scan, false);
	
	scan.close();
	
	
	return new Address(zipCode, address, unitNumber, city, province, country);
		
	}
	
	public static  String getUserInput(String message, Scanner scan, boolean acceptsEmptyValues) {
		
		String value = "";
		
		do {
			System.out.println(message);
			value = scan.nextLine();
		} while (!acceptsEmptyValues && value.isEmpty());
		
		return value;
	}
		
		
		public static boolean validePostalCode(String postalCode) {
			if(postalCode == null || postalCode.isEmpty()) 
			{
				return false;
			}
			return postalCode.trim().length() == 6;
		}
		
	}	
		
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


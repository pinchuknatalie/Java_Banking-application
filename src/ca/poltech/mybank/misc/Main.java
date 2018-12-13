package ca.poltech.mybank.misc;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import ca.poltech.mybank.customer.Customer;
import ca.poltech.mybank.product.Product;
import ca.poltech.mybank.product.account.SavingsAccount;
 

public class Main {
 	
	public static void main(String[] args) throws ParseException {
 		
		Scanner scan = new Scanner(System.in);
		
		Customer customer = Utilities.createCustomerFromUserInput(scan);
		
		System.out.println(customer);
		
		scan.close();
		
		
		}
}
		

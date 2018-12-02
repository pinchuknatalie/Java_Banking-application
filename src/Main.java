import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import ca.poltech.mybank.account.Account;
import ca.poltech.mybank.address.Address;
import ca.poltech.mybank.customer.Customer;
import ca.poltech.mybank.misc.Utilities;

public class Main {

	public static void main(String[] args) {
		
		// Account newAccount = new Account(Account.CHEKING_ACCOUNT);
		
		/*
		 * Address myAddress = Utilities.createAddress();
		 * System.out.println(newAccount)
		 * System.out.println(Utilities.validePostalCode(""));
		System.out.println(Utilities.validePostalCode(null));
		System.out.println(Utilities.validePostalCode("a"));
		System.out.println(Utilities.validePostalCode("45353bfgfgfv"));
		System.out.println(Utilities.validePostalCode("ddd666"));
		 */
	
		
		
		
			/*String something = Utilities.getUserInput("input smth");
		
		String[] myArray = new String[10];
		
			Scanner scan;
			for(int i = 0; i < myArray.length; i++) {
				
				String something = Utilities.getUserInput("enter a value for the array position" + i, scan);
				myArray[i] = something;
			}
		
		scan.close();
		
		
		System.out.println(myArray);
		
		System.out.println(message);
		Scanner scan = new Scanner(System.in);
		
		String userInput = scan.nextLine();
		
		System.out.println(userInput);
		
		scan.close();
		*/
	
		Address address = new Address("V7C2P6", "333 Azure Rd", "25", "Vancouver", "BC", "Canada");
		Account savingsAccount = new Account(001, "Savings");
		Account checkingAccount = new Account(002, "Checkings");
		
		
		
		final Date birthDate = Utilities.getDate(1988, 29, 8);
		
		//This initializes the array with 2 accounts, meaning that the size of the array will also be 2
		Account[] accounts = new Account[] {savingsAccount, checkingAccount};
		
		Account savings1Account = new Account(003, "Savings");
		Account checking1Account = new Account(004, "Checkings");
		
		
		Customer customer = new Customer("8982", "Nataliia Pinchuk", "Female", birthDate, address, accounts);
		
		customer.addAccount(new Account[] {savings1Account, checking1Account});
		
		Account oneMoreCheckingAccount = new Account(003, "Checking");
		customer.addAccount(oneMoreCheckingAccount);
		
		
	
		System.out.println(address);
		
		
		Calendar myCalendar  = Calendar.getInstance();
		myCalendar.set(Calendar.YEAR, 1988);
		myCalendar.set(Calendar.MONTH,5);
		myCalendar.set(Calendar.DAY_OF_MONTH, 8);

	
				
		
		
		
		
		
		System.out.println(customer);
		
		//System.out.println(customer.getAddress().getCity());
		//System.out.println(customer.getAccounts()[2].getAccountNumber());
		
		// create a customer (you)
		// create an address ()
		// create an account
		// they all need to be related
		// Nataliia Customer will have one address and one account
		

	}

}


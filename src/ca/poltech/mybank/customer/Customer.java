package ca.poltech.mybank.customer;
import java.util.Arrays;
import java.util.Date;

import ca.poltech.mybank.account.Account;
import ca.poltech.mybank.address.Address;

public class Customer {
	
	private String id;
	private String name;
	private String gender;
	private Date birthDate;
	private Address address;
	private Account[] accounts;
	

	public Customer(String id, String name, String gender, Date birthDate, Address address, Account[] accounts) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.birthDate = birthDate;
		this.address = address;
		this.accounts = accounts;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	
	public void addAccount(Account account) {
		
		//creates an array with one more position so it can hold the new Account
		Account newArray[] = new Account[accounts.length+1];
		
		//copy all the old array accounts to the new array
		System.arraycopy(accounts, 0, newArray, 0, accounts.length);
		
		//putting the newly created account into the last position of the new array
		newArray[newArray.length-1] = account;
		
		//pointing the account memory address to the same memory address as the created array
		accounts = newArray;
		
	}
		
		@Override
		public String toString() {
			return "Customer [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + ", accounts="
					+ Arrays.toString(accounts) + "]";
		}
		//TODO at home. add multiple accounts
		
		public void addAccount(Account[] newAccounts) {
			
			// calculate new required array size
			int newArraySize = this.accounts.length + newAccounts.length;
			
			//create array with a new size
			Account newArray[] = new Account[newArraySize];
			
			// System.arraycopy(src, srcPos, dest, destPos, length);
			
			//copy original accounts array (this.accounts) and new accounts array into new array
			System.arraycopy(this.accounts, 0, newArray, 0, this.accounts.length);
			System.arraycopy(newAccounts, 0, newArray, this.accounts.length, newAccounts.length);
			
			//update the content of original array with new array
			this.accounts = newArray;
			
			//creates an array with one more position so it can hold the new Account
			//Account newArray[] = new Account[accounts.length+1];
			
			//copy all the old array accounts to the new array
			//System.arraycopy(accounts, 0, newArray, 0, accounts.length);
			
			//putting the newly created account into the last position of the new array
			//newArray[newArray.length-1] = newAccounts;
			
			//pointing the account memory address to the same memory address as the created array
			// accounts = newArray;
			
		}
		
		
		
		
		
		
		/*int newArraySize = this.accounts.length + accounts.length;
		
		Account new Array[] = new Account[newArraySize] {
		
		//copy all the old arrays accounts to the new array
		System.arraycopy(this.accounts, 0, newArray, 0, this.accounts.length);
		System.arraycopy(accounts, 0, newArray, 0, this.accounts.length, accounts.length);
		}
		
		
		
		this.accounts = newArray;
		
		*/
		
		public void addAccounts(Account[] accounts) {
			
			for(int i=0; i<accounts.length; i++) {
				addAccount(accounts[i]);
			}
		}
		
		
		
		
		///System.arraycopy(accounts, 0, dest, newArray, 0, accounts.length);
}
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

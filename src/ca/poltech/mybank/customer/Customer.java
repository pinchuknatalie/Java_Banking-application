package ca.poltech.mybank.customer;

import java.util.Collection;
import java.util.Date;

import java.util.Set;
import ca.poltech.mybank.address.Address;
import ca.poltech.mybank.product.Product;


public class Customer {

	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private Date birthDate;
	private Address address;
	private Set<Product> products;

	
	public Customer(String id, String firstName, String lastName, String email, String gender, Date birthDate,
			Address address, Set<Product> products) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.birthDate = birthDate;
		this.address = address;
		this.products = products;
	}

	

	// GETTERS AND SETTERS

	
	public Customer(String id2, String name, String gender2, Date birthDate2, Address address2, Product[] products2) {
		// TODO Auto-generated constructor stub
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	/**
	 * Adds a new account to the existing product list
	 * 
	 * @param product
	 */
	public void addProduct(Product product) {
		this.products.add(product);
	}

	/**
	 * Inserts one or more product in the existing product list
	 * 
	 * @param accounts
	 */
	public void addProducts(Collection<? extends Product> products) {

		this.products.addAll(products);		

}



	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder("Customer [id=" + id + ", name=" + firstName + " " + lastName + ", email="
				+ email+ ", gender="
						+ gender + ", birthDate=" + birthDate + ",\naddress=" + address + ", products=");
 		for (Product prod : products) {
			sb.append("[").append(prod).append("]");

 		}
		return email;
	}
}
	
	

	

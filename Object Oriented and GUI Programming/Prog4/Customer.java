/**
 * COSC 210-001 Assignment 4
 * Customer.java
 * 
 * This class creates the Customer object and contains the 
 * name, street address, city, state, zip code, and phone number of the customer
 * renting the videos
 * @author Lane Shea
 *
 */
public class Customer {
private String custName;
private String address;
private String city;
private String state;
private String zipCode;
private String phoneNum;

public Customer(String custName, String address, String city, String state, String zipCode, String phoneNum) {
	super();
	this.custName = custName;
	this.address = address;
	this.city = city;
	this.state = state;
	this.zipCode = zipCode;
	this.phoneNum = phoneNum;
}

public String getCustName() {
	return custName;
}

public String getAddress() {
	return address;
}

public String getCity() {
	return city;
}

public String getState() {
	return state;
}

public String getZipCode() {
	return zipCode;
}

public String getPhoneNum() {
	return phoneNum;
}


}


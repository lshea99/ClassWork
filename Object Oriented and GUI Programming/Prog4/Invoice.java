/**
 * COSC 210-001 Assignment 4
 * Invoice.java
 * 
 * This class creates the Invoice object by calculating the 
 * subtotal, tax, and total. The invoice is also printed using the printInvoice
 * method
 * @author Lane Shea
 *
 */
public class Invoice {
private String dateRented;
private int daysRented;
private String video;
private String customer;



public Invoice(String dateRented, int daysRented, String video, String customer) {
	super();
	this.dateRented = dateRented;
	this.daysRented = daysRented;
	this.video = video;
	this.customer = customer;
}


public String getDateRented() {
	return dateRented;
}



public int getDaysRented() {
	return daysRented;
}



public String getVideo() {
	return video;
}



public String getCustomer() {
	return customer;
}


/**
 * This method calculates subtotal by multiplying daysRented by dailyRate
 * 
 * @param dailyRate
 */
public double subtotal(double dailyRate) {
	return daysRented*dailyRate;
}
/**
 * This method calculates the 6% tax by multiplying the subtotal by 0.06
 * @param dailyRate
 */
public double tax(double dailyRate) {
	return (daysRented*dailyRate)*0.06;
}
/**
 * This method calculates the total by adding the subtotal and tax
 * @param dailyRate
 */
public double total(double dailyRate) {
	return subtotal(dailyRate)+tax(dailyRate);
}
/**
 * This method prints the invoice and displays Customer information, Video information,
 *  date of rental, days rented, subtotal, tax, and total.
 * @param dailyRate
 * @param copyNum
 * @param year
 */
public void printInvoice(double dailyRate, int copyNum, int year) {
	System.out.println(" Invoice ");
	System.out.println("Customer info: \n" + customer);
	System.out.println("Video name: " +video);
	System.out.println("Video Copy Number: "+copyNum);
	System.out.println("Video Year: " + year);
	System.out.println("Date Rented: "+dateRented);
	System.out.println("Days Rented: "+daysRented);
	System.out.printf("Subtotal: $%.2f\n", subtotal(dailyRate));
	System.out.printf("Tax: $%.2f\n", tax(dailyRate));
	System.out.printf("Total: $%.2f\n\n", total(dailyRate));
	
	
}
}

/**
 * COSC 210-001 Assignment 4
 * Prog4.java
 * 
 * This class instantiates customer and video objects and tests the
 * program by printing three invoices
 * @author Lane Shea
 *
 */
public class Prog4 {

	public static void main(String[] args) {
		//Instantiate Customer Objects
		Customer c1 = new Customer("Lane Shea", 
				"\n1148 Washington Street", "Indiana",
				"Pennsylvania", "15701", "\n412-877-7704");
		
		Customer c2 = new Customer("Elvis Presley", 
				"\n1130 School Street", "Indiana",
				"Pennsylvania", "15701", "\n265-336-8879");
		//Instantiate Video Objects
		Video v1 = new Video("The Shawshank Redemption", 1994, 21, 2.50);
		Video v2 = new Video("Jack and Jill", 2011, 46, 3.00);
		
		//Save customer information as a String
		String customer1 = c1.getCustName()+" "+c1.getAddress()+" "
		+c1.getCity()+" "+c1.getState()+" "+c1.getZipCode()+" "+c1.getPhoneNum();
		
		String customer2 = c2.getCustName()+" "+c2.getAddress()+" "
		+c2.getCity()+" "+c2.getState()+" "+c2.getZipCode()+" "+c2.getPhoneNum();
		
		//Instantiate Invoice Objects
		Invoice i1 = new Invoice("10/6/2019", 6, v1.getVideoName(), customer1);
		Invoice i2 = new Invoice ("10/6/2019", 5, v2.getVideoName(), customer2);
		Invoice i3 = new Invoice ("10/6/2019", 4, v1.getVideoName(), customer2);
		
		//Call the print invoice method to print invoice with desired customer and videos
		i1.printInvoice(v1.getDailyRate(), v1.getCopyNum(), v1.getYear());
		i2.printInvoice(v2.getDailyRate(), v2.getCopyNum(), v2.getYear());
		i3.printInvoice(v1.getDailyRate(), v1.getCopyNum(), v1.getYear());
	}
}

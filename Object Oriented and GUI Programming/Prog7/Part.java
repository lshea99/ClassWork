/**
 * COSC 210-001 Assignment 7
 * Part.java
 * 
 * This class reads creates a Part object that stores part number,
 *  description, price, warehouse ID, and quantity. Additionally, 
 *  the total number of parts in the various warehouses are calculated
 *  in this class.
 * @author Lane Shea
 */
public class Part implements Comparable{
private String partNum;
private String description;
private double price;
private String warehouseID;
private int quantity;

public Part(String partNum, String description, double price, String warehouseID, int quantity) {
	super();
	this.partNum = partNum;
	this.description = description;
	this.price = price;
	this.warehouseID = warehouseID;
	this.quantity = quantity;
}

public String getPartNum() {
	return partNum;
}

public String getDescription() {
	return description;
}

public double getPrice() {
	return price;
}

public String getWarehouseID() {
	return warehouseID;
}

public int getQuantity() {
	return quantity;
}
/**
 * This class calculates the total Parts by keeping 
 * a running total of the quantity of parts whenever
 * the part warehouse ID matches the given warehouse ID.
 * @param part
 * @return totalParts
 */
public int totalParts(Part[] part) {
	int totalParts = 0;
	for (int i=0;i<13;i++) {
		if (part[i].getWarehouseID().equals(this.warehouseID)) {
			totalParts = totalParts + part[i].getQuantity();
		}
	}
	return totalParts;
}

@Override
public int compareTo(Object arg) {
	if (this.price > ((Part)arg).price ) {
		return 1;
	}
	else if (this.price < ((Part)arg).price ) {
		return-1;
	}
	else {
	return 0;
	}
}

}

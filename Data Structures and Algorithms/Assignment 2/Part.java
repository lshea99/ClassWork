/**
 * COSC 310-002 Assignment 2
 * Part.java
 * 
 * This class creates a Part object that stores the part number, description,
 * price, warehouseID, and quantity. The equals method allows part objects to be 
 * compared by part number.
 * 
 * @author Lane Shea
 */
public class Part {
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

public Part(String partNum) {
	super();
	this.partNum = partNum;
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

@Override
public boolean equals(Object arg) {
	return this.partNum.equals(((Part)arg).partNum);
}
}
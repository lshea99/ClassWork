/**
 * COSC 210-001 Assignment 7
 * Warehouse.java
 * 
 * This class reads creates a Warehouse object that stores the
 * warehouse ID,warehouse city, and warehouse state.
 * @author Lane Shea
 */
public class Warehouse {
private String warehouseID;
private String city;
private String state;

public Warehouse(String warehouseID, String city, String state) {
	super();
	this.warehouseID = warehouseID;
	this.city = city;
	this.state = state;
}

public String getWarehouseID() {
	return warehouseID;
}

public String getCity() {
	return city;
}

public String getState() {
	return state;
}
public String toString() {
	return warehouseID+" "+city+", "+state;
}
}

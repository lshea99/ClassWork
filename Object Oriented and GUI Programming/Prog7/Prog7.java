/**
 * COSC 210-001 Assignment 7
 * Prog7.java
 * 
 * This class reads the parts.txt and warehouse.txt files and uses the 
 * information to print a detailed report that includes the warehouse
 * location and number of parts along with the part number, description,
 * and quantity.
 * @author Lane Shea
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Prog7 {

	public static void main(String[] args) {
		String warehouseID;
		String city;
		String state;
		String partNumber;
		String description;
		double price;
		int quantity;
		int numWarehouses=0;
		int numParts=0;
		Warehouse warehouse [] = new Warehouse[10];
		Part part [] = new Part[13];
		
		Scanner inFile = null;
		//Open file
		try {
			inFile = new Scanner( new File( "warehouse.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("Error: File warehouse.txt not found");
	}
		try {
		}
		catch (Exception e) {
			System.err.println("File error "+e.getMessage());
		}
		//Read file
		while(inFile.hasNext()) {
			warehouseID=inFile.next();
			city=inFile.next();
			state=inFile.next();
			Warehouse warehouseObject = new Warehouse(warehouseID,city,state);
			warehouse[numWarehouses] = warehouseObject;
			numWarehouses++;
		}
		//Open file
		try {
			inFile = new Scanner( new File( "parts.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("Error: File parts.txt not found");
	}
		try {
		}
		catch (Exception e) {
			System.err.println("File error "+e.getMessage());
		}
		//Read file
		while(inFile.hasNext()) {
			String record = inFile.nextLine();
			String [] tokens = record.split(",[ ]*");
			partNumber = tokens[0];
			description = tokens[1];
			price = Double.parseDouble(tokens[2]);
			warehouseID = tokens[3];
			quantity = Integer.parseInt(tokens[4]);
			Part partObject = new Part(partNumber,description,price,warehouseID,quantity);
			part[numParts] = partObject;
			numParts++;
		}
		inFile.close();
		Arrays.sort(part);
		for (int i=0;i<numWarehouses;i++) {
			System.out.printf("%s\n", warehouse[i].toString());
			System.out.printf("Total Number of Parts: %3d\n\n", part[i].totalParts(part) );
			System.out.printf("%-6s %-35s %-8s %-8s\n","Part#","Description","Price","Quantity" );
		for (int j=0;j<numParts;j++) {
			if (part[j].getWarehouseID().equals(warehouse[i].getWarehouseID())){
				System.out.printf("%-6s %-32s %8.2f %9d\n",
						part[j].getPartNum(),
						part[j].getDescription(),
						part[j].getPrice(),
						part[j].getQuantity());
			}
		} 
		System.out.println(); 
		}
	}
}

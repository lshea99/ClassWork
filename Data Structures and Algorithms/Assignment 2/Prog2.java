/**
 * COSC 310-002 Assignment 2
 * Prog2.java
 * 
 * This class reads a text file containing a comma delimited list
 * containing part numbers, descriptions, prices, warehouse ID's, and quantities.
 * After reading the information from the file, the information is placed in a 
 * Part object and added to a Listarray that is searchable by part number. 
 * Next a prompt is given to a user to remove a part from the list array by part
 * number.
 * 
 * @author Lane Shea
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prog2 {
	

	public static void main(String[] args) {
		String partNum = "";
		String description = "";
		double price = 0.0;
		String warehouseID = "";
		int quantity = 0;
	
		Scanner inFile = null;
		Scanner in = new Scanner(System.in); 
		
		ListArray <Part> list = new ListArray<Part>();
		//open file
		 try
	        {
	            inFile = new Scanner( new File( "parts.txt" ) );
	        }
	        catch( FileNotFoundException e )
	        {
	            System.out.println( "Error: File not found" );
	        }
	        System.out.printf("%-6s %-31s %-9s %13s %10s", "Part#", "Description", "Price", "Warehouse ID", "Quantity");
	        System.out.printf("\n%-6s %-31s %8s %13s %10s", "-----", "------------------------------", "---------", "------------", "--------");
	       // read file
	        while( inFile.hasNext() )
	        {
	            String record = inFile.nextLine();
	            String[] tokens = record.split( ",[ ]*" );
	            
	            partNum = tokens[0];
	            description = tokens[1];
	            price = Double.parseDouble(tokens[2]);
	            warehouseID = tokens[3];
	            quantity = Integer.parseInt(tokens[4]);
	            
	            Part p = new Part(partNum,description,price,warehouseID,quantity);
	            list.add(p);
	            
	            System.out.printf("\n%-6s %-31s $%8.2f %11s %10d",
	            		partNum, description, price, warehouseID, quantity);
		}
	        //Searching for part number
	        System.out.print("\n\nPlease enter part number: ");
	        String input = in.next();
	        Part search = new Part(input);

	        if (list.contains(search)) {
	        	int i = list.indexOf(search);
	        	System.out.printf("\n%-6s %-31s %-9s %13s %10s",
	        			"Part#", "Description", "Price", "Warehouse ID", "Quantity");
		        System.out.printf("\n%-6s %-31s %8s %13s %10s",
		        		"-----", "------------------------------", "---------", "------------", "--------");
		        System.out.printf("\n%-6s %-31s $%8.2f %11s %10d",
		        		input, list.get(i).getDescription(), list.get(i).getPrice(), list.get(i).getWarehouseID(), list.get(i).getQuantity());
			}
			else {
				System.out.println("Part number not found");

			}
	        //removing part from ListArray by part number
	        System.out.print("\n\nEnter part number to be removed:  ");
	        String removeInput = in.next();
	        Part remove = new Part(removeInput);
	        if (list.contains(remove)) {
	        	int i = list.indexOf(remove);
	        	list.remove(i);
	        	System.out.println("\nPart "+removeInput+" removed from list\n\n");
	        	System.out.printf("%-6s %-31s %-9s %13s %10s",
	        			"Part#", "Description", "Price", "Warehouse ID", "Quantity");
		        System.out.printf("\n%-6s %-31s %8s %13s %10s",
		        		"-----", "------------------------------", "---------", "------------", "--------");
	        	 for(int j=0;j<list.size();j++) {
		        System.out.printf("\n%-6s %-31s $%8.2f %11s %10d",
		        		list.get(j).getPartNum(), list.get(j).getDescription(), list.get(j).getPrice(), list.get(j).getWarehouseID(), list.get(j).getQuantity());
	        }
	        }
	        else {
	        	System.out.println("Part number not found\n\n");
	        }
	        in.close(); 
	       
	        
	        
	}
}

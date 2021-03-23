/**
 * COSC 310-002 Assignment 7
 * EmployeeMenu.java
 *  
 * Class to display a menu and process the selection.
 * 
 * @author Lane Shea
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class EmployeeMenu<E>
{
	 private BST<Employee> list = new BST<Employee>();
	 
	
	/*
	 * Constructor that reads employee information from a file,
	 * creates an employee object, and adds it to a binary search tree
	 */
	public EmployeeMenu()
	{
		String empID = "";
		String fName = "";
		String lName = "";
		double salary = 0.0;
		Scanner inFile = null;
		//open file
		 try {
	           inFile = new Scanner( new File( "employee.txt" ) );
	        }
	        catch( FileNotFoundException e ) {
	        
	            System.out.println( "Error: File not found" );
	        }
		 //read file
		 while(inFile.hasNext()) {
			 String record = inFile.nextLine();
	         String[] tokens = record.split(",[ ]*");
	         empID = tokens[0];
	         fName = tokens[1];
	         lName = tokens[2];
	         salary = Double.parseDouble(tokens[3]);
	         Employee e = new Employee(empID,fName,lName,salary);
	         list.add(e);
		 }
	}

	/*
	 * Display a menu with options and call the appropriate method
	 * to perform the requested action.
	 */
	public void display()
	{
		int option = displayMenu();
		while( option != 0 )
          {
			// process menu selection
			switch( option )
			{
			case 1:
				displayEmployee();
				break;
			case 2:
				addEmployee();
				break;
			case 3:
				findEmployee();
				break;
			default:
				System.out.println("Invalid selection");
			}
			option = displayMenu();
		}
		System.out.println("Done");
	}
	
	private int displayMenu()
	{
		System.out.println( );
		System.out.println("Employee Menu");
		System.out.println("-------------");
		System.out.println("  1. Display employees");
		System.out.println("  2. Add employee");
		System.out.println("  3. Find employee");
		System.out.println("  0. Exit");
		System.out.print("Enter number: ");
		Scanner in = new Scanner(System.in);
		return in.nextInt();
	}
	
	/*
	 * Method to display all employees in the binary search tree
	 */
	private void displayEmployee()
	{
		System.out.print(list.toString());
		System.out.println( "This option should display all of the employees");
	}

	/*
	 * Method to add an employee to the binary search tree
	 */
	private void addEmployee()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an Employee ID: ");
		String employeeID = input.next();
		System.out.println("Enter a First name: ");
		String firstName = input.next();
		System.out.println("Enter a Last name: ");
		String lastName = input.next();
		System.out.println("Enter a Salary: ");
		double salary = input.nextDouble();
		Employee emp = new Employee(employeeID, 
				firstName, lastName, salary);
		if (!list.add(emp)) {
			System.out.println("The user you are trying to enter is already in the system.");
		}
		list.add(emp);
		
	}
	
	/*
	 * Method to find and display an employee in the 
	 * binary search tree
	 */
	private void findEmployee()
	{
		System.out.println( "This option should find an employee");		
	}
}

	
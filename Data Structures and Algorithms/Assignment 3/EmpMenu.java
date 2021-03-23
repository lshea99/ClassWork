/**
 * COSC 310-002 Assignment 3
 * EmpMenu.java
 * 
 * This class creates an Employee menu object that interacts with
 * the user based on the option selected by the user.
 * 
 * @author Lane Shea
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class EmpMenu {

	private SLList<Employee> list = new SLList<Employee>();
	
	public EmpMenu() {
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
	         String[] tokens = record.split( ",[ ]*" );
	         empID = tokens[0];
	         fName = tokens[1];
	         lName = tokens[2];
	         salary = Double.parseDouble(tokens[3]);
	         Employee e = new Employee(empID,fName,lName,salary);
	         list.addTail(e);
		 }
	}
	
	public void display() {
		int option = displayMenu();
		while (option !=0 ) {
			//process menu selection
			switch( option ) {
			case 1:
				option1();
				break;
			case 2:
				option2();
				break;
			case 3:
				option3();
				break;
			case 4:
				option4();
				break;
			default:
				System.out.println("Invalid Selection");
			}
			option = displayMenu();
		}
		System.out.println("Done");
	}
	private int displayMenu() {
		System.out.println();
		System.out.println("Employee Menu");
		System.out.println("-------------");
		System.out.println("1. Display Employees");
		System.out.println("2. Find Employee");
		System.out.println("3. Add Employee");
		System.out.println("4. Remove Employee");
		System.out.println("0. Exit");
		System.out.print("\nEnter number: ");
		Scanner input = new Scanner(System.in);
		return input.nextInt();
		
	}
/*
 * Prints detailed list of all employees.
 */
	private void option1() {
		System.out.printf("\n%11s %10s %13s %13s", "Employee ID" , "First Name", "Last Name", "Salary");
		System.out.printf("\n%11s %10s %13s %13s", "-----------" , "----------", "-------------", "-------------");
		for( int i = 0; i<list.size();i++) {
			System.out.printf("\n%-11s %-10s %-13s $%,13.2f",
					list.get(i).getEmployeeID(), list.get(i).getfName(), list.get(i).getlName(), list.get(i).getSalary());
		}
		
	}
/*
 * Searches for employee by Employee ID.
 */	
	private void option2() {
		 Scanner in = new Scanner(System.in);
		 System.out.print("\nEnter Employee ID: ");
	     String input = in.next();
	     Employee target = new Employee(input);
	     int index = list.indexOf(target);
	     if (index == -1) {
	    	 System.out.println("\nEmployee not found");
	     }
	     else {
	    	 System.out.printf("\n%11s %10s %13s %13s", "Employee ID" , "First Name", "Last Name", "Salary");
	    		System.out.printf("\n%11s %10s %13s %13s", "-----------" , "----------", "-------------", "-------------"); 
	    		System.out.printf("\n%-11s %-10s %-13s $%,13.2f\n",
						list.get(index).getEmployeeID(), list.get(index).getfName(), list.get(index).getlName(), list.get(index).getSalary()); 
	     	}
	     }
/*
 *  This method adds employee with user generated information.
 */	
	private void option3() {
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter Employee ID: ");
		String empID = in.next();
		System.out.print("\nEnter First Name: ");
		String fName = in.next();
		System.out.print("\nEnter Last Name: ");
		String lName = in.next();
		System.out.print("\nEnter Salary: ");
		Double salary = in.nextDouble();
		Employee input = new Employee(empID,fName,lName,salary);
        list.addTail(input);
	}
/*
 * This method removes an employee with a user given employee
 * ID from the Single Linked List.
 * 
 */
	private void option4() {
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter ID of Employee to be removed:  ");
		String input = in.next();
		Employee target = new Employee(input);
	    int index = list.indexOf(target);
	    System.out.println("Removing Employee "+input+" at index "+index);
	    System.out.println("\nSuccessfully removed: \n"+list.remove(index));
		
	}
}

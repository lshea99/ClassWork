/**
 * COSC 210-001 Assignment 5
 * Prog5.java
 * 
 * This class instantiates the Employee objects and stores them in an array.
 * This array is used to store employee payroll information that is 
 * printed in a formatted report.
 * 
 * @author Lane Shea
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Prog5 {

	public static void main(String[] args) {
		Employee[] employees = new Employee[12];
		int numEmployees = 0;
		String fName;
		String lName;
		String rank;
		double salary;
		
		Scanner inFile=null;
		
		try {
			inFile = new Scanner( new File( "Employees.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("Error: File Employees.txt not found");
	}
		try {
			while (inFile.hasNext()) {
				fName = inFile.next();
				lName = inFile.next();
				rank = inFile.next();
				salary = inFile.nextDouble();
				Employee e = new Employee(fName,lName,rank, salary);
				employees[numEmployees]=e;
				numEmployees++;
			}
		}
		catch (Exception e) {
			System.err.println("File error "+e.getMessage());
		}
		System.out.println("Acme Corporation");
		System.out.printf("\nNumber of Employees: %14d",+numEmployees);
		System.out.printf("\nAverage Salary: %,22.2f", +Employee.averageSalary(employees, numEmployees));
		System.out.printf("\nAnnual Total: %,24.2f\n", +Employee.totalSalary(employees, numEmployees));
		System.out.printf("\n%-19s %4s %13s\n", "Name","Rank", "Salary");
		for(int i=0;i<numEmployees;i++) {
			System.out.printf("%-20s %-6s %,10.2f\n", employees[i].formatName(), employees[i].getRank(), employees[i].getSalary());
}
}
}

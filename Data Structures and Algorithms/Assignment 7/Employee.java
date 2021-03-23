/**
 * COSC 310-002 Assignment 7
 * Employee.java
 * 
 * This class creates an Employee object with the attributes 
 * employee ID, first name, last name, and salary. The compareTo and equals
 * methods allow employees to be compared by employee ID number. 
 * 
 * @author Lane Shea
 */
public class Employee implements Comparable {
private String employeeID;
private String fName;
private String lName;
private double salary;

public Employee(String employeeID, String fName, String lName, double salary) {
	super();
	this.employeeID = employeeID;
	this.fName = fName;
	this.lName = lName;
	this.salary = salary;
}

public Employee(String employeeID) {
	super();
	this.employeeID = employeeID;
}



public String getEmployeeID() {
	return employeeID;
}

public String getfName() {
	return fName;
}

public String getlName() {
	return lName;
}

public double getSalary() {
	return salary;
}

@Override
public String toString() {
	return "Employee ID: "+employeeID+
			"    Name: "+lName+", "+fName+
			"    Salary: $"+salary;
}

@Override
public int compareTo(Object arg) {
	return this.employeeID.compareTo(((Employee)arg).employeeID);
}

@Override
public boolean equals(Object arg) {
	return this.employeeID.equals(((Employee)arg).employeeID);
	}
}

/**
 * COSC 210-001 Assignment 5
 * Employee.java
 * 
 * This class creates the Employee object and contains the first name, last name,
 * rank, and salary of the employee. This class also calculates the total salary and 
 * average salary for all employees.
 * @author Lane Shea
 *
 */
public class Employee {
private String fName;
private String lName;
private String rank;
private double salary;

public Employee(String fName, String lName, String rank, double salary) {
	super();
	this.fName = fName;
	this.lName = lName;
	this.rank = rank;
	this.salary = salary;
}

public String getfName() {
	return fName;
}

public String getlName() {
	return lName;
}

public String getRank() {
	return rank;
}

public double getSalary() {
	return salary;
}
/**
 * This method formats the first and last name so it is presented as
 * lastName, firstName.
 * @return
 */
public String formatName() {
	return lName+", "+fName;
}
/**
 * This method calculates the average of all salaries fed into the program
 * by finding the sum and dividing it by the number of employees.
 * @param arr
 * @param num
 * @return
 */
public static double averageSalary(Employee arr[], int num) {
	double sum=0;
	for(int i=0;i<num;i++) {
		sum = sum + arr[i].getSalary();
		
	}
	double average = sum/num;
	return average;
}
/**
 * This method calculates the total sum of all salaries fed into the program
 * by keeping a running total as the loop progresses through the array.
 * @param arr
 * @param num
 * @return
 */
public static double totalSalary(Employee arr[], int num) {
	double total=0;
	for(int i=0;i<num;i++) {
		total = total + arr[i].getSalary();
	}
	return total;
}
}

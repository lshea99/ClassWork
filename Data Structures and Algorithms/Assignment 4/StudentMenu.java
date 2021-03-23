/**
 * COSC 310-002 Assignment 4
 * StudentMenu.java
 * 
 * This class creates a Student menu object that interacts with
 * the user based on the option selected.
 * 
 * @author Lane Shea
 */
import java.util.Scanner;

public class StudentMenu {
	private DLList<Student> list = new DLList<Student>();
	
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
		System.out.println("1. Add Student");
		System.out.println("2. List Students in Order");
		System.out.println("3. List Students in Reverse Order");
		System.out.println("0. Exit");
		System.out.print("\nEnter number: ");
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	
	private void option1() {
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter Student ID: ");
		String studentID = in.next();
		System.out.print("\nEnter First Name: ");
		String fName = in.next();
		System.out.print("\nEnter Last Name: ");
		String lName = in.next();
		System.out.print("\nEnter Major: ");
		String major = in.next();
		Student input = new Student(studentID,fName,lName,major);
        list.add(input);
	}
	
	private void option2() {
		System.out.printf("\n%-11s %10s %-13s %-13s", "Student ID" , "First Name", "Last Name", "Major");
		System.out.printf("\n%11s %10s %13s %13s", "-----------" , "----------", "-------------", "-------------");
		java.util.Iterator<Student> iter = list.iterator();
		while(iter.hasNext() ) {
			Student stu =  iter.next();
			System.out.printf("\n%-11s %-10s %-13s %-13s", stu.getStudentID(), stu.getFirstName(), stu.getLastName(), stu.getMajor() );
		}
	
		
	}
	
	private void option3() {
		System.out.printf("\n%-11s %10s %-13s %-13s", "Student ID" , "First Name", "Last Name", "Major");
		System.out.printf("\n%11s %10s %13s %13s", "-----------" , "----------", "-------------", "-------------");
		java.util.Iterator<Student> iter = list.iteratorReverse();
		while(iter.hasNext() ) {
			Student stu =  iter.next();
			System.out.printf("\n%-11s %-10s %-13s %-13s", stu.getStudentID(), stu.getFirstName(), stu.getLastName(), stu.getMajor() );
		}
	}
}

/**
 * COSC 310-002 Assignment 4
 * Student.java
 * 
 * This class creates a Student object with the attributes
 * studentID, firstName, lastName, and major.
 * 
 * @author Lane Shea
 */
public class Student {
	private String studentID;
	private String firstName;
	private String lastName;
	private String major;
	
	public Student(String studentID, String firstName, String lastName, String major) {
		super();
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.major = major;
	}

	public String getStudentID() {
		return studentID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMajor() {
		return major;
	}
	
	
}

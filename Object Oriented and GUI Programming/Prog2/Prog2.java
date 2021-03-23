/**
 * COSC 210-001 Assignment 2
 * Prog2.java
 * 
 * This is the main method that asks for input from the user 
 * regarding Student Name and Quiz Scores
 * 
 * @author Lane Shea
 */

import java.util.Scanner;
public class Prog2 {

	public static void main(String[] args) {
		int score=0;
		System.out.println("Please Enter Student Name");
		Scanner in = new Scanner(System.in);
		String name = in.next();
		Student s = new Student(name, score);
		System.out.println("Please enter Quiz Scores   \nEnter negative number to stop");
		do { 		
			score=in.nextInt();
			s.addQuiz(score);
		}
		while (score>=0);
		System.out.println("Name: "+s.getName());
		System.out.println("Total Score: "+s.totalScore());
		System.out.printf("Average: %.2f",s.averageScore());
		in.close();
	}
}

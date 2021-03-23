/**
 * COSC 210-001 Assignment 2
 * Student.java
 * 
 * This is the Student object where name, scores, and total Score are stored.
 * The total score and average score are also calculated in this method.
 * 
 * @author Lane Shea
 */
import java.util.Scanner;
public class Student {
	private String name;
	private int scores;
	private int totalScore;
	private double count;
	Scanner in = new Scanner(System.in);
	public Student(String name, int scores) {
		super();
		this.name = name;
		this.scores = scores;
	}
	public void setScores(int scores) {
		this.scores = scores;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void addQuiz( int score ) {
		if (score <0) {
			score = 0;
		}
		else {
			totalScore+= score;
			count++;
		}
	}
	int totalScore() {
		return totalScore;
	}
	double averageScore() {
		return ((double) totalScore) / count;
	}
	}
	


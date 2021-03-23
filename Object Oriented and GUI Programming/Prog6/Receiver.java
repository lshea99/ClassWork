/**
 * COSC 210-001 Assignment 6
 * Receiver.java
 * 
 * This class creates a receiver object that stores the players
 * receptions and yards. This class also calculates the players
 * yards per reception and yards per game.
 */
public class Receiver extends Player{
private int receptions;
private double yards;

public Receiver() {
	super();
}

public Receiver(String fName, String lName,String team, String position, int receptions, double yards) {
	super(fName,lName, team, position);
	this.receptions = receptions;
	this.yards = yards;
}

public int getReceptions() {
	return receptions;
}

public double getYards() {
	return yards;
}
/**
 * This method calculates yards per reception by dividing
 * yards by receptions.
 * @param yards
 * @param receptions
 */
public double yardsPerReception(double yards, int receptions) {
	return ((double)yards/receptions);
}
/**
 * This method calculates yards per game by dividing
 * yards by 16
 * @param yards
 */
public double yardsPerGame(double yards) {
	return ((double)yards/16);
}
}
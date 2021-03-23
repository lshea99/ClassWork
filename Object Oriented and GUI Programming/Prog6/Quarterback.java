/**
 * COSC 210-001 Assignment 6
 * Quarterback.java
 * 
 * This class creates a Quarterback object that stores a players
 * completions, attempts, and yards. This class also calculates
 * a players pass percentage, yards per attempt, and yards per game.
 */
public class Quarterback extends Player {
private int completions;
private int attempts;
private double yards;

public Quarterback() {
	super();
}

public Quarterback(String fName, String lName,String team, String position, int completions, int attempts, double yards) {
	super(fName,lName, team, position);
	this.completions = completions;
	this.attempts = attempts;
	this.yards = yards;
}

public int getCompletions() {
	return completions;
}

public int getAttempts() {
	return attempts;
}

public double getYards() {
	return yards;
}
/**
 * This method calculates a Quarterback's pass percentage
 * by dividing completions by attempts.
 * @param completion
 * @param attempts
 */
public double percent(int completion, int attempts) {
	return ((double)completion/attempts);
}
/**
 * This method calculates a Quarterback's yards
 * per attempt by dividing yards by attempts.
 * @param yards
 * @param attempts
 */
public double yardsPerAttempt(double yards, int attempts) {
	return ((double)yards/attempts);
}
/**
 * This method calculates a Quarterback's yards
 * per game by dividing yards by 16 games.
 * @param yards
 */
public double yardsPerGame(double yards) {
	return yards/16;
}


}

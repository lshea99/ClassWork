/**
 * COSC 210--001 Assignment 3
 * Robot.java
 * 
 * This class takes inputs from Prog3.java and calculates total distance,
 *  the X position, and the Y position
 * 
 * @author Lane Shea
 *
 */
public class Robot {
String name;
int xPosition;
int yPosition;
int totalDistance;

public Robot() {
	super();
}

public void setName(String name) {
	this.name = name;
}

public String getName() {
	return name;
}

public int getXPosition() {
	return xPosition;
}

public int getYPosition() {
	return yPosition;
}

public int distanceTraveled() {
	return totalDistance;
}

/**
 * This method accepts a distance of the type integer for the x direction and uses it to calculate the
 * robots position on the x axis.
 * @param distance
 */
void moveX(int distance) {
	xPosition += distance;
	totalDistance += Math.abs(distance);
}
/**
 * This method accepts a distance of the type integer for the y direction and uses it to calculate the
 * robots position on the y axis.
 * @param distance
 */
void moveY(int distance) {
	yPosition += distance;
	totalDistance += Math.abs(distance);
}
}


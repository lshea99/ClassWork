/** COSC 310-002 Assignment 8
 * Astro.java
 * 
 * This class creates an Astro object with the attributes 
 * name, xCoord, yCoord, and distance. The compareTo method allows Astro
 * objects to be compared by distance. 
 * 
 * @author Lane Shea
 */

import java.util.Scanner;

public class Astro implements Comparable{
private String name;
private int xCoord;
private int yCoord;
private double distance;

public Astro(String name, int xCoord, int yCoord, double distance) {
	super();
	this.name = name;
	this.xCoord = xCoord;
	this.yCoord = yCoord;
	this.distance = distance;
}

public String getName() {
	return name;
}

public int getxCoord() {
	return xCoord;
}

public int getyCoord() {
	return yCoord;
}

public double getdistance() {
	return distance;
}

@Override
public String toString() {
	return String.format("%-16s %-8d %-8d %7.2f", name,xCoord,yCoord,distance);
}
@Override
public int compareTo(Object arg0) {
	if (((Astro)arg0).distance > distance ) {
		return -1;
	}
	else if (((Astro)arg0).distance == distance) {
		return 0;
	}
	else {
		return 1;
	}
	}


}

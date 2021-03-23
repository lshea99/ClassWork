/**
 * COSC 210-001 Assignment 6
 * Player.java
 * 
 * This class creates a player object that stores players
 * first name, last name, team, and position.
 */
public class Player implements Comparable{
protected String fName;
protected String lName;
protected String team;
protected String position;

public Player() {
	super();
}

public Player(String fName, String lName, String team, String position) {
	super();
	this.fName = fName;
	this.lName = lName;
	this.team = team;
	this.position = position;
}

public String getfName() {
	return fName;
}

public String getlName() {
	return lName;
}

public String getTeam() {
	return team;
}

public String getPosition() {
	return position;
}
public String toString() {
	return lName+", "+fName;
}
@Override
public int compareTo(Object args) {
return this.lName.compareTo(((Player)args).lName );
}
}

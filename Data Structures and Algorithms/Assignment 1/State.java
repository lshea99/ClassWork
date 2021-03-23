/**
 * COSC 310-002 Assignment 1
 * State.java
 * 
 * This class creates a State object that stores the state
 * abbreviation, name, and population. An equals method is used
 * to enable searching by abbreviation in Prog1.java.
 * 
 * @author Lane Shea
 */
public class State {
private String abbr;
private String name;
private int population;

public State(String abbr, String name, int population) {
	super();
	this.abbr = abbr;
	this.name = name;
	this.population = population;
}
public State(String abbr) {
	super();
	this.abbr = abbr;
}

public State() {
	super();
}
public String getAbbr() {
	return abbr;
}
public String getName() {
	return name;
}
public int getPopulation() {
	return population;
}
@Override
public boolean equals(Object arg) {
	return this.abbr.equals(((State)arg).abbr);
}

}

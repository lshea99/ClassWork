/**
 * COSC 210-001 Assignment 4
 * Video.java
 * 
 * This class creates the Video object and contains the 
 * video name, release year, copy number, and daily rental rate.
 * @author Lane Shea
 *
 */
public class Video {
private String videoName;
private int year;
private int copyNum;
private double dailyRate;

public Video(String videoName, int year, int copyNum, double dailyRate) {
	super();
	this.videoName = videoName;
	this.year = year;
	this.copyNum = copyNum;
	this.dailyRate = dailyRate;
}
public Video(double dailyRate) {
	super();
	this.dailyRate = dailyRate;
}

public String getVideoName() {
	return videoName;
}

public int getYear() {
	return year;
}

public int getCopyNum() {
	return copyNum;
}

public double getDailyRate() {
	return dailyRate;
}
}

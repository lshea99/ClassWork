/**
 *  COSC 310-002 Assignment 8
 * Prog8.java
 *  
 * Program that finds a user inputted number of Astro objects 
 * closest to user given x and y cooridinates.
 * 
 * @author Lane Shea
 */

import java.io.*;
import java.util.*;

public class Prog8
{
	public static void main(String[] args)
	{
		Heap<Astro> heap =  new Heap<Astro>(50);
		int x;			// x coordinate of point in space
		int y;			// y coordinate of point in space
		int k;			// number of objects desired
		
		//-----------------------------------------------------------
		// get x and y coordinates of a point in space from user
		// get number of entities k to find from user
		//-----------------------------------------------------------
		Scanner in = new Scanner(System.in);
		System.out.println("Enter x coordinate: ");
		x = in.nextInt();
		System.out.println("Enter y coordinate: ");
		y = in.nextInt();
		System.out.println("Enter number of objects desired: ");
		k = in.nextInt();
		
		
		//-----------------------------------------------------------
		// read astro.txt file, instantiate Astro objects, 
		// and enqueue each one in the heap
		//-----------------------------------------------------------
		Scanner inFile = null;
		int xValue = 0;
		int yValue = 0;
		double distance = 0;
		String name = "";
		try {
	           inFile = new Scanner( new File( "astro.txt" ) );
	        }
	        catch( FileNotFoundException e ) {
	        
	            System.out.println( "Error: File not found" );
	        }
		 //read file
		 while(inFile.hasNext()) {
			 name = inFile.next();
	         xValue = inFile.nextInt();
	         yValue = inFile.nextInt();
	         distance = Math.sqrt(((xValue-x)*(xValue-x))+((yValue-y)*(yValue-y)));
	         Astro a = new Astro(name,xValue,yValue, distance);
	         heap.enqueue(a);
		 }
		//-----------------------------------------------------------
		// print k nearest objects to (x, y)
		//-----------------------------------------------------------
	    System.out.println(k+" closest objects to ( "+x+", "+y+" )");
		System.out.printf("%-16s %-8s %-8s %-8s \n","Name", "X-Value ", "Y-Value ","Distance");
	    System.out.printf("%-16s %-8s %-8s %-8s \n","----------------", "--------", "--------","--------");
	    int i = 0;
	    while (i < k) {
	    	System.out.println(heap.dequeue());
	        i++;
		}

}
}
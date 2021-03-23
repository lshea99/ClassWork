/**
 * COSC 310-002 Assignment 1
 * Prog1.java
 * 
 * This class reads a text file containing a comma delimited list
 * containing states abbreviation, name, and population count. 
 * This class also adds the elements read in from the text file to 
 * a State object that is then added to an ArrayList. Finally,
 * the program prints a detailed and easy to read list of all the 
 * states in the text file that is searchable by abbreviation. 
 * 
 * @author Lane Shea
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class Prog1 {

	public static void main(String[] args) {
		String abbr = "";
		String name = "";
		int population = 0;
		Scanner inFile = null;
		
		Scanner in = new Scanner(System.in);
        ArrayList<State> list = new ArrayList<State>();
        //open file
        try
        {
            inFile = new Scanner( new File( "states.txt" ) );
        }
        catch( FileNotFoundException e )
        {
            System.out.println( "Error: File not found" );
        }
        System.out.printf("%-6s %-15s %11s", "Abbr", "Name", "Population");
        System.out.printf("\n%-6s %-15s %11s", "----", "----------", "----------");
       //read file and add to object and arrayList
        while( inFile.hasNext() )
        {
            String record = inFile.nextLine();
            String[] tokens = record.split( ",[ ]*" );
            
            abbr = tokens[0];
            name = tokens[1];
            population = Integer.parseInt( tokens[2] );
            
            State s;
            s = new State(abbr,name,population);
            list.add(s);
            
            System.out.printf("\n%-6s %-15s %, 11d", abbr, name, population);
            
        
        }
        //Search of arrayList by abbreviation
        System.out.print("\n\nEnter State abbreviation: ");
        String abbrev = in.next();
        State search = new State(abbrev);
        int index = list.indexOf( search );
        
        if (index >=0 ) {
        	State found = list.get(index);
        	System.out.printf("%s stands for %s and has a population of %,d",
        			abbrev, found.getName(), found.getPopulation());
        }
        else {
        	System.out.println(abbrev + " not found");
        }
        
	}

}

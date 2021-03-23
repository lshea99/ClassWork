import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Proj2 {

	public static void main(String[] args) {
		String input;
		String output;
		String print = null;
		Scanner inFile = null;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter input filename: ");
		input = in.nextLine();
		
		//open file
		 try {
	           inFile = new Scanner( new File( input ) );
	        }
	        catch( FileNotFoundException e ) {
	        
	            System.out.println( "Error: File not found" );
	        }
		 //read file
		 while(inFile.hasNext()) {
			 String record = inFile.nextLine();
			 String[] tokens = record.split(",[ ]*");
	         print = tokens[0];
		 }
		System.out.println("Enter output filename: ");
			output = in.nextLine();
		//create output file and print	
		try  (PrintWriter out = new PrintWriter(output)) {
			out.println(print);
		}
			catch( FileNotFoundException e) {
				System.out.println("Error: File already exists");
			}
		 System.out.println("Program executed Successfully");
	}
}	

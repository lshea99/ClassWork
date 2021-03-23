/**
 * COSC 310-002 Assignment 5
 * Prog5.java
 * 
 * This class instantiates the stack in a single 
 * linked list and reads txt files to determine html
 * tag validity. If no errors are found, the program will state that
 * the input file is a matched html document. If errors are found, the 
 * tag that is invalid will be printed. 
 * 
 * @author Lane Shea
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		int index = 0;
		int index2 = 0;
		String input = null;
		String tag = null;
		String tag2 = null;
		Scanner inFile = null;
		MyStack<String> stack = new MyStack<String>();
		System.out.print("Enter html file to verify: ");
		Scanner in = new Scanner(System.in);
		input = in.next();
		//open file
		try {
	           inFile = new Scanner( new File( input+".txt" ) );
	        }
	    catch( FileNotFoundException e ) {
	        
	            System.out.println( "Error: File not found" );
	        }
		//read file
        while( inFile.hasNext() ) {
           String record = inFile.nextLine();
           index = record.indexOf('<');
           if (index >= 0) {
        	   //reads beginning tags and pushes on stack
        	   if (record.charAt(index + 1) != '/') {
        		   index2 = record.indexOf('>');
        		   tag = record.substring(index + 1 ,index2  );
        		   stack.push(tag);
        	   }
        	   //reads end tags and pops off stack
        	   else {
        		   index2 = record.indexOf('>');
        		   tag = record.substring(index + 2, index2 );
        		   tag2 = stack.peek();
        		   stack.pop();
        		   if (!tag2.contentEquals(tag) ) {
        			   System.err.println("Error: <"+ tag2+"> is invalid");
        			   System.err.println("Make sure to include an Endtag");
        			   System.err.println("Exiting...");
        			   stack.pop();
        			   System.exit(0);
        		   }
        	   }
           } 
        }
        if (stack.empty()) {
        	   System.out.println("The input file is a matched HTML document");
        }
	}

}

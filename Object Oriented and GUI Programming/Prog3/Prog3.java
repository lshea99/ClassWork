/**
 * COSC 210--001 Assignment 3
 * Prog3.java
 * 
 * This class reads the name of a robot, along with inputs that correlate with movement
 * along the x and y axis. When the user is finished inputting movement values, 
 * the robot name, position, and total distance traveled are displayed.
 * 
 * @author Lane Shea
 */
import java.util.Scanner;
public class Prog3 {
	/**
	 * This is the main method that prompts users for robot name, movement axis, and distance.
	 * 
	 * @param args
	 * @return Return value is void
	 */
	public static void main(String [] args) {
		String name;
		char direction;
		int distance;
		
		//Constructs a new Robot object
		Robot r = new Robot();
		
		//Constructs new scanner object
		Scanner in = new Scanner(System.in);
		
		//Sets user input as robot name
		System.out.print("Robot name: ");
		name = in.nextLine();
		r.setName(name);
		
		//Prompts the user to input direction of movement
		System.out.print("Direction of move (x/y/q):  ");
		direction = in.next().charAt(0);
		
		//While loop that reads inputed distance and direction of movement as long as the quit command, q, is not entered
		
		do {
			if (direction == 'x' ) {
				System.out.print("Distance: ");
				distance = in.nextInt();
				r.moveX(distance);
		}
			if (direction == 'y' ) {
				System.out.print("Distance: ");
				distance = in.nextInt();
				r.moveY(distance);
			}
			System.out.print("Direction of move (x/y/q):  ");
			direction = in.next().charAt(0);
		} 
		while (direction != 'q');
		
		//Displays robot name, position, and total distance to the user
		System.out.println(r.getName()+" is now at position ( "
				+ r.getXPosition() + " , "+ r.getYPosition() + " ) and traveled a total of " + r.distanceTraveled() + " units" );
					in.close();
		}
	
	}


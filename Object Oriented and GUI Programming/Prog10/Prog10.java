/**
 * COSC 210-001 Assignment 10
 * Prog10.java
 * 
 * This class creates the window for our PizzaGUI
 * and sets the visibility,size, and default close operation 
 * @author Lane Shea
 */
import javax.swing.JFrame;

public class Prog10 {

	public static void main(String[] args) {
		PizzaGUI window = new PizzaGUI();
		window.setVisible(true);
		window.setSize(500,400);
        window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

}

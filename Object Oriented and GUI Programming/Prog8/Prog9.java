/**
 * COSC 210-001 Assignment 8/9?
 * Prog9.java
 * 
 * This class creates the window for our length conversion 
 * and sets the visibility,size, and default close operation
 * @author Lane Shea
 */
import javax.swing.JFrame;

public class Prog9 {

	public static void main(String[] args) {
		ConvertGUI window = new ConvertGUI();
		window.setVisible(true);
		window.setSize(250, 180);
        window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

}

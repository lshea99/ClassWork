/**
 * COSC 210-001 Assignment 8/9?
 * ConvetGUI.java
 * 
 * This class creates the individual labels, textfields, and icons
 * of our GUI and adds them to the JFrame.
 * Additionally, the length conversion is handled through the two Button Handler classes.
 * @author Lane Shea
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ConvertGUI extends JFrame {
	private JLabel label0;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JTextField first;
	private JTextField second;
	private JButton InToCmButton;
	private JButton CmToInButton;

	public ConvertGUI() {
		super ("Prog8");
		setLayout(new FlowLayout());
		//add ruler
		Icon ruler = new ImageIcon( getClass().getResource("ruler.png"));
		label0 = new JLabel("",ruler,SwingConstants.LEFT);
		add(label0);
		//Metric Converter Label
		label1 = new JLabel("Metric Converter ");
		add(label1);
		//Inches Label
		label2 = new JLabel("Inches ");
		add(label2);
		//Inches Text Field
		first = new JTextField(10);
		add(first);
		//Centimeters label
		label3 = new JLabel("Centimeters ");
		add(label3);
		//Centimeters Text Field
		second = new JTextField(10);
		add(second);
		//Inches to Centimeter Button
		InToCmButton = new JButton("IN to CM");
		add(InToCmButton);
		InToCmButton.addActionListener(new ButtonHandler());
		//Centimeter to Inches Button
		CmToInButton = new JButton("CM to IN");
		add(CmToInButton);
		CmToInButton.addActionListener(new ButtonHandler2());
	}
	/**
	 * This method handles the Inch to Centimeter button press 
	 * and calculates the centimeter result from the given inches by
	 * multiplying the given number by 2.54. 
	 *
	 */
	private class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			double num1 = Double.parseDouble(first.getText());
			double result = num1*2.54;
			second.setText(String.format("%.1f",result));
				}
			
		}
	/**
	 * This method handles the Centimeter to Inch button press 
	 * and calculates the inch result from the given centimeters by
	 * dividing the given number by 2.54. 
	 *
	 */
	private class ButtonHandler2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			double num2 = Double.parseDouble(second.getText());
			double result = num2/2.54;
			first.setText(String.format("%.1f",result));
			}
	}
}

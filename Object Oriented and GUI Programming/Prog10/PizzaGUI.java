/**
 * COSC 210-001 Assignment 10
 * PizzaGUI.java
 * 
 * This class creates the PizzaGUI Frame and adds labels, radio buttons, 
 * check boxes, combo boxes, buttons, and textfields to the frame.
 * The ButtonHandler, RadioButtonHandler, CheckBoxHandler, and ComboBoxHandler 
 * classes deal with the computation of the total price when the submit button is pressed.
 * @author Lane Shea
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PizzaGUI extends JFrame{
	private JPanel pizzazPanel;
	private JPanel sizePanel;
	private JPanel toppingsPanel;
	private JPanel crustPanel;
	private JPanel totalPanel;
	private JLabel pizzazLabel;
	private JLabel sizeLabel;
	private JLabel toppingsLabel;
	private JLabel crustLabel;
	private JLabel totalLabel;
	private JLabel pizzaLabel;
	private JRadioButton mediumButton;
	private JRadioButton largeButton;
	private JRadioButton xLargeButton;
	private JCheckBox pepperoniBox;
	private JCheckBox sausageBox;
	private JCheckBox mushroomsBox;
	private JCheckBox onionsBox;
	private JButton submitButton;
	private JTextField totalField;
	private BorderLayout layout;
	private GridLayout sizeLayout;
	private GridLayout toppingsLayout;
	private GridLayout crustLayout;
	private GridLayout totalLayout;
	public double total=0;
	public double toppingTotal=0;
	public double sizeTotal=0;
	public double crustTotal=0;
	public PizzaGUI() {
		super("Prog10");
		layout=new BorderLayout(5,5);
		setLayout(layout);
		sizeLayout = new GridLayout(4,1);
		toppingsLayout = new GridLayout(5,1);
		crustLayout = new GridLayout(3,1,5,20);
		totalLayout = new GridLayout (1,3,30,10);
		
		pizzazPanel = new JPanel();
		add(pizzazPanel,BorderLayout.NORTH);
	
		toppingsPanel = new JPanel();
		toppingsPanel.setLayout(toppingsLayout);
		add(toppingsPanel,BorderLayout.CENTER);
		
		crustPanel = new JPanel();
		crustPanel.setLayout(crustLayout);
		add(crustPanel,BorderLayout.EAST);
		
		totalPanel = new JPanel();
		totalPanel.setLayout(totalLayout);
		add(totalPanel,BorderLayout.SOUTH);
		
		sizePanel = new JPanel();
		sizePanel.setLayout(sizeLayout);
		add(sizePanel,BorderLayout.WEST);
		
		//Add Pizazz Pizza Label
		pizzazLabel = new JLabel("Pizazz Pizza");
		pizzazPanel.add(pizzazLabel);
		
		//Add Size Label
		sizeLabel = new JLabel("Size");
		sizePanel.add(sizeLabel);
		ButtonGroup size = new ButtonGroup();
		
		//Add size radio buttons and ActionListeners
		mediumButton = new JRadioButton("Medium");
		size.add(mediumButton);
		largeButton = new JRadioButton("Large");
		size.add(largeButton);
		xLargeButton = new JRadioButton("X-Large");
		size.add(xLargeButton);
		sizePanel.add(mediumButton);
		sizePanel.add(largeButton);
		sizePanel.add(xLargeButton);
		mediumButton.addActionListener(new RadioButtonHandler());
		largeButton.addActionListener(new RadioButtonHandler());
		xLargeButton.addActionListener(new RadioButtonHandler());
		
		//Add toppings label
		toppingsLabel = new JLabel("Toppings");
		toppingsPanel.add(toppingsLabel);
		
		//Add toppings checkboxes and ActionListeners
		pepperoniBox = new JCheckBox("Pepperoni");
		toppingsPanel.add(pepperoniBox);
		sausageBox = new JCheckBox("Sausage");
		toppingsPanel.add(sausageBox);
		mushroomsBox = new JCheckBox("Mushrooms");
		toppingsPanel.add(mushroomsBox);
		onionsBox = new JCheckBox("Onions");
		toppingsPanel.add(onionsBox);
		pepperoniBox.addActionListener(new CheckBoxHandler());
		sausageBox.addActionListener(new CheckBoxHandler());
		mushroomsBox.addActionListener(new CheckBoxHandler());
		onionsBox.addActionListener(new CheckBoxHandler());
		
		//Add crust label
		crustLabel = new JLabel("Crust");
		crustPanel.add(crustLabel);
		
		//Add pizza icon
		Icon pizza = new ImageIcon( getClass().getResource("pizza.jpg"));
		pizzaLabel = new JLabel("",pizza,SwingConstants.LEFT);
		crustPanel.add(pizzaLabel);
		
		//Add ComboBox with crust options and ActionListener
		String [] crust = {"Thin","Original","Deep Dish"};
		JComboBox crustList = new JComboBox(crust);
		crustPanel.add(crustList);
		crustList.addActionListener(new ComboBoxHandler());
		
		//Add submit button and ActionListener
		submitButton = new JButton("Submit");
		totalPanel.add(submitButton);
		submitButton.addActionListener(new ButtonHandler());
		
		//Add total label and text field
		totalLabel = new JLabel("Total");
		totalPanel.add(totalLabel);
		totalField = new JTextField(10);
		totalField.setEditable(false);
		totalPanel.add(totalField);
		
		
	}
	/**
	 * This method handles the press of the submit button and
	 * places the calculated total in the total text field
	 */
	private class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			total = sizeTotal + toppingTotal+crustTotal;
			totalField.setText(String.format("%.2f",total));
			total=0;
		}
		
	}
	/**
	 * This method handles the radio buttons for the user to choose a size.
	 * Based on the selected size, a given price is added to the total.
	 */
	private class RadioButtonHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (mediumButton.isSelected()) {
				sizeTotal = 7.95;
			}
			else if (largeButton.isSelected()) {
				sizeTotal = 9.95;
			}
			else if (xLargeButton.isSelected()) {
				sizeTotal = 12.95;
			}
			
		}
	}
	/**
	 * This method handles the check boxes for the user to select toppings.
	 * Based on the selected toppings, $1 per topping is added to the total.
	 */
	private class CheckBoxHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (pepperoniBox.isSelected()) {
				toppingTotal = toppingTotal+1;
			}
			else if (sausageBox.isSelected()) {
				toppingTotal = toppingTotal+1;
			}
			else if (mushroomsBox.isSelected()) {
				toppingTotal = toppingTotal+1;
			}
			else if (onionsBox.isSelected()) {
				toppingTotal = toppingTotal+1;
			}
			else toppingTotal = 0;
		}
	}
	/**
	 * This method handles the combo box for the user to select crust type.
	 * If the selected crust is deep dish, $2 will be added to the total.
	 */
	private class ComboBoxHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			JComboBox crustList = (JComboBox)arg0.getSource();
			Object selected = crustList.getSelectedItem();
			if ("Deep Dish".equals(selected) ) {
				crustTotal = 2;
			}
			else {
				crustTotal=0;
			}
		}
	}
	
	
}

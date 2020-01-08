package java_swing_study.chap09.layout.example;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;

public class Example_07_Center extends JPanel {
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JButton button_15;

	/**
	 * Create the panel.
	 */
	public Example_07_Center() {

		initialize();
	}
	private void initialize() {
		setLayout(new GridLayout(0, 4, 0, 0));
		
		button = new JButton("0");
		add(button);
		
		button_1 = new JButton("1");
		add(button_1);
		
		button_2 = new JButton("2");
		add(button_2);
		
		button_3 = new JButton("3");
		add(button_3);
		
		button_4 = new JButton("4");
		add(button_4);
		
		button_5 = new JButton("5");
		add(button_5);
		
		button_6 = new JButton("6");
		add(button_6);
		
		button_7 = new JButton("7");
		add(button_7);
		
		button_8 = new JButton("8");
		add(button_8);
		
		button_9 = new JButton("9");
		add(button_9);
		
		button_10 = new JButton("CE");
		add(button_10);
		
		button_11 = new JButton("계산");
		add(button_11);
		
		button_12 = new JButton("+");
		button_12.setBackground(new Color(100, 149, 237));
		add(button_12);
		
		button_13 = new JButton("-");
		button_13.setBackground(new Color(100, 149, 237));
		add(button_13);
		
		button_14 = new JButton("x");
		button_14.setBackground(new Color(100, 149, 237));
		add(button_14);
		
		button_15 = new JButton("/");
		button_15.setBackground(new Color(100, 149, 237));
		add(button_15);
	}

}

package java_swing_study.chap09.layout.example;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;

public class Example_08_Center extends JPanel {
	private JLabel lblstar1;
	private JLabel lblstar2;
	private JLabel lblstar3;
	private JLabel lblstar4;
	private JLabel lblstar5;
	private JLabel lblstar6;
	private JLabel lblstar7;
	private JLabel lblstar8;
	private JLabel lblstar9;
	private JLabel lblstar10;

	/**
	 * Create the panel.
	 */
	public Example_08_Center() {

		initialize();
	}
	private void initialize() {
		setLayout(null);
		
		lblstar1 = new JLabel("*");
		lblstar1.setForeground(new Color(255, 140, 0));
		lblstar1.setBounds(53, 47, 57, 15);
		add(lblstar1);
		
		lblstar2 = new JLabel("*");
		lblstar2.setForeground(new Color(255, 140, 0));
		lblstar2.setBounds(310, 73, 57, 15);
		add(lblstar2);
		
		lblstar3 = new JLabel("*");
		lblstar3.setForeground(new Color(255, 140, 0));
		lblstar3.setBounds(288, 32, 57, 15);
		add(lblstar3);
		
		lblstar4 = new JLabel("*");
		lblstar4.setForeground(new Color(255, 140, 0));
		lblstar4.setBounds(53, 90, 57, 15);
		add(lblstar4);
		
		lblstar5 = new JLabel("*");
		lblstar5.setForeground(new Color(255, 140, 0));
		lblstar5.setBounds(244, 57, 57, 15);
		add(lblstar5);
		
		lblstar6 = new JLabel("*");
		lblstar6.setForeground(new Color(255, 140, 0));
		lblstar6.setBounds(196, 101, 57, 15);
		add(lblstar6);
		
		lblstar7 = new JLabel("*");
		lblstar7.setForeground(new Color(255, 140, 0));
		lblstar7.setBounds(381, 47, 57, 15);
		add(lblstar7);
		
		lblstar8 = new JLabel("*");
		lblstar8.setForeground(new Color(255, 140, 0));
		lblstar8.setBounds(149, 73, 57, 15);
		add(lblstar8);
		
		lblstar9 = new JLabel("*");
		lblstar9.setForeground(new Color(255, 140, 0));
		lblstar9.setBounds(184, 47, 57, 15);
		add(lblstar9);
		
		lblstar10 = new JLabel("*");
		lblstar10.setForeground(new Color(255, 140, 0));
		lblstar10.setBounds(120, 32, 57, 15);
		add(lblstar10);
	}

}

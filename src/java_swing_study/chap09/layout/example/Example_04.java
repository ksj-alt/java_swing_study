package java_swing_study.chap09.layout.example;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Example_04 extends JFrame {

	private JPanel contentPane;
	private JLabel lbl0;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lbl5;
	private JLabel lbl6;
	private JLabel lbl7;
	private JLabel lbl8;
	private JLabel lbl9;

	public Example_04() {
		initialize();
	}
	private void initialize() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 601, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		lbl0 = new JLabel("0");
		lbl0.setHorizontalAlignment(SwingConstants.CENTER);
		lbl0.setBackground(Color.RED);
		lbl0.setOpaque(true);
		contentPane.add(lbl0);
		
		lbl1 = new JLabel("1");
		lbl1.setBackground(Color.ORANGE);
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setOpaque(true);
		contentPane.add(lbl1);
		
		lbl2 = new JLabel("2");
		lbl2.setBackground(Color.YELLOW);
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setOpaque(true);
		contentPane.add(lbl2);
		
		lbl3 = new JLabel("3");
		lbl3.setBackground(new Color(50, 205, 50));
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setOpaque(true);
		contentPane.add(lbl3);
		
		lbl4 = new JLabel("4");
		lbl4.setBackground(new Color(0, 191, 255));
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setOpaque(true);
		contentPane.add(lbl4);
		
		lbl5 = new JLabel("5");
		lbl5.setBackground(new Color(0, 0, 139));
		lbl5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5.setOpaque(true);
		contentPane.add(lbl5);
		
		lbl6 = new JLabel("6");
		lbl6.setBackground(new Color(75, 0, 130));
		lbl6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6.setOpaque(true);
		contentPane.add(lbl6);
		
		lbl7 = new JLabel("7");
		lbl7.setBackground(new Color(105, 105, 105));
		lbl7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl7.setOpaque(true);
		contentPane.add(lbl7);
		
		lbl8 = new JLabel("8");
		lbl8.setBackground(new Color(255, 160, 122));
		lbl8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl8.setOpaque(true);
		contentPane.add(lbl8);
		
		lbl9 = new JLabel("9");
		lbl9.setBackground(new Color(192, 192, 192));
		lbl9.setHorizontalAlignment(SwingConstants.CENTER);
		lbl9.setOpaque(true);
		contentPane.add(lbl9);
	}

}

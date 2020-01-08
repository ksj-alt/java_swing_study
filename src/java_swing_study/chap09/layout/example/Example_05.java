package java_swing_study.chap09.layout.example;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;

public class Example_05 extends JFrame {

	private JPanel contentPane;
	private JPanel p1;
	private JPanel p2;
	private JPanel p3;
	private JPanel p4;
	private JLabel lbl0;
	private JLabel lbl4;
	private JLabel lbl8;
	private JLabel lbl12;
	private JLabel lbl1;
	private JLabel lbl5;
	private JLabel lbl9;
	private JLabel lbl13;
	private JLabel lbl2;
	private JLabel lbl6;
	private JLabel lbl10;
	private JLabel lbl14;
	private JLabel lbl3;
	private JLabel lbl7;
	private JLabel lbl11;
	private JLabel lbl15;

	public Example_05() {
		initialize();
	}
	private void initialize() {
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 515, 251);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		p1 = new JPanel();
		contentPane.add(p1);
		p1.setLayout(new GridLayout(0, 1, 0, 0));
		
		lbl0 = new JLabel("0");
		lbl0.setOpaque(true);
		lbl0.setBackground(new Color(255, 0, 0));
		p1.add(lbl0);
		
		lbl4 = new JLabel("4");
		lbl4.setBackground(new Color(233, 150, 122));
		lbl4.setOpaque(true);
		p1.add(lbl4);
		
		lbl8 = new JLabel("8");
		lbl8.setBackground(new Color(153, 50, 204));
		lbl8.setOpaque(true);
		p1.add(lbl8);
		
		lbl12 = new JLabel("12");
		lbl12.setBackground(new Color(119, 136, 153));
		lbl12.setOpaque(true);
		p1.add(lbl12);
		
		p2 = new JPanel();
		contentPane.add(p2);
		p2.setLayout(new GridLayout(0, 1, 0, 0));
		
		lbl1 = new JLabel("1");
		lbl1.setBackground(Color.ORANGE);
		lbl1.setOpaque(true);
		p2.add(lbl1);
		
		lbl5 = new JLabel("5");
		lbl5.setBackground(new Color(250, 235, 215));
		lbl5.setOpaque(true);
		p2.add(lbl5);
		
		lbl9 = new JLabel("9");
		lbl9.setBackground(new Color(64, 224, 208));
		lbl9.setOpaque(true);
		p2.add(lbl9);
		
		lbl13 = new JLabel("13");
		lbl13.setBackground(new Color(238, 232, 170));
		lbl13.setOpaque(true);
		p2.add(lbl13);
		
		p3 = new JPanel();
		contentPane.add(p3);
		p3.setLayout(new GridLayout(0, 1, 0, 0));
		
		lbl2 = new JLabel("2");
		lbl2.setBackground(new Color(135, 206, 250));
		lbl2.setOpaque(true);
		p3.add(lbl2);
		
		lbl6 = new JLabel("6");
		lbl6.setBackground(new Color(0, 128, 128));
		lbl6.setOpaque(true);
		p3.add(lbl6);
		
		lbl10 = new JLabel("10");
		lbl10.setBackground(new Color(102, 205, 170));
		lbl10.setOpaque(true);
		p3.add(lbl10);
		
		lbl14 = new JLabel("14");
		lbl14.setBackground(new Color(255, 228, 225));
		lbl14.setOpaque(true);
		p3.add(lbl14);
		
		p4 = new JPanel();
		contentPane.add(p4);
		p4.setLayout(new GridLayout(0, 1, 0, 0));
		
		lbl3 = new JLabel("3");
		lbl3.setBackground(new Color(173, 255, 47));
		lbl3.setOpaque(true);
		p4.add(lbl3);
		
		lbl7 = new JLabel("7");
		lbl7.setBackground(new Color(0, 206, 209));
		lbl7.setOpaque(true);
		p4.add(lbl7);
		
		lbl11 = new JLabel("11");
		lbl11.setBackground(new Color(154, 205, 50));
		lbl11.setOpaque(true);
		p4.add(lbl11);
		
		lbl15 = new JLabel("15");
		lbl15.setBackground(new Color(139, 0, 0));
		lbl15.setOpaque(true);
		p4.add(lbl15);
	}

}

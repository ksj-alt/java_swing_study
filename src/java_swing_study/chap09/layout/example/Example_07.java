package java_swing_study.chap09.layout.example;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Example_07 extends JFrame {

	private JPanel contentPane;
	private Example_07_North panel;
	private Example_07_Center panel_1;
	private Example_07_South panel_2;

	public Example_07() {
		initialize();
	}
	private void initialize() {
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 334, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new Example_07_North();
		contentPane.add(panel, BorderLayout.NORTH);
		
		panel_1 = new Example_07_Center();
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		panel_2 = new Example_07_South();
		contentPane.add(panel_2, BorderLayout.SOUTH);
	}

}

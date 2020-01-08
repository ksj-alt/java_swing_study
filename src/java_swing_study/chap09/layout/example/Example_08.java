package java_swing_study.chap09.layout.example;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Example_08 extends JFrame {

	private JPanel contentPane;
	private Example_08_North panel;
	private Example_08_Center panel_1;
	private Example_08_South panel_2;

	public Example_08() {
		initialize();
	}
	private void initialize() {
		setTitle("여러 개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new Example_08_North();
		contentPane.add(panel, BorderLayout.NORTH);
		
		panel_1 = new Example_08_Center();
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		panel_2 = new Example_08_South();
		contentPane.add(panel_2, BorderLayout.SOUTH);
	}

}

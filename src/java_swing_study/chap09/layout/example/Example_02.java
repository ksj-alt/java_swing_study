package java_swing_study.chap09.layout.example;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Example_02 extends JFrame {

	private JPanel contentPane;
	private JButton btnNorth;
	private JButton btnWest;
	private JButton btnCenter;
	private JButton btnEast;
	private JButton btnSouth;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Example_02 frame = new Example_02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Example_02() {
		initialize();
	}
	private void initialize() {
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(5, 7));
		setContentPane(contentPane);
		
		btnNorth = new JButton("North");
		contentPane.add(btnNorth, BorderLayout.NORTH);
		
		btnWest = new JButton("West");
		contentPane.add(btnWest, BorderLayout.WEST);
		
		btnCenter = new JButton("Center");
		contentPane.add(btnCenter, BorderLayout.CENTER);
		
		btnEast = new JButton("East");
		contentPane.add(btnEast, BorderLayout.EAST);
		
		btnSouth = new JButton("South");
		contentPane.add(btnSouth, BorderLayout.SOUTH);
	}

}

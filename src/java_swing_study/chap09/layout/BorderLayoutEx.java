package java_swing_study.chap09.layout;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class BorderLayoutEx extends JFrame {

	private JPanel contentPane;
	private JButton btnadd;
	private JButton btndiv;
	private JButton btnCalculate;
	private JButton btnmul;
	private JButton btnsub;

	public BorderLayoutEx() {
		initialize();
	}
	private void initialize() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(30, 20));
		setContentPane(contentPane);
		
		btnadd = new JButton("add");
		contentPane.add(btnadd, BorderLayout.NORTH);
		
		btndiv = new JButton("div");
		contentPane.add(btndiv, BorderLayout.WEST);
		
		btnCalculate = new JButton("Calculate");
		contentPane.add(btnCalculate, BorderLayout.CENTER);
		
		btnmul = new JButton("mul");
		contentPane.add(btnmul, BorderLayout.EAST);
		
		btnsub = new JButton("sub");
		contentPane.add(btnsub, BorderLayout.SOUTH);
	}

}

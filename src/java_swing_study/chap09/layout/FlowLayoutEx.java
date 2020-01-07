package java_swing_study.chap09.layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class FlowLayoutEx extends JFrame {

	private JPanel contentPane;
	private JButton btnadd;
	private JButton btnsub;
	private JButton btnmul;
	private JButton btndiv;
	private JButton btnCalculate;

	public FlowLayoutEx() {
		initialize();
	}
	private void initialize() {
		setTitle("Flowlayout Sample");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		
		btnadd = new JButton("add");
		contentPane.add(btnadd);
		
		btnsub = new JButton("sub");
		contentPane.add(btnsub);
		
		btnmul = new JButton("mul");
		contentPane.add(btnmul);
		
		btndiv = new JButton("div");
		contentPane.add(btndiv);
		
		btnCalculate = new JButton("Calculate");
		contentPane.add(btnCalculate);
	}

}

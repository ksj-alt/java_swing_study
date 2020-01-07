package java_swing_study.chap09;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ContentPaneEx01 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnOK;
	private JButton btnCancel;
	private JButton btnIgnore;



	/**
	 * Create the frame.
	 */
	public ContentPaneEx01() {
		initialize();
	}
	private void initialize() {
		setTitle("Contentpane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);	//100, 100 위치에 넓이 450과 높이 300 박스를 만들어라
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 5));
		
		btnOK = new JButton("OK");
		btnOK.addActionListener(this);
		contentPane.add(btnOK);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(this);

		contentPane.add(btnCancel);
		
		btnIgnore = new JButton("Ignore");
		btnIgnore.addActionListener(this);
		contentPane.add(btnIgnore);
	}
	


	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnIgnore) {
			btnIgnoreActionPerformed(e);
		}
		if (e.getSource() == btnCancel) {
			btnCancelActionPerformed(e);
		}
		if (e.getSource() == btnOK) {
			btnOKActionPerformed(e); 
		}
	}
	
	protected void btnOKActionPerformed(ActionEvent e) {
	JOptionPane.showMessageDialog(null, e.getActionCommand()); 
	}
	
	protected void btnCancelActionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, e.getActionCommand());
	}
	protected void btnIgnoreActionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, e.getActionCommand());
	}
}

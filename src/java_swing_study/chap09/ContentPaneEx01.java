package java_swing_study.chap09;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ContentPaneEx01 extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public ContentPaneEx01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);	//100, 100 위치에 넓이 450과 높이 300 박스를 만들어라
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));	//margin 안의 박스
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}

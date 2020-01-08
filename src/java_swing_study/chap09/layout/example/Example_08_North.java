package java_swing_study.chap09.layout.example;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;

public class Example_08_North extends JPanel {
	private JButton btnOpen;
	private JButton btnClose;
	private JButton btnExit;

	/**
	 * Create the panel.
	 */
	public Example_08_North() {

		initialize();
	}
	private void initialize() {
		setBackground(Color.LIGHT_GRAY);
		
		btnOpen = new JButton("열기");
		add(btnOpen);
		
		btnClose = new JButton("닫기");
		add(btnClose);
		
		btnExit = new JButton("나가기");
		add(btnExit);
	}

}

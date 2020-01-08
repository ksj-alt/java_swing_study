package java_swing_study.chap09.layout.example;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class Example_07_North extends JPanel {
	private JLabel lblInputText;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Example_07_North() {

		initialize();
	}
	private void initialize() {
		setBackground(new Color(192, 192, 192));
		
		lblInputText = new JLabel("수식입력");
		add(lblInputText);
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(18);
	}

}

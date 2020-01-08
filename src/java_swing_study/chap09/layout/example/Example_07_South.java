package java_swing_study.chap09.layout.example;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Example_07_South extends JPanel {
	private JLabel lblResult;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Example_07_South() {

		initialize();
	}
	private void initialize() {
		setBackground(new Color(255, 204, 51));
		
		lblResult = new JLabel("계산 결과");
		add(lblResult);
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(18);
	}

}

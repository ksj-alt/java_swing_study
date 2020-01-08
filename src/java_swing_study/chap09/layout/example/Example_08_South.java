package java_swing_study.chap09.layout.example;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Color;

public class Example_08_South extends JPanel {
	private JButton btnInput;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Example_08_South() {

		initialize();
	}
	private void initialize() {
		setBackground(new Color(135, 206, 250));
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnInput = new JButton("Word Input");
		add(btnInput);
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(18);
	}

}

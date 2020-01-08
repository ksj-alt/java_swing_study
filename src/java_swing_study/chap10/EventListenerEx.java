package java_swing_study.chap10;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class EventListenerEx extends JFrame {

	private JPanel contentPane;
	private JButton btn01;

	public EventListenerEx() {
		initialize();
	}
	private void initialize() {
		setTitle("이벤트 리스너 작성 방법");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 341, 122);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		btn01 = new JButton("독립클래스");
		btn01.addActionListener(new MyActionListener());
		contentPane.add(btn01);
		
		JButton btn02 = new JButton("독립클래스");
		btn02.addActionListener(new MyActionListener());
		contentPane.add(btn02);
	}

}

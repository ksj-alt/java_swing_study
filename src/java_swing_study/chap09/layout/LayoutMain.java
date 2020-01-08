package java_swing_study.chap09.layout;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import java_swing_study.chap09.layout.example.Example_02;
import java_swing_study.chap09.layout.example.Example_04;
import java_swing_study.chap09.layout.example.Example_05;
import java_swing_study.chap09.layout.example.Example_07;
import java_swing_study.chap09.layout.example.Example_08;

@SuppressWarnings("serial")
public class LayoutMain extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel pLeft;
	private JButton btnFlow;
	private JButton btnBorder;
	private JButton btnGrid;
	private JButton btnAbsolute;
	private JButton btnOpen;
	private JPanel pRight;
	private JButton btn02;
	private JButton btn04;
	private JButton btn05;
	private JButton btn07;
	private JButton btn08;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LayoutMain frame = new LayoutMain();
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
	public LayoutMain() {
		initialize();
	}
	private void initialize() {
		setTitle("배치레이아웃 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setSize(450, 116);
//		setLocation(100, 100);
		setBounds(100, 100, 521, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uC81C 9\uC7A5 GUI \uAE30\uCD08", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 10, 10));
		
		pLeft = new JPanel();
		pLeft.setBorder(new TitledBorder(null, "\uB808\uC774\uC544\uC6C3 \uC608\uC81C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pLeft);
		pLeft.setLayout(new GridLayout(0, 2, 10, 10));
		
		btnFlow = new JButton("FlowLayout");
		pLeft.add(btnFlow);
		
		btnBorder = new JButton("BorderLayout");
		pLeft.add(btnBorder);
		
		btnGrid = new JButton("GridLayout");
		pLeft.add(btnGrid);
		
		btnAbsolute = new JButton("AbsoluteLayout");
		pLeft.add(btnAbsolute);
		
		btnOpen = new JButton("OpenChallenge");
		pLeft.add(btnOpen);
		
		pRight = new JPanel();
		pRight.setBorder(new TitledBorder(null, "\uC2E4\uC2B5\uBB38\uC81C \uD480\uC774", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pRight);
		pRight.setLayout(new GridLayout(0, 2, 10, 10));
		
		btn02 = new JButton("02");
		btn02.addActionListener(this);
		pRight.add(btn02);
		
		btn04 = new JButton("04");
		btn04.addActionListener(this);
		pRight.add(btn04);
		
		btn05 = new JButton("05");
		btn05.addActionListener(this);
		pRight.add(btn05);
		
		btn07 = new JButton("07");
		btn07.addActionListener(this);
		pRight.add(btn07);
		
		btn08 = new JButton("08");
		btn08.addActionListener(this);
		btn08.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getButton() + ":" + e.getClickCount());
			}
			
		});
		pRight.add(btn08);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn08) {
			btn08ActionPerformed(e);
		}
		System.out.println(e.getActionCommand());
//		JOptionPane.showMessageDialog(null, e.getSource());
		
		if (e.getSource() == btn07) {
			btn07ActionPerformed(e);
		}
		if (e.getSource() == btn05) {
			btn05ActionPerformed(e);
		}
		if (e.getSource() == btn04) {
			btn04ActionPerformed(e);
		}
		if (e.getSource() == btn02) {
			btn02ActionPerformed(e);
		}
	}
	protected void btn02ActionPerformed(ActionEvent e) {
		Example_02 frame = new Example_02();
		frame.setVisible(true);
	}
	protected void btn04ActionPerformed(ActionEvent e) {
		Example_04 frame = new Example_04();
		frame.setVisible(true);
	}
	protected void btn05ActionPerformed(ActionEvent e) {
		Example_05 frame = new Example_05();
		frame.setVisible(true);
	}
	protected void btn07ActionPerformed(ActionEvent e) {
		Example_07 frame = new Example_07();
		frame.setVisible(true);
	}
	protected void btn08ActionPerformed(ActionEvent e) {
		Example_08 frame = new Example_08();
		frame.setVisible(true);
	}
}

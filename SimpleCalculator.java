import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.awt.Color;

public class SimpleCalculator {

	private JFrame frame;
	private JTextField txtDisplay;

	/**
	 * Launch the application.
	 */
	private void evaluateDisplay(){
		try {
			String infixExpression = txtDisplay.getText();
			if (!infixExpression.equals("")) {
				InfixEvaluation i = new InfixEvaluation();
				txtDisplay.setText("" + i.evaluate(infixExpression));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Math Error");
		}
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculator window = new SimpleCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SimpleCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 468, 321);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBackground(new Color(255, 255, 255));
		txtDisplay.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyCode()==KeyEvent.VK_ENTER){
				evaluateDisplay();
				}
			}
		});
		txtDisplay.setBounds(42, 26, 366, 60);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.setForeground(new Color(0, 0, 0));
		btn1.setBackground(new Color(128, 128, 128));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num = txtDisplay.getText();
				num = num + "1";
				txtDisplay.setText(num);
			}
		});
		btn1.setBounds(42, 131, 89, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setForeground(new Color(0, 0, 0));
		btn2.setBackground(new Color(128, 128, 128));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = txtDisplay.getText();
				num = num + "2";
				txtDisplay.setText(num);
			}
		});
		btn2.setBounds(134, 131, 89, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setForeground(new Color(0, 0, 0));
		btn3.setBackground(new Color(128, 128, 128));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = txtDisplay.getText();
				num = num + "3";
				txtDisplay.setText(num);
			}
		});
		btn3.setBounds(227, 131, 89, 23);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setForeground(new Color(0, 0, 0));
		btn4.setBackground(new Color(128, 128, 128));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = txtDisplay.getText();
				num = num + "4";
				txtDisplay.setText(num);
			}
		});
		btn4.setBounds(42, 156, 89, 23);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setForeground(new Color(0, 0, 0));
		btn5.setBackground(new Color(128, 128, 128));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = txtDisplay.getText();
				num = num + "5";
				txtDisplay.setText(num);
			}
		});
		btn5.setBounds(134, 156, 89, 23);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setForeground(new Color(0, 0, 0));
		btn6.setBackground(new Color(128, 128, 128));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = txtDisplay.getText();
				num = num + "6";
				txtDisplay.setText(num);
			}
		});
		btn6.setBounds(227, 156, 89, 23);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setForeground(new Color(0, 0, 0));
		btn7.setBackground(new Color(128, 128, 128));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = txtDisplay.getText();
				num = num + "7";
				txtDisplay.setText(num);
			}
		});
		btn7.setBounds(42, 181, 89, 23);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setForeground(new Color(0, 0, 0));
		btn8.setBackground(new Color(128, 128, 128));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = txtDisplay.getText();
				num = num + "8";
				txtDisplay.setText(num);
			}
		});
		btn8.setBounds(134, 181, 89, 23);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setForeground(new Color(0, 0, 0));
		btn9.setBackground(new Color(128, 128, 128));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = txtDisplay.getText();
				num = num + "9";
				txtDisplay.setText(num);
			}
		});
		btn9.setBounds(228, 181, 89, 23);
		frame.getContentPane().add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.setForeground(new Color(0, 0, 0));
		btn0.setBackground(new Color(128, 128, 128));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = txtDisplay.getText();
				num = num + "0";
				txtDisplay.setText(num);
			}
		});
		btn0.setBounds(134, 207, 89, 23);
		frame.getContentPane().add(btn0);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setForeground(new Color(0, 0, 0));
		btnAdd.setBackground(new Color(128, 128, 128));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String operation = txtDisplay.getText();
				operation = operation + "+";
				txtDisplay.setText(operation);
			}
		});
		btnAdd.setBounds(318, 131, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.setForeground(new Color(0, 0, 0));
		btnSub.setBackground(new Color(128, 128, 128));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String operation = txtDisplay.getText();
				operation = operation + "-";
				txtDisplay.setText(operation);
			}
		});
		btnSub.setBounds(319, 156, 89, 23);
		frame.getContentPane().add(btnSub);
		
		JButton btnMult = new JButton("*");
		btnMult.setForeground(new Color(0, 0, 0));
		btnMult.setBackground(new Color(128, 128, 128));
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String operation = txtDisplay.getText();
				operation = operation + "*";
				txtDisplay.setText(operation);
			}
		});
		btnMult.setBounds(319, 181, 89, 23);
		frame.getContentPane().add(btnMult);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setForeground(new Color(0, 0, 0));
		btnDiv.setBackground(new Color(128, 128, 128));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String operation = txtDisplay.getText();
				operation = operation + "/";
				txtDisplay.setText(operation);
			}
		});
		btnDiv.setBounds(318, 207, 89, 23);
		frame.getContentPane().add(btnDiv);
		
		JButton btnExp = new JButton("^");
		btnExp.setForeground(new Color(0, 0, 0));
		btnExp.setBackground(new Color(128, 128, 128));
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String operation = txtDisplay.getText();
				operation = operation + "^";
				txtDisplay.setText(operation);
			}
		});
		btnExp.setBounds(318, 232, 89, 23);
		frame.getContentPane().add(btnExp);
		
		JButton btnOpenBracket = new JButton("(");
		btnOpenBracket.setForeground(new Color(0, 0, 0));
		btnOpenBracket.setBackground(new Color(128, 128, 128));
		btnOpenBracket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String display = txtDisplay.getText();
				display = display + "(";
				txtDisplay.setText(display);
			}
		});
		btnOpenBracket.setBounds(42, 207, 89, 23);
		frame.getContentPane().add(btnOpenBracket);
		
		JButton btnCloseBracket = new JButton(")");
		btnCloseBracket.setForeground(new Color(0, 0, 0));
		btnCloseBracket.setBackground(new Color(128, 128, 128));
		btnCloseBracket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String display = txtDisplay.getText();
				display = display + ")";
				txtDisplay.setText(display);
			}
		});
		btnCloseBracket.setBounds(227, 207, 89, 23);
		frame.getContentPane().add(btnCloseBracket);
		
		JButton btnClear = new JButton("C");
		btnClear.setBackground(new Color(255, 140, 0));
		btnClear.setForeground(new Color(0, 0, 0));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("");
			}
		});
		btnClear.setBounds(319, 97, 89, 23);
		frame.getContentPane().add(btnClear);
		
		JButton btnBackspace = new JButton("B");
		btnBackspace.setBackground(new Color(255, 0, 0));
		btnBackspace.setForeground(new Color(0, 0, 0));
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String delete = txtDisplay.getText();
					delete = delete.substring(0,delete.length()-1);
					txtDisplay.setText(delete);
				} catch (Exception ex) {
					//JOptionPane.showMessageDialog(null, "Command Error, cannot perform this action on an empty entry");
				}
			}
		});
		btnBackspace.setBounds(228, 97, 89, 23);
		frame.getContentPane().add(btnBackspace);
		
		JButton btnEquals = new JButton("=");
		btnEquals.setBackground(new Color(0, 255, 0));
		btnEquals.setForeground(new Color(0, 0, 0));
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evaluateDisplay();
			}
		});
		btnEquals.setBounds(227, 232, 89, 23);
		frame.getContentPane().add(btnEquals);
	}
}

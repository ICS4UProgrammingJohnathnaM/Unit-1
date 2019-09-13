package einsteins_equation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class SimpleCalulatorGUI {

	private JFrame frame;
	private JTextField txtFirstnumber;
	private JTextField txtSecondnumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalulatorGUI window = new SimpleCalulatorGUI();
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
	public SimpleCalulatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Setting Calculator Variables
		String operator = "+";
		double number1 = 0;
		double number2 = 0;
		String AnswerText = "";
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 382, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnMultiply = new JButton(" X ");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = "*";
			}
		});
		btnMultiply.setBounds(245, 32, 79, 73);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnDivison = new JButton(" ÷ ");
		btnDivison.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = "/";
			}
		});
		btnDivison.setBounds(245, 116, 79, 72);
		frame.getContentPane().add(btnDivison);
		
		JButton btnAddition = new JButton(" + ");
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = "+";
			}
		});
		btnAddition.setBounds(245, 200, 79, 73);
		frame.getContentPane().add(btnAddition);
		
		JButton btnSubtraction = new JButton(" - ");
		btnSubtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = "-";
			}
		});
		btnSubtraction.setBounds(245, 282, 79, 72);
		frame.getContentPane().add(btnSubtraction);
		
		txtFirstnumber = new JTextField();
		txtFirstnumber.setText("firstNumber");
		txtFirstnumber.setBounds(76, 85, 86, 20);
		frame.getContentPane().add(txtFirstnumber);
		txtFirstnumber.setColumns(10);
		
		txtSecondnumber = new JTextField();
		txtSecondnumber.setText("secondNumber");
		txtSecondnumber.setBounds(76, 168, 86, 20);
		frame.getContentPane().add(txtSecondnumber);
		txtSecondnumber.setColumns(10);
		
		JLabel lblFirstNumber = new JLabel("First Number");
		lblFirstNumber.setBounds(83, 55, 79, 27);
		frame.getContentPane().add(lblFirstNumber);
		
		JLabel lblSecondNumber = new JLabel("Second Number");
		lblSecondNumber.setBounds(86, 126, 79, 27);
		frame.getContentPane().add(lblSecondNumber);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setBounds(86, 292, 46, 14);
		frame.getContentPane().add(lblAnswer);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = Double.parseDouble(txtFirstnumber.getText());
				number2 = Double.parseDouble(txtSecondnumber.getText());
				
				if (operator == "+") {
					AnswerText = Double.toString(number1 + number2);
				}
				else if (operator == "*") {
					AnswerText = Double.toString(number1 * number2);
				}
				else if (operator == "/") {
					AnswerText = Double.toString(number1 / number2);
				}
				else if (operator == "-") {
					AnswerText = Double.toString(number1 - number2);
				}
				else {
					AnswerText = "ERROR!";
				}
				lblAnswer.setText(AnswerText);
			}
		});
		btnCalculate.setBounds(57, 217, 127, 38);
		frame.getContentPane().add(btnCalculate);
	}
}

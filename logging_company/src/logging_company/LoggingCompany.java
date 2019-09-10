package logging_company;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class LoggingCompany {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoggingCompany window = new LoggingCompany();
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
	public LoggingCompany() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPrompt = DefaultComponentFactory.getInstance().createLabel("Please Input the Size of the Logs:");
		lblPrompt.setBounds(130, 72, 177, 14);
		frame.getContentPane().add(lblPrompt);
		
		JRadioButton rdbtnSmallLog = new JRadioButton("Small Log (.25m Long)");
		rdbtnSmallLog.setBounds(148, 187, 137, 23);
		frame.getContentPane().add(rdbtnSmallLog);
		JRadioButton rdbtnMediumLog = new JRadioButton("Medium Log (.5m Long)");
		rdbtnMediumLog.setBounds(148, 140, 137, 38);
		frame.getContentPane().add(rdbtnMediumLog);
		JRadioButton rdbtnLargeLog = new JRadioButton("Large Log (1m Long)");
		rdbtnLargeLog.setBounds(148, 107, 137, 30);
		frame.getContentPane().add(rdbtnLargeLog);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(168, 217, 89, 23);
		frame.getContentPane().add(btnCalculate);
	}
}

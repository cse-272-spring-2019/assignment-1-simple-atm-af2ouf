import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ATMGUI1 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATMGUI1 window = new ATMGUI1();
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
	public ATMGUI1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		visacard user = new visacard(1000, "12345");
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("");
		label.setAlignment(Label.CENTER);
		label.setBounds(10, 10, 401, 57);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("Withdraw");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(! user.withdraw(Double.parseDouble(textField.getText()))) {
					JOptionPane.showMessageDialog(null, "Insufficient balance, go check your balance.");
				}
				textField.setText("");
			}
		});
		btnNewButton.setBounds(10, 87, 133, 64);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDeposit = new JButton("Deposit");
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.deposit(Double.parseDouble(textField.getText()));
				textField.setText("");
			}
		});
		btnDeposit.setBounds(10, 176, 133, 57);
		frame.getContentPane().add(btnDeposit);
		
		JButton btnViewBalance = new JButton("View Balance");
		btnViewBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				label.setText(Double.toString(user.getAccountbalance()));
				
			}
		});
		btnViewBalance.setBounds(288, 87, 123, 64);
		frame.getContentPane().add(btnViewBalance);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(user.prev());
			}
		});
		btnPrevious.setBounds(309, 176, 89, 23);
		frame.getContentPane().add(btnPrevious);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(user.next());
			}
		});
		btnNext.setBounds(309, 210, 89, 23);
		frame.getContentPane().add(btnNext);
		
		
		
		textField = new JTextField();
		textField.setBounds(171, 95, 86, 122);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}

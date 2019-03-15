import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ATMGUISWING {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATMGUISWING window = new ATMGUISWING();
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
	public ATMGUISWING() {
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
		JTextArea textArea = new JTextArea();
		visacard user = new visacard(1000, "1234");
		JButton btnNewButton = new JButton("Login.");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(user.login(textArea.getText()))
			{
				frame.setVisible(false);
				JOptionPane.showMessageDialog(null, "Logged in successfully");
				
				
				
			}
			}
		});
		btnNewButton.setBounds(141, 167, 176, 29);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblVisaCardNumber = new JLabel("Visa card number :");
		lblVisaCardNumber.setBounds(43, 99, 112, 35);
		frame.getContentPane().add(lblVisaCardNumber);
		
		
		textArea.setBounds(162, 104, 139, 30);
		frame.getContentPane().add(textArea);
	}
}

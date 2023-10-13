import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MoverTexto {

	private JFrame frame;
	private JTextField textField;
	private JButton button;
	private JButton button_1;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MoverTexto window = new MoverTexto();
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
	public MoverTexto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Mover texto");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(22, 110, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		button = new JButton("--->");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Copiando o texto presente em textField e jogando-o para textField_1
				textField_1.setText(textField.getText());
				// Limpando o textField
				textField.setText("");
			}
		});
		button.setBounds(118, 109, 89, 23);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("<---");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField_1.getText());
				textField_1.setText("");
			}
		});
		button_1.setBounds(217, 109, 89, 23);
		frame.getContentPane().add(button_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(316, 110, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}

}

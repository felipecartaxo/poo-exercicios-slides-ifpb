import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exemplo {

	private JFrame frame;
	private JLabel label;
	private JTextField textField;
	private JButton button;
	private JButton button_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exemplo window = new Exemplo();
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
	public Exemplo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Primeira janela");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		label = new JLabel("Digite uma palavra: ");
		label.setBounds(50, 50, 115, 14);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(175, 47, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		button = new JButton("OK");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Concatena a frase "Você digitou" com a String que foi passada no textField
				String mensagem = "Você digitou '" + textField.getText() + "'";
				// Em seguida, exibe-a caixa de diálogo
				JOptionPane.showMessageDialog(null, mensagem, "Saída", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		button.setBounds(288, 46, 89, 23);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("Limpar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Limpa a caixa de texto
				textField.setText("");
				// Após limpá-la, faz com que o cursor fique na própria caixa de texto 
				textField.requestFocus();
			}
		});
		button_1.setBounds(288, 92, 89, 23);
		frame.getContentPane().add(button_1);
	}
}

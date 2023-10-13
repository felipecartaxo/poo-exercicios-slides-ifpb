import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Cursor;

public class Sorteio {

	private JFrame frame;
	private JButton button;
	private JLabel label;
	private JTextArea textArea;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sorteio window = new Sorteio();
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
	public Sorteio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 255));
		frame.setTitle("Sorteio");
		frame.setBounds(100, 100, 250, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button = new JButton("Sortear");
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setFont(new Font("Monospaced", Font.PLAIN, 12));
		button.setBackground(new Color(192, 192, 192));
		button.setBounds(30, 50, 89, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random sorteio = new Random();
				int numero = sorteio.nextInt(100);
				String historico = numero + "";
				label.setText(historico);
				textArea.append(historico + "\n");
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(button);
		
		label = new JLabel("00");
		label.setBounds(176, 43, 58, 29);
		label.setFont(new Font("Monospaced", Font.BOLD, 24));
		frame.getContentPane().add(label);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 111, 177, 124);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
		textArea.setBackground(new Color(192, 192, 192));
		scrollPane.setViewportView(textArea);
	}
}

package conta;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.Toolkit;

public class Interface {

	private JFrame frame;
	private JLabel labelNumeroConta;
	private JLabel labelCpf;
	private JTextField textFieldNumeroConta;
	private JTextField textFieldCpf;
	private JButton buttonCriarConta;
	private JButton buttonLimpar;
	private JLabel labelTitle1;
	private JLabel label;
	private JButton buttonDebitar;
	private JButton buttonExtrato;
	
	// Tem visibilidade global e pode ser utilizado em qualquer lugar da da aplicação
	private Main main;
	private JTextArea log;
	private JLabel labelValor;
	private JTextField textFieldValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
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
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Cartaxo\\Documents\\neraky\\cursos\\back-end-personal-projects\\java\\projeto-3-caixa-eletronico\\iconBancoFlorescer.png"));
		frame.setAlwaysOnTop(true);
		frame.setResizable(false);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 12));
		frame.getContentPane().setBackground(new Color(250, 128, 114));
		frame.setTitle("App Florescer");
		frame.setBounds(100, 100, 270, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		labelNumeroConta = new JLabel("Número da conta:");
		labelNumeroConta.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		labelNumeroConta.setBounds(10, 48, 110, 14);
		frame.getContentPane().add(labelNumeroConta);
		
		labelCpf = new JLabel("CPF:");
		labelCpf.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		labelCpf.setBounds(10, 72, 103, 14);
		frame.getContentPane().add(labelCpf);
		
		textFieldNumeroConta = new JTextField();
		textFieldNumeroConta.setBackground(new Color(211, 211, 211));
		textFieldNumeroConta.setBounds(118, 46, 126, 20);
		frame.getContentPane().add(textFieldNumeroConta);
		textFieldNumeroConta.setColumns(10);
		
		textFieldCpf = new JTextField();
		textFieldCpf.setBackground(new Color(211, 211, 211));
		textFieldCpf.setBounds(118, 70, 126, 20);
		frame.getContentPane().add(textFieldCpf);
		textFieldCpf.setColumns(10);
		
		// Cria conta
		buttonCriarConta = new JButton("Criar conta");
		buttonCriarConta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonCriarConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String numero = textFieldNumeroConta.getText();
					String cpf = textFieldCpf.getText();
					
					main = new Main(numero, cpf);
					
					log.setText("Conta criada com sucesso.");
				}
				catch(Exception ex) {
					log.setText(ex.getMessage());
				}
			}
		});
		buttonCriarConta.setBackground(new Color(192, 192, 192));
		buttonCriarConta.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		buttonCriarConta.setBounds(10, 111, 110, 23);
		frame.getContentPane().add(buttonCriarConta);
		
		// Limpa os campos
		buttonLimpar = new JButton("Limpar");
		buttonLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textFieldNumeroConta.setText("");
					textFieldCpf.setText("");
					textFieldValor.setText("");
					
					log.setText("Campos limpos.");
				}
				catch (Exception ex) {
					log.setText(ex.getMessage());
				}
			}
		});
		buttonLimpar.setBackground(new Color(192, 192, 192));
		buttonLimpar.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		buttonLimpar.setBounds(130, 111, 114, 23);
		frame.getContentPane().add(buttonLimpar);
		
		labelTitle1 = new JLabel("Cadastro");
		labelTitle1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		labelTitle1.setBounds(99, 11, 78, 14);
		frame.getContentPane().add(labelTitle1);
		
		label = new JLabel("Operações");
		label.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		label.setBounds(94, 158, 115, 20);
		frame.getContentPane().add(label);
		
		JButton buttonCreditar = new JButton("Creditar");
		buttonCreditar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonCreditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valor = Double.parseDouble(textFieldValor.getText());
				
				try {
					main.creditar(valor);
					log.setText("Crédito de R$ " + valor + " foi realizado com sucesso.");
				}
				catch(IllegalArgumentException ex) {
					log.setText("Informe um valor válido para creditar!");
				}
				catch (Exception ex) {
					log.setText(ex.getMessage());
				}
			}
		});
		buttonCreditar.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		buttonCreditar.setBackground(new Color(192, 192, 192));
		buttonCreditar.setBounds(10, 200, 110, 23);
		frame.getContentPane().add(buttonCreditar);
		
		buttonDebitar = new JButton("Debitar");
		buttonDebitar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonDebitar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valor = Double.parseDouble(textFieldValor.getText());
				try {
					main.debitar(valor);
					
					log.setText("Débito de R$ " + valor + " foi realizado com sucesso.");
				}
				catch(IllegalArgumentException ex) {
					log.setText("Informe um valor válido para debitar!");
				}
				catch (Exception ex) {
					log.setText(ex.getMessage());
				}
			}
		});
		buttonDebitar.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		buttonDebitar.setBackground(new Color(192, 192, 192));
		buttonDebitar.setBounds(11, 231, 109, 23);
		frame.getContentPane().add(buttonDebitar);
		
		buttonExtrato = new JButton("Extrato");
		buttonExtrato.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonExtrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main == null) {
					log.setText("Conta inexistente. Certifique-se de ter criado uma conta previamente.");
				}
				else {
					log.setText(main.toString());
				}
			}
		});
		buttonExtrato.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		buttonExtrato.setBackground(new Color(210, 210, 210));
		buttonExtrato.setBounds(81, 283, 96, 23);
		frame.getContentPane().add(buttonExtrato);
		
		log = new JTextArea();
		log.setText("Bem-vindo(a) ao Aplicativo do Banco Florescer!");
		log.setLineWrap(true);
		log.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		log.setFont(new Font("Monospaced", Font.PLAIN, 12));
		log.setEditable(false);
		log.setWrapStyleWord(true);
		log.setBackground(new Color(210, 210, 210));
		log.setBounds(10, 317, 234, 113);
		frame.getContentPane().add(log);
		
		labelValor = new JLabel("Valor:");
		labelValor.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		labelValor.setBounds(163, 214, 46, 14);
		frame.getContentPane().add(labelValor);
		
		textFieldValor = new JTextField();
		textFieldValor.setBackground(new Color(210, 210, 210));
		textFieldValor.setBounds(130, 233, 114, 20);
		frame.getContentPane().add(textFieldValor);
		textFieldValor.setColumns(10);
	}
}
package login;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;

public class Interface {

	protected static final String loginCorreto = "ifpb";
	protected static final String senhaCorreta = "123"; 

	private JFrame frame;
	private JLabel labelTitulo;
	private JLabel labelLogin;
	private JLabel labelSenha;
	private JTextField textFieldLogin;
	private JButton buttonConfirmar;
	private JButton buttonSair;
	private JPasswordField passwordFieldSenha;
	
	// Limpa os campos
	public void limparCampos() {
		textFieldLogin.setText("");
		passwordFieldSenha.setText("");
	}
	
	// Coloca o cursor no campo "Login"
	public void redirecionarFoco() {
		textFieldLogin.requestFocus();
	}

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
		frame.getContentPane().setBackground(new Color(80, 160, 160));
		frame.setTitle("Login");
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		labelTitulo = new JLabel("Fazer login");
		labelTitulo.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		labelTitulo.setBounds(98, 28, 103, 23);
		frame.getContentPane().add(labelTitulo);
		
		labelLogin = new JLabel("Login:");
		labelLogin.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		labelLogin.setBounds(34, 76, 60, 28);
		frame.getContentPane().add(labelLogin);
		
		labelSenha = new JLabel("Senha:");
		labelSenha.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		labelSenha.setBounds(34, 115, 60, 23);
		frame.getContentPane().add(labelSenha);
		
		textFieldLogin = new JTextField();
		textFieldLogin.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		textFieldLogin.setBackground(new Color(223, 223, 223));
		textFieldLogin.setBounds(104, 79, 136, 25);
		frame.getContentPane().add(textFieldLogin);
		textFieldLogin.setColumns(10);
		
		buttonConfirmar = new JButton("Confirmar");
		buttonConfirmar.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		buttonConfirmar.setBackground(new Color(192, 192, 192));
		buttonConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String login = textFieldLogin.getText();
				// O método getPassword() retorna um array de caracteres, logo não é possível jogá-lo diretamente numa String
				// O método new String() converte esse array de caracteres em uma string
				String senha = new String(passwordFieldSenha.getPassword());	
				
				try {
					if(login.equals("") || senha.equals("")) {
						throw new Exception("Login e/ou senha em branco. Insira os dados corretamente.");
					}
					else {
						if(login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
							JOptionPane.showMessageDialog(null, "Login realizado com sucesso.");
						}
						else {
							throw new Exception("Login inválido.");
						}
					}
					
					// Limpando os campos após efetuar o login
					limparCampos();
					
					// Colocando o cursor no campo "Login"
					redirecionarFoco();
				}
				
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
					
					// Limpando os campos mesmo quando não for possível realizar o login
					limparCampos();
					
					// Colocando o cursor no campo "Login"
					redirecionarFoco();
				}
			}
		});
		buttonConfirmar.setBounds(34, 183, 103, 23);
		frame.getContentPane().add(buttonConfirmar);
		
		// Configurando uma tecla de atalho ---> Nesse caos, o ENTER
		frame.getRootPane().setDefaultButton(buttonConfirmar);
		
		buttonSair = new JButton("Sair");
		buttonSair.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		buttonSair.setBackground(new Color(192, 192, 192));
		buttonSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Fecha a janela
				frame.dispose();
			}
		});
		buttonSair.setBounds(151, 183, 89, 23);
		frame.getContentPane().add(buttonSair);
		
		passwordFieldSenha = new JPasswordField();
		passwordFieldSenha.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		passwordFieldSenha.setBackground(new Color(223, 223, 223));
		passwordFieldSenha.setBounds(104, 115, 136, 25);
		frame.getContentPane().add(passwordFieldSenha);
	}
}
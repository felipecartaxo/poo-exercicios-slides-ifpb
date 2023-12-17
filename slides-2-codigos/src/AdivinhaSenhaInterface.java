import javax.swing.JOptionPane;

public class AdivinhaSenhaInterface {

	public static void main(String[] args) {
		String senha = JOptionPane.showInputDialog("Digite a senha: ");
		while(!senha.equals("ifpb")) {
			// JOptionPane.showMessageDialog(null, "Senha incorreta! Tente novamente: ");
			senha = JOptionPane.showInputDialog("Senha incorreta! Tente novamente: ");
		}
		JOptionPane.showMessageDialog(null, "Senha correta, parabéns!");
	}
}
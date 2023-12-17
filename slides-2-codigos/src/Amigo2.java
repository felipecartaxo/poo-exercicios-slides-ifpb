import javax.swing.JOptionPane;

public class Amigo2 {

	public static void main(String[] args) {
		String nome1 = JOptionPane.showInputDialog( // Atribui o valor digitado pela interface gráfica à variável 'nome1' 
				"Qual é o seu nome?"); // Abre uma caixa de diálogo, aguardando pela inserção de dados
		
		String nome2 = JOptionPane.showInputDialog( // Atribui o valor digitado pela interface gráfica à variável 'nome2'
				nome1 + ", de quem você é amigo(a)?"); // Abre uma caixa de diálogo, aguardando pela inserção de dados
		JOptionPane.showMessageDialog(null,
				nome1 + " é amigo(a) de " + nome2 + "!"); // Também abre uma caixa de diálogo, mas apenas para imprimir dados
	}
}
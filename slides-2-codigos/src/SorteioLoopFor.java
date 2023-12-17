import java.util.Random;

import javax.swing.JOptionPane;

public class SorteioLoopFor {

	public static void main(String[] args) {
		Random sorteio = new Random(); // Criando objeto 'sorteio' a partir da classe 'Random'
		int numero;
		
		for (int i = 1; i <= 6; i ++) { // Irá sortear 6 números e exibi-los
			numero = sorteio.nextInt(60);
			
			JOptionPane.showMessageDialog(null,
					"Seu " + i + "º número sorteado foi: " + numero);
			
		};
	}
}
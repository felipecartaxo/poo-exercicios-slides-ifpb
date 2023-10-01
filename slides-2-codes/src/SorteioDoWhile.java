import java.util.Random;

public class SorteioDoWhile {

	public static void main(String[] args) {
		Random sorteio = new Random();
		int numero;
		int count = 0; // Variável para verificar quantas tentativas foram ncessárias até o número 51 ser sorteado
		
		do { // Realiza o sorteio
			numero = sorteio.nextInt(60);
			System.out.println("O número sorteado foi" + numero);
			count ++;
		}
		while (numero != 51); // Enquanto o valor sorteio for diferente de 51
		System.out.println("Após " + count + " tentativas, você finalmente sorteou o número 51. Parabéns!");
	}
	
}
import java.util.Random;

public class Sorteio {

	public static void main(String[] args) {
		Random sorteio = new Random(); // Cria um objeto, a partir da classe 'Random', chamado 'sorteio'
		int a = sorteio.nextInt(100); // Sorteia um número inteiro de 0 a 99
		int b = sorteio.nextInt(60) + 30;
		
		System.out.println("Seu número sorteado foi... " + a);
		System.out.println("Você tem outra chance! Seu número foi... " + b);
	}
}
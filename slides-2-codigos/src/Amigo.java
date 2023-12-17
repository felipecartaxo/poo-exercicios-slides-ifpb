import java.util.Scanner;

public class Amigo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); // Cria o objeteo 'teclado' a partir da classe 'Scanner'
		
		System.out.println("Qual é o seu nome?"); // Imprime essa string
		String nome1 = teclado.nextLine(); // Ao pressionar 'Enter', atribui o que foi digitado à variável 'nome1'
		
		System.out.println(nome1 + ", de quem você é amigo(a)?");
		String nome2 = teclado.nextLine(); // Ao pressionar 'Enter', atribui o que foi digitado à variável 'nome2' 
		
		System.out.println(nome1 + " é amigo(a) de " + nome2 + "!");
		teclado.close();
	}
}
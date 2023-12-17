import java.util.Scanner;

public class AdivinhaSenha {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); // Criando objeto 'teclado' a partir da classe 'Scanner'
		System.out.println("Digite a senha: ");
		String senha = teclado.nextLine(); // Lê um valor pelo terminal e o atribui à variável 'senha'
		
		while (!senha.equals("ifpb")) { // Ou seja, enquanto a senha informada NÃO FOR IGUAL a string 'ifpb', o loop se repetirá
			System.out.println("Senha incorreta! Tente novamente: ");
			senha = teclado.nextLine();
		}
		
		teclado.close();
		System.out.println("Senha correta, parabéns!");
	}
}
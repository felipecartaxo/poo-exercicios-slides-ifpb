import java.util.Scanner;

public class Gabarito {

	public static void main(String[] args) {
		Scanner teclado =  new Scanner(System.in); // Criando objeto 'teclado' que será utilizado para ler inputs pelo terminal
		int acertos = 0; // Inicializando variável que irá contabilizar a quantidade de acertos
		
		System.out.println("Digite o gabarito com 10 caracteres: ");
		String gabarito = teclado.nextLine(); // Leitura das respostas do gabarito
		
		System.out.println("Digite a resposta com 10 caractereses: ");
		String respostas = teclado.nextLine(); // Leitura das respostas do aluno
		
		String[] gabaritoArray = gabarito.split(""); // Separa a string 'gabarito' em um array
		String[] respostasArray = respostas.split(""); // Separa a string 'respostas' em um array
		
		for(int i = 0; i < gabaritoArray.length; i++) {
			if (gabaritoArray[i].equals(respostasArray[i])) {
				acertos ++; // Compara cada elemento do array 'gabaritoArray' com os elementos de 'respostasArray' e, caso os elementas sejam iguais, incrementa a variável 'acertos'
			}
		}
		
		System.out.println("Número de acertos: " + acertos); // Exibe a quantidade de acertos do aluno
		
		teclado.close(); // Encerra o scanner e libera os recursos que estavam sento utilizados
	}
}
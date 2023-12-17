import java.util.Scanner;

public class InputTeclado {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int i = teclado.nextInt(); // Atribui um valor inteiro à variável 'i' (se for digitado uma letra ou um valor double, uma exceção será levantada)
		double d = teclado.nextDouble(); // Atribui um valor inteiro/double à variável 'd' 
		String s = teclado.nextLine(); // Atribui uma string à variável 's' contendo tudo o que foi digitado
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(s);
		
		teclado.close();
	}
}
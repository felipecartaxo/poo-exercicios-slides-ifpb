import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] numeros = {19, 87, 3, 54};
		
		for (int n : numeros) {
			System.out.println(n); // Imprime os elementos do array de forma desordenada
		}
		
		Arrays.sort(numeros); // Ordena os elementos do array (ordem crescente
		
		for (int n : numeros) {
			System.out.println(n); // Imprime os elementos após a ordenação
		}
	}
}
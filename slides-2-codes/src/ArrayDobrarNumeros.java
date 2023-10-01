
public class ArrayDobrarNumeros {

	public static void main(String[] args) {
		int[] numeros = {21, 28, 7, 93};
		
		for (int i = 0; i < numeros.length; i++) { // Este 'for' dobre o valor dos elementos do array
			numeros[i] = numeros[i] * 2;// numeros[i] *= 2;
		}
		
		for (int n : numeros) { // Já este 'for-each' exibe todos os elementos do array
			System.out.println(n);
		}
	}
}
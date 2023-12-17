public class ArrayTeste {

	public static void main(String[] args) {
		int[] numeros = new int[4]; // Uma outra forma de criar um array é "int[] numeros = {8, 2, 9, 2};
		numeros[0] = 8;
		numeros[1] = 2;
		numeros[2] = 9;
		numeros[3] = 2;
		
		System.out.println(numeros.length); // Imprime a quantidade de elementos do array
		System.out.println(numeros[0]); // Imprime o elemento na posição 0 do array
		System.out.println(numeros[3]); // Imprime o elemento na posição 3 do array
		System.out.println(numeros[2]); // Imprime o elemento na posição 2 do array
	}
}
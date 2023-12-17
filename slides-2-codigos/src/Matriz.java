
public class Matriz {

	public static void main(String[] args) {
		int [][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Criação e inicialização da matriz
		
		for (int linha = 0; linha <= 2; linha++) { // Este 'for' só será incrementado quando o 'for' mais interno alcançar 'coluna = 2'
			for (int coluna = 0; coluna <= 2; coluna++) {
				System.out.println(matriz[linha][coluna] + "");
			}
		}
	}
}
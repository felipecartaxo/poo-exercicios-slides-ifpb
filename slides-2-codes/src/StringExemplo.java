public class StringExemplo {

	public static void main(String[] args) {
		String nome = "joao da silva";
		
		System.out.println(nome.contains("jo")); // Verifica se a string possui 'jo'
		System.out.println(nome.contains("silva")); // Verifica se a string possui 'silva'
		System.out.println(nome.startsWith("joao")); // Verifica se a string começa com 'joao'
		System.out.println(nome.endsWith("va")); // Verifica se a string termina com 'va'
		
		int i = nome.indexOf("da"); // Retorna o índice em que a string 'da' se encontra dentro da string 'nome'
		System.out.println(i); // 5
		
		System.out.println(nome.replace("joao", "joana")); // Imprime a string substituindo 'joao' por 'joana' (lembrando que a string não é modificada)
		
		String frase = "     muitos brancos     ";
		System.out.println(frase.trim()); // O método 'trim()' descarta os espaços em branco
	}
}
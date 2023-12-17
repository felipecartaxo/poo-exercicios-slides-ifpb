public class StringBlocoTexto {

	public static void main(String[] args) {
		String texto = """
				Estou testando
				
				123 ...		
		""";
		
		System.out.println(texto); // Ao imprimir o bloco de texto, perceba que a estrutura original do texto, incluindo as quebras de linha, são mantidas
	}
}
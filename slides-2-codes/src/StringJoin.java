
public class StringJoin {

	public static void main(String[] args) {
		String texto = "11-01-2021";
		String[] partes = texto.split("-");
		
		texto = "joao";
		String[] letras = texto.split("");
		
		System.out.println(texto = String.join("/", partes)); // Junta a string "/" com os elementos do Array 'partes'
		System.out.println(texto = String.join("", letras)); // Nesse caso, como não há strings, ele vai apenas juntar os elementos do Array 'letras'
	}
}
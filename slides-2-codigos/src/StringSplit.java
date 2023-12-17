
public class StringSplit {

	public static void main(String[] args) {
		String texto = "11-01-2021";
		
		String[] partes = texto.split("-"); // Separa a string 'texto', tendo como delimitador o "-", e atribui ao Array 'partes' como elementos
		for(String n : partes ) { // Imprime os elementos do Array 'texto'
			System.out.println(n);
		}
		
		texto = "joao";
		
		String[] letras = texto.split(""); // Separa a string 'texto', mas nesse caso não há delimitador, então todas as letras de 'texto' serão um elemento do Array 'letras'
		for(String n : letras) {
			System.out.println(n);
		}
	}
}
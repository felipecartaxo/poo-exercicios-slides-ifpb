import java.util.ArrayList;

public class ArrayListUnindoListas {

	public static void main(String[] args) {
		ArrayList<String> pais = new ArrayList<>();
		pais.add("Joao");
		pais.add("Maria");
		
		ArrayList<String> filhos = new ArrayList<>();
		filhos.add("Pedro");
		filhos.add("Paulo");
		
		ArrayList<String> familia = new ArrayList<>();
		familia.addAll(pais); // Copia as referências do ArrayList 'pais'
		familia.addAll(filhos); // Copia as referências do ArrayList 'filhos'
		
		System.out.println(familia); // Ao imprimir 'familia', as Strings de 'pais' e 'filhos' também serão exibidas
		
		pais.clear(); // Esvazia 'pais'
		System.out.println(pais.size()); // Note que agora o tamanho de 'pais' é 0
		
		filhos.clear();
		
		System.out.println(familia);
	}
}
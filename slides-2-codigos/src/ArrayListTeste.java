import java.util.ArrayList;

public class ArrayListTeste {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>(); // Criando objeto 'lista' a partir da classe 'ArrayList', passando a classe correspondente ao tipo primitivo
		lista.add(8); // Adicionando elementos à lista
		lista.add(2);
		lista.add(9);
		lista.add(2);
		
		System.out.println(lista.size()); // Retorna o tamanho da ArrayList
		System.out.println(lista.get(0)); // Retorna o elemento no índice 0
		System.out.println(lista.get(3)); // Retorna o elemento no índice 3
		System.out.println(lista.get(2)); // Retorna o elemento no índice 2
		System.out.println(lista); // Retorna todos os elementos da lista (diferentemente do que acontecia no Array)
		
		lista.remove(0); // Remova o elemento no índice 0
		lista.set(1, 999); // Atualiza o valor do elemento no índice 1 (que neste caso será o 9) e atualiza para o 999
		System.out.println(lista); // Imprime o ArrayList após as mudanças
	}
}
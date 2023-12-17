import java.util.ArrayList;

public class ArrayListVarreduraIndice {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(38);
		lista.add(12);
		lista.add(71);
		lista.add(5);
		
		for(int i = 0; i < lista.size(); i++) { // Varredura pelo índice
			System.out.println(lista.get(i));
		}
	}
}
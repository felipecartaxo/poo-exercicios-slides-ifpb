import java.util.ArrayList;

public class ArrayListVarreduraElemento {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(38);
		lista.add(12);
		lista.add(71);
		lista.add(5);
		
		for(int n : lista) { // Varredura pelo elemento
			System.out.println(n);
		}
	}
}
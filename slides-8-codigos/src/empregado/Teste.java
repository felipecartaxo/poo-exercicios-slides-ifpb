package empregado;

public class Teste {

	public static void main(String[] args) {
		Empregado e1 = new Empregado(1); // Recebe 1 salário mínimo
		Empregado e2 = new Empregado(3); // Recebe 3 salários mínimos
		
		System.out.println("Salários atuais: ");
		System.out.println(e1.getSalario()); // 1320
		System.out.println(e2.getSalario()); // 3960
		
		Empregado.valorSal = 2000; // Alterando valor do salário mínimo
		
		System.out.println("\nSalários alterados: ");
		System.out.println(e1.getSalario()); // 2000
		System.out.println(e2.getSalario()); // 6000
	}
}
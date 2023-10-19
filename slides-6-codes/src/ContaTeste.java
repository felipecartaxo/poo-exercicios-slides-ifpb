public class ContaTeste {

	public static void main(String[] args) {
		try {
			Conta c1 = new Conta("12345", "123.456.789-10");
			c1.creditar(300);
			c1.debitar(100);
			c1.creditar(200);
			
			System.out.println(c1.getSaldo()); // 400
			
			Conta c2 = new Conta("78910", "00000000000");
			c2.creditar(50, 140, 9999);
			System.out.println(c2.getSaldo()); // 190
			c2.debitar(20, 18, 2);
			System.out.println(c2.getSaldo()); // 150
			System.out.println(c2.ehVazia());
			
			Conta c3 = new Conta("66666", "019.876.543-21");
			System.out.println(c3.ehVazia());
			
			c2.transferir(50, c3);
			System.out.println(c2.getSaldo()); // 100
			System.out.println(c3.getSaldo()); // 50
			
			c3.transferir(60, c3); // Deve lançar exceção, pois o c3 está tentando transferir para a própria c3
			System.out.println(c3.getSaldo());
		}
		catch(Exception e) {
			System.out.println("ERRO: " + e.getMessage());
		}
	}
}
public class TesteConta {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta("101", "123456");
		conta1.creditar(300);
		conta1.debitar(100);
		conta1.creditar(200);
		
		System.out.println(conta1);
		
		Conta conta2 = new Conta("102", "111111");
		conta1.transferir(100, conta2);
		
		System.out.println(conta1);
		System.out.println(conta2);
		
		conta2.transferir(100, conta1);
		
		System.out.println(conta1);
		System.out.println(conta2);
		System.out.println(conta2.vazia());
		
		Conta conta3 = conta1.clonar();
		
		System.out.println(conta3);
		System.out.println(conta1); 
	}
}
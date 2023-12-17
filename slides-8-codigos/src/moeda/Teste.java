package moeda;

public class Teste {

	public static void main(String[] args) {
		System.out.println("Conversao de 100 reais para dólar = " + Moeda.realToDolar(100)); // 20
		System.out.println("Conversao de 100 dólares para real = " + Moeda.dolarToReal(100)); // 500
		System.out.println("Conversao de 100 reais para euro = " + Moeda.realToEuro(100)); // 18.83
		
		Moeda.cotacaoReal = 1.2; // Alterando o valor da cotação do real 
		Moeda.cotacaoDolar = 3.5; // Alterando o valor da cotação do dólar
		Moeda.cotacaoEuro = 8.0; // Alterando o valor da cotação do euro 
		
		System.out.println("\nConversao de 100 reais para dólar = " + Moeda.realToDolar(100)); // 28.57
		System.out.println("Conversao de 100 dólares para real = " + Moeda.dolarToReal(100)); // 83.33
		System.out.println("Conversao de 100 reais para euro = " + Moeda.realToEuro(100)); // 12.5
	}
}
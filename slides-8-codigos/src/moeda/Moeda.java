package moeda;

public class Moeda {
	// O construtor da classe é privado, ou seja, não é possível criar instâncias da classe fora dela mesma 
	private Moeda() {}
	
	// Atributos estáticos
	public static double cotacaoDolar = 5.0;
	public static double cotacaoReal = 0.2;
	public static double cotacaoEuro = 5.31;
	
	// Conversão de real em dólar
	public static double realToDolar(double real) {
		return real / cotacaoDolar;
	}
	
	// Conversão de dólar em real
	public static double dolarToReal(double dolar) {
		return dolar / cotacaoReal;
	}
	// Conversão de real em euro
	public static double realToEuro(double real) {
		return real / cotacaoEuro;
	}
}
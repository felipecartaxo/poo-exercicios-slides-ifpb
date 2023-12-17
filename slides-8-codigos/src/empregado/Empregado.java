package empregado;

public class Empregado {
	private int quantSal; // Quantidade de salários mínimos
	public static double valorSal = 1320; // Atributo estático e público que representa o valor atual do salário mínimo
	
	// Construtor
	public Empregado(int quantSal) {
		this.quantSal = quantSal;
	}
	
	public double getSalario() {
		return this.quantSal * Empregado.valorSal; // Retorna o salário do empregado
	}
}
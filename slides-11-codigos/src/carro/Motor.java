package carro;

public class Motor {
	// Atributos
	private String nome;
	private double potencia;
	
	// Construtor
	public Motor(String nome, double potencia) {
		this.nome = nome;
		this.potencia = potencia;	
	}
	
	// Getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	// ToString
	@Override
	public String toString() {
		return "Motor [nome=" + nome + ", potencia=" + potencia + "]";
	}
}
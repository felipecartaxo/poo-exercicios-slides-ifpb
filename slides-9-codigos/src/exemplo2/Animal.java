package exemplo2;

public class Animal {
	private String nome;
	private double peso;
	
	// Construtor
	public Animal(String nome, double peso) {
		super(); // Indica que é uma superclasse
		this.nome = nome;
		this.peso = peso;
	}
	
	public String emitirSom() {
		return "Nenhum som...";
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return 	"Nome = " + nome +
				"\nPeso = " + peso +
				"\nSom = " + emitirSom();
	}
}
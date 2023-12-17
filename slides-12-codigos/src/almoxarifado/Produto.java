package almoxarifado;

public class Produto {
	// Atributos
	private String nome;
	private double preco;
	private Prateleira prateleira; // Relacionamento 1:1 com a classe Prateleira
	
	// Construtor
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	// Getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Prateleira getPrateleira() {
		return prateleira;
	}
	
	public void setPrateleira(Prateleira p) {
		this.prateleira = p;
	}

	// ToString
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", prateleira=" + prateleira + "]";
	}
}
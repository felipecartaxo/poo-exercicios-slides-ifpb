package pai;

public class Filho {
	// Atributos
	private String nome;
	private int idade;
	// Note que a classe Filho não possui relacionamento com a classe Pai, pois é unidirecional
	
	// Construtor
	public Filho(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	// Getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	// ToString
	@Override
	public String toString() {
		return "Filho [nome=" + nome + ", idade=" + idade + "]";
	}
}
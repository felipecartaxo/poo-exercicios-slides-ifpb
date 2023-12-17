package pai;

import java.util.ArrayList;

public class Pai {
	// Atributos
	private String nome;
	private ArrayList<Filho> filhos = new ArrayList<>(); // Cria a lista vazia // Relacionamento com a classe Filho (1:*)
	
	// Construtor
	public Pai(String nome) {
		this.nome = nome;
	}
	
	// Método para adicionar um filho
	public void adicionar(Filho f) {
		filhos.add(f);
	}
	
	// Método para remover um filho
	public void remover(Filho f) {
		filhos.remove(f);
	}
	
	// Método para localizar um filho
	public Filho localizar(String nome ) {
		for(Filho f : filhos) {
			if(f.getNome().equals(nome)) {
				return f;
			}
		}
		return null;
	}
	
	public Filho obterCacula() {
		Filho filhoMaisNovo = null;
		int menorIdade = 999; 
		
		for (Filho f : filhos) {
			if(f.getIdade() <= menorIdade) {
				menorIdade = f.getIdade(); // Atualiza a menor idade
				filhoMaisNovo = f;
			}
		}
		return filhoMaisNovo;
	}

	public double obterIdadeMedia() {
		int totalIdade = 0;
		int totalFilhos = filhos.size();
		for (Filho f : filhos) {
			totalIdade += f.getIdade();
		}

		return totalIdade / totalFilhos;
	}

	// Getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Filho> getFilhos() {
		return filhos;
	}

	public void setFilhos(ArrayList<Filho> filhos) {
		this.filhos = filhos;
	}

	// ToString
	@Override
	public String toString() {
		return "Pai [nome=" + nome + ", filhos=" + filhos + "]";
	}
}
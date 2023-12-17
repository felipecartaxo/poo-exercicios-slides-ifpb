package almoxarifado;

import java.util.ArrayList;

public class Prateleira {
	// Atributos
	private int id;
	private int tamanho;
	private ArrayList<Produto> produtos = new ArrayList<>(); // Relacionamento 1:N com a classe Produtos, ou seja, uma prateleira possui vários produtos
	
	// Construtor
	public Prateleira(int id, int tamanho) {
		this.id = id;
		this.tamanho = tamanho;
	}
	
	// Método para adicionar um produto na prateleira
	public void adicionar(Produto p) {
		produtos.add(p);
	}
	
	// Método para remover um produto da prateleira
	public void remover(Produto p) {
		produtos.remove(p);
	}
	
	// Método para localizar um determinado produto na prateleira
	public Produto localizar(String nome) { // Busca pelo nome do produto
		for(Produto p : produtos) {
			if(p.getNome().equals(nome)) {
				return p; // Retorna o produto encontrado
			}
		}
		return null; // No caso de não encontrar o produto
	}

	// Getters e setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	// ToString
	@Override
	public String toString() {
		return "Prateleira [id=" + id + ", tamanho=" + tamanho + "]";
	}
}
public class Retangulo {
	
	// Definindo os atributos
	// 'private' impede o acesso ao atributo fora de sua classe
	private int id;
	private double largura;
	private double comprimento;
	
	// Adicionando construtor com 3 parâmetros
	public Retangulo(int id, double largura, double comprimento) {
		// O 'this' significa que, para qualquer objeto instanciado, o id do objeto em questão será o que foi passado no construtor
		this.id = id;
		this.largura = largura;
		this.comprimento = comprimento;
	}
	
	// Adicionando construtor vazio (inicializa os atributos com 0)
	public Retangulo() {
	}
	
	// Adicionando construtor com apenas um parâmetro, para inicializar a largura e o comprimento com o mesmo valor
	public Retangulo(double valor) {
		this.largura = valor;
		this.comprimento = valor;
	}
	
	// Método que calcula a área do retângulo
	public double calcularArea() {
		return this.largura * this.comprimento;
	}
	
	// Altera as medidas do retângulo para que o mesmo se transforme em um quadrado
	public void enquadrar() {
		double media = (this.largura + this.comprimento) / 2;
		this.largura = media;
		this.comprimento = media;
		// Por ser um método do tipo void, não é necessário ter um 'return'
	}
	
	// Verifica se o retângulo é quadrado
	public boolean ehQuadrado() {
//		if(this.largura == this.comprimento) {
//			return true;
//		}
//		else {
//			return false;
//		}
		return this.largura == this.comprimento;
	}
	
//	public String toString() { // Converte o objeto para string
//		return  " id=" + this.id +
//				" largura=" + this.largura +
//				" comprimento=" + this.comprimento;
//	}
	
	// Método 'toString()' gerado pelo próprio Eclipse
	@Override
	public String toString() {
		return "Retangulo [id=" + id + ", largura=" + largura + ", comprimento=" + comprimento + "]";
	}
	
	// Verifica se as medidas do retângulo que está chamando o método são iguais às medidas do outro retângulo que foi passado no método
	public boolean ehEquivalente(Retangulo outro) {
		return this.calcularArea() == outro.calcularArea();
	}
	
	// Altera as medidas do retângulo com base no fator especificado
	public void redimensionar(double fator) {
		this.largura *= fator;
		this.comprimento *= fator;
	}

	// Copia os atributos de um objeto 
	public void copiar(Retangulo outro) {
		this.largura = outro.largura;
		this.comprimento = outro.comprimento;
	}

	// 'getter' para o atributo 'id'
	public int getId() {
		return id;
	}

	// 'setter' para o atributo 'id'
	public void setId(int id) {
		this.id = id;
	}

	// 'getter' para o atributo 'largura'
	public double getLargura() {
		return largura;
	}

	// 'setter' para o atributo 'largura'
	public void setLargura(double largura) {
		this.largura = largura;
	}

	// 'getter' para o atributo 'comprimento'
	public double getComprimento() {
		return comprimento;
	}
	
	// 'setter' para o atributo 'comprimento'
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
}
public class Matricula2 {
	
	// Definindo os atributos
	private String ano;
	private String periodo;
	private String codigoCurso;
	private String sequencia;
	
	// Construtor
	public Matricula2(String texto) {
		ano = texto.substring(0, 4);
		periodo = texto.substring(4, 5);
		codigoCurso = texto.substring(5, 7);
		sequencia = texto.substring(7);
	}
	
	// Retorna o ano (de acordo com o que foi passado no construtor)
	public String getAno() {
		return ano;
	}
	
	// Retorna o período (de acordo com o que foi passado no construtor)
	public String getPeriodo() {
		return periodo;
	}

	// Retorna o código do curso (de acordo com o que foi passado no construtor)
	public String getCodigoCurso() {
		return codigoCurso;
	}
	
	// Retorna a sequência (de acordo com o que foi passado no construtor)
	public String getSequencia() {
		return sequencia;
	}
}
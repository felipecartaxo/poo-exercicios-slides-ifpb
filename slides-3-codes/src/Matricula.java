public class Matricula {

	// Definindo os atributos
	private String matricula;
	
	// Construtor com apenas um atributo
	public Matricula(String texto) {
		// Exemplo de matrícula = "20222370187"
		this.matricula = texto;
	}
	
	// Retorna uma parte da string, entre o índice 0 e 4, que corresponde ao ano
	public String getAno() {
		return matricula.substring(0, 4);
	}
	
	// Retorna uma parte da string, entre o índice 4 e 5, que corresponde ao período
	public String getPeriodo() {
		return matricula.substring(4, 5);
	}
	
	// Retorna uma parte da string, entre o índice 5 e 7, que corresponde ao código do curso
	public String getCodigoCurso() {
		return matricula.substring(5, 7);
	}
	
	// Retorna uma parte da string, entre o índice 7 e o final da string, que corresponde à sequência (???)
	public String getSequencia() {
		return matricula.substring(7);
	}
}

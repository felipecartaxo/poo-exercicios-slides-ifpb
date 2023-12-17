public class Aluno {
	
	// Definindo os atributos
	private String nome;
	private int nota1;
	private int nota2;
	
	// Construtor
	public Aluno(String nome, int nota1, int nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	// Retorna a média aritmética (inteira) 
	public Integer getMedia() {
		return (this.nota1 + this.nota2) / 2;
	}
	
	// Retorna uma string informando a situação acadêmica do aluno
	public String getSituacao() {
		int media = this.getMedia();
		
		if (media >= 70)
			return "Aprovado";
		else {
			if (media >= 40)
				return "Final";
			else
				return "Reprovado";
		}
	}

	// Método toString()
	@Override
	public String toString() {
		return "Aluno [nome = " + nome + ", nota1 = " + nota1 + ", nota2 = " + nota2 + "]";
	}
	// getter() do atributo 'nome'
	public String getNome() {
		return nome;
	}
	
	// setter() do atributo 'nome'
	public void setNome(String nome) {
		this.nome = nome;
	}

	// gettter() do atributo 'nota1'
	public int getNota1() {
		return nota1;
	}

	// setter() do atributo 'nota1'
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	
	// getter() do atributo 'nota2'
	public int getNota2() {
		return nota2;
	}
	
	// setter() do atributo 'nota2'
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}	
}
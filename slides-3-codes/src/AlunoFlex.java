import java.util.Arrays;

public class AlunoFlex {
	
	private String nome;
	private double[] notas; 							// Array de notas

	// Construtor
	public AlunoFlex(String nome, double... notas) { // Pode receber zero ou mais argumentos do tipo double. Esses argumentos são tratados como um array.
		this.nome = nome;
		this.notas = notas;
	}
	
	public int getMedia() { 						// Retorna a média das n notas do aluno, dessa vez arredondando-as
		int somaNotas = 0;

		for (double valor : notas) {
			somaNotas += valor;
		}
		
		return (int)Math.round(somaNotas / notas.length);
	}
	
	public String getSituacao() { 					// Retorna uma string informando a situação acadêmica do aluno
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

	@Override
	public String toString() {
		return "Aluno [nome = " + nome + ", notas = " + Arrays.toString(notas) + ", média = " + getMedia()
				+ ", situação = " + getSituacao() + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
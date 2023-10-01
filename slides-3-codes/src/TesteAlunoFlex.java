public class TesteAlunoFlex {

	public static void main(String[] args) {

		AlunoFlex a1 = new AlunoFlex("joao", 100, 70) ;
		AlunoFlex a2 = new AlunoFlex("maria", 90, 50, 70, 80) ;
		AlunoFlex a3 = new AlunoFlex("jose");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3); 						// Como não foi especificado o valor das notas, ao instanciar o objeto 'a3', o mesmo foi criado com 'notas = [0]', logo, ao efetuar o método 'toString', o qual contém o método 'getMedia', ocorre um erro informando que não é possível efetuar divisão por 0
	}
}
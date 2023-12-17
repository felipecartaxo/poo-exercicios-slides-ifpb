public class TesteRetangulo {

	public static void main(String[] args) {
		Retangulo r = new Retangulo(); // Instanciando o objeto 'r' a partir da classe 'Retangulo'
		
		// Manipulando os atributos
		// Após alterar os atributos para 'private', não é mais possível alterar seus valores diretamente
//		r.id = 1;
//		r.largura = 1;
//		r.comprimento = 7;
		
		// Para alterar os atributos do objeto, será necessário chamar os 'setters()'
		r.setId(1);
		r.setLargura(1);
		r.setComprimento(7);
		System.out.println(r.calcularArea()); // 7
		
//		r.largura = 3;
//		r.comprimento = 4;
		r.setLargura(3);
		r.setComprimento(4);
		System.out.println(r.calcularArea()); // 12
	}
}
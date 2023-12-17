package pai_teste;

import pai.Filho;
import pai.Pai;

public class Teste {

	public static void main(String[] args) {
		// Criando um objeto Pai
		Pai pai = new Pai("Donald");
		
		// Adicionando filhos ao Objeto pai
		pai.adicionar(new Filho("Zezinho", 6));
		pai.adicionar(new Filho("Huguinho", 7));
		pai.adicionar(new Filho("Luisinho", 5));
		
		System.out.println(pai.localizar("Zezinho")); // nome=Zezinho, idade=6 
		System.out.println(pai); // Inome=Donald, filhos=[Filho [nome=Zezinho, idade=6], Filho [nome=Huguinho, idade=7], Filho [nome=Luisinho, idade=5]]
		
		Filho zezinho;
		zezinho = pai.localizar("Zezinho");
		
		if(zezinho != null) {
			pai.remover(zezinho); // Remove o relacionamento com o filho Zezinho
		}
		
		if(zezinho == null) {
			System.out.println("Zezinho inexistente"); // Zezinho inexistente 
		}
		
		System.out.println(pai); // Agora possui apenas 2 filhos
		System.out.println(pai.localizar("Zezinho")); // null
		
		System.out.println(pai.getFilhos());
		System.out.println(pai.obterCacula());

		System.out.println("Obtendo média de idade dos filhos: ");
		System.out.println(pai.obterIdadeMedia()); // 6
	}
}
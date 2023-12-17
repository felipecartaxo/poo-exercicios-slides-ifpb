package almoxarifado_teste;

import almoxarifado.Prateleira;
import almoxarifado.Produto;

public class Teste {

	public static void main(String[] args) {
		// Instanciando os produtos
		Produto arroz, feijao, carne, leite;
		arroz = new Produto("arroz", 5.0);
		feijao = new Produto("feijao", 8.0);
		carne = new Produto("carne", 40.0);
		leite = new Produto("leite", 5.0);
		
		// Instanciando as prateleiras
		Prateleira prat1 = new Prateleira(1, 10);
		Prateleira prat2 = new Prateleira(2, 20);
		
		// Relacionando as prateleiras com seus produtos
		prat1.adicionar(arroz);
		prat1.adicionar(feijao);
		prat1.adicionar(carne);
		prat2.adicionar(leite);
		
		// Relacionando os produtos com as prateleiras
		arroz.setPrateleira(prat1);
		feijao.setPrateleira(prat1);
		carne.setPrateleira(prat1);
		leite.setPrateleira(prat2);
		
		System.out.println(prat1);
		System.out.println(prat2);
		
		System.out.println(arroz);
		System.out.println(feijao);
		System.out.println(carne);
		System.out.println(leite);
	}
}
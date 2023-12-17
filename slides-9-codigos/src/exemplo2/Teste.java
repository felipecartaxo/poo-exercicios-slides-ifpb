package exemplo2;

public class Teste {

	public static void main(String[] args) {
		// Instanciando os objetos
		Gato fifi = new Gato("Fifi", 5, 3);
		Cachorro rex = new Cachorro("Rex", 15);
		
		// Exibir nome, peso e som dos objetos instanciados
		System.out.println(fifi); // fifi 5 Miauuu
		System.out.println(rex); // rex 15 Au au
		
		Veterinario bob = new Veterinario("Bob");
		System.out.println(bob.aplicarInjecao(fifi));
		System.out.println(bob.aplicarInjecao(rex));
	}
}
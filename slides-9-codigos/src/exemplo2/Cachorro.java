package exemplo2;

public class Cachorro extends Animal {
	public Cachorro(String nome, double peso) {
		super(nome, peso);
	}
	
	// O override faz com que o compilador valide a sobrescrita
	@Override
	public String emitirSom() {
		return "Au au!";
	}
}
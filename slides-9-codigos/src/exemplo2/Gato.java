package exemplo2;

public class Gato extends Animal {
	private int salto;
	
	public Gato(String nome, double peso, int salto) {
		super(nome, peso);
		this.salto = salto;
	}
	
	// O override faz com que o compilador valide a sobrescrita
	@Override
	public String emitirSom() {
		return "Miauuu!";
	}

	public int getSalto() {
		return salto;
	}

//	@Override
//	public String toString() {
//		return "Nome = " + getNome() +
//				"\nPeso = " + getPeso() +
//				"\nSalto = " + salto +
//				"\nSom = " + emitirSom();
//	}
	
	@Override
	public String toString() {
		return super.toString() + "\nSalto = " + salto;
	}
}
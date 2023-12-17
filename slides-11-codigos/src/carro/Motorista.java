package carro;

public class Motorista {
	// Atributos
	private String cnh;
	
	// Construtor
	public Motorista(String cnh) {
		this.cnh = cnh;
	}
	
	// Getters e setters
	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	// ToString
	@Override
	public String toString() {
		return "Motorista [cnh=" + cnh + "]";
	}
}
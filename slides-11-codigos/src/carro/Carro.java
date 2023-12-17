package carro;

public class Carro {
	// Atributos
	private String placa;
	private Motor motor; // Referência para o objeto Motor
	private Motorista motorista; // Referência para o objeto Motorista
	
	// Construtor
	public Carro(String placa, Motor motor, Motorista motorista) {
		this.placa = placa;
		this.motor = motor; // Armazena a referência de Motor
		this.motorista = motorista; // Armazena a referência de motorista
	}
	
	// Getters e setters
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	// ToString
	@Override
	public String toString() {
		return "Carro [placa=" + placa + ", motor=" + motor + ", motorista=" + motorista + "]";
	}
}
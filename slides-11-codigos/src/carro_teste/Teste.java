package carro_teste;

import carro.Carro;
import carro.Motor;
import carro.Motorista;

public class Teste {
	public static void main(String[] args) {
		// Criando relacionamento entre as classes
		Motor motor1 = new Motor("Zetec", 1.0);
		Motorista motorista = new Motorista("1111");
		Carro carro1 = new Carro("AAA1234", motor1, motorista);
		
		System.out.println(carro1.getMotorista().getCnh()); // 1111
		System.out.println(carro1.getMotor().getPotencia()); // 1.0
		
		carro1.getMotor().setPotencia(1.4);
		System.out.println(carro1.getMotor().getPotencia()); // 1.4
		
		// Criando segundo objeto Carro
		Motor motor2 = new Motor("Fire", 1.6);
		Carro carro2 = new Carro("XYZ2000", motor2, motorista);
		
		System.out.println(carro1);
		System.out.println(carro2);
		
		// Alterando a CNH do motorista do carro1
		carro1.getMotorista().setCnh("3333");
		
		// Os dois carros estão referenciando o mesmo motorista
		System.out.println(carro1.getMotorista().getCnh()); // 3333
		System.out.println(carro1.getMotorista().getCnh()); // 3333
		
		// Removendo o motorista dos dois carros
		carro1.setMotorista(null);
		carro2.setMotorista(null);
		
		// Criando novo motorista para os dois carros
		carro1.setMotorista(new Motorista("4444"));
		carro2.setMotorista(new Motorista("5555"));
		
		System.out.println(carro1.getMotorista().getCnh()); // 4444
		System.out.println(carro2.getMotorista().getCnh()); // 5555
	}
}
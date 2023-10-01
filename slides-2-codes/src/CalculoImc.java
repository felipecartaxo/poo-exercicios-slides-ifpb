public class CalculoImc {

	public static void main(String[] args) {
		double peso = 84;
		double altura = 1.87;
		String s = ""; // Variável que posteriormente será utilizada para exibir a situação do paciente
		
		double imc = peso / (Math.pow(altura, 2)); // Realiza o cálculo do IMC. Para calcular potenciação, é necessário utilizar o método 'pow' da biblioteca 'Math', passando, respectivamente, a variável e o valor do expoente
		
		if (imc < 18.5) {
			s = "Abaixo do peso";
		}
		else {
			if (imc < 25) {
				s = "Peso ideal";
			}
			else {
				if (imc < 30) {
					s = "Levemente acima do peso";
				}
				else {
					if (imc < 35) {
						s = "Obesidade grau I";
					}
					else {
						if (imc < 40 ) {
							s = "Obesidade grau II (severa)";
						}
						else
							s = "Obesidade grau III (mórbida)";
					}
				}
			}
		}
		
		
		System.out.println("Situação do paciente: " + s);
	}
}

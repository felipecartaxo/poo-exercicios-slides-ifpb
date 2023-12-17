import java.util.Scanner;

public class CalculoImcTeclado {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); // Agora a leitura dos valores será realizada de forma interativa por meio do terminal
		
		double peso = 0; // Iniciando as variáveis 
		double altura = 0;
		String s = ""; // É necessário iniciar as variáveis antes do 'try' pois, como a entrada de dados está no bloco 'try', ao tentar imprimi-las no final do código, não será possível acessá-las já que existirão apenas no bloco 'try'
		
		try { // Iremos TENTAR (try) ler o peso e a altura do paciente. Como a entrada será feita por meio do teclado, após a leitura é necessário converter os valores para double (pois, pelo teclado, os valores são lidos como string)
			System.out.println("Informe seu peso: ");
			peso = Double.parseDouble(teclado.nextLine()); // Leitura e conversão do valor lido
			
			System.out.println("Informe sua altura");
			altura = Double.parseDouble(teclado.nextLine()); // Leitura e conversão do valor lido
		}
		catch(Exception e) { // Caso algum erro aconteça durante a leitura dos valores no 'try'
			System.out.println("Formato do número incorreto"); // Mensagem de erro
			System.exit(0); // Encerra o programa
		}
		
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
		
		
		System.out.println("--------------------------");
		System.out.println("Situação do paciente: " + s);
		
		teclado.close();
	}
}
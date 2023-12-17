import javax.swing.JOptionPane;

public class CalculoImcInterface {

	public static void main(String[] args) {
		double peso = 0; // Iniciando as variáveis 
		double altura = 0;
		String s = ""; // É necessário iniciar as variáveis antes do 'try' pois, caso fiquem dentro do bloco 'try', ao tentar imprimi-las no final do código, não será possível acessá-las já que existirão apenas no bloco 'try' 
		
		try { // Iremos TENTAR (try) ler o peso e a altura do paciente. Como a entrada será feita por meio da interface gráfica, após a leitura é necessário converter os valores para double (pois os valores são lidos como string)
			peso =
					Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso: ")); // Por meio da interface gráfic ado Swing, o usuário entra com um valor que, após inserido, será convertido para Double
			altura =
					Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura: ")); // Convertendo string para double
		}
		catch(Exception e) { // Caso algum erro aconteça durante a leitura dos valores no 'try'
			JOptionPane.showMessageDialog(null, "Formato do número incorreto"); // Mensagem de erro
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
		
		
		JOptionPane.showMessageDialog(null,
				"Resultado do paciente: " + s);
	}
}
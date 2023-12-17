public class Triangulo {
	
	// Definindo os atributos
	public double base;
	public double altura;
	
	// Construtor com 2 parâmetros
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	// Construtor vazio (lembrando que, neste caso, inicializará todos os atributos com valor 0
	public Triangulo() {		
	}
	
	// Método para calcular a área do triângulo
	public double calcularArea() {
		return (base * altura) / 2;
	}
	
	// Método toString()
	@Override
	public String toString() {
		return "Triangulo [base = " + base + ", altura = " + altura + "]";
	}

	// Método para retornar o valor do atributo 'base' (getter)
	public double getBase() {
		return base;
	}
	// Método para alterar o valor do atributo 'base' (setter)
	public void setBase(double base) {
		this.base = base;
	}

	// Método para retornar o valor do atributo 'altura' (getter)
	public double getAltura() {
		return altura;
	}
	// Método para alterar o valor do atributo 'altura' (setter)
	public void setAltura(double altura) {
		this.altura = altura;
	}
}
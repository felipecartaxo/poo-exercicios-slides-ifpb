package exemplo1;

public class P {
	public int a;
	public int b;
	public int c;
	
	// Construtor
	public P(int a, int b, int c) {
		super(); // Indica que P é uma super classe
		this.a = a;
		this.b = b;
		this.c = c;
	}
		
	public int somar() {
		return this.a + this.b + this.c;
	}
}
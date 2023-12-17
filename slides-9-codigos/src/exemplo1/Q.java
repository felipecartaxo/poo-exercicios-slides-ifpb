package exemplo1;

//public class Q {
//	public int a;
//	public int b;
//	public int c;
//	public int d;
//	
//	Construtor
//	public Q(int a, int b, int c, int d) {
//		this.a = a;
//		this.b = b;
//		this.c = c;
//		this.d = d;
//	}
//	
//	public int somar() {
//		return this.a + this.b + this.c + this.d;
//	}
//}

// Refazendo a classe Q utilizando herança
public class Q extends P {
	public int d;
	
	// Construtor
	public Q(int a, int b, int c, int d) {
		super(a, b, c);
		this.d = d;
	}
	
	public int somar() { // Sobreescrita de método
		// return a + b + c + d;
		
		// Chamado ao método da superclasse
		return super.somar() + d;
	}
}
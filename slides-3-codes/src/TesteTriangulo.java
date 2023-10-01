public class TesteTriangulo {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo(3,4);
		
		System.out.println(t1.calcularArea());  //6.0
		t1.setAltura(5);
		System.out.println(t1.calcularArea());	//7.5
	}
}

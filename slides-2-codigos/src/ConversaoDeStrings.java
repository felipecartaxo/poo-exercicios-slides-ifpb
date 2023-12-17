public class ConversaoDeStrings {

	public static void main(String[] args) {
		int i = Integer.parseInt("2"); // Converte a string "2" em um valor inteiro
		System.out.println((i + 2)); // Note que, após a conversão, já é possível realizar operações matemáticas
		String a = "3"; // Aqui a string "3" ainda é apenas uma String
		System.out.println(i + a); // Portanto, ao tentar realizar operações matemáticas, o que acontece é que estamos apenas concatenando o valor inteiro '2' com a String "a"
		
		double d = Double.parseDouble("2.5"); // Converte a string "2.5" para um valor double (valor decimal)
		System.out.println(d);
		System.out.println(i + d); // Após a conversão, também é possível realizar operações matemáticas
		
		boolean b = Boolean.parseBoolean("true"); // Converte a string "true" em um valor booleano
		System.out.println(b);
		
		if(b) {
			System.out.println(b + " é um valor booleano");
		}
		
		String s;
		s = Integer.toString(2); // Converte o valor inteiro '2' em uma String
		System.out.println(s);
		System.out.println(s + i); // Ao tentar efetuar uma operação matemática, o que acontece é uma concatenação entre a String 's' e o valor inteiro 'i', resultando em 22
		
		s = Double.toString(2.5); // Converte o double '2.5' em String
		s = Boolean.toString(true); // Converte o boolean 'true' em String
		
		s = 2 + ""; // Resulta na string "2"
		System.out.println(s);
	}
}
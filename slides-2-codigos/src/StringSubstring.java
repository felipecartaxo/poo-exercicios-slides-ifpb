
public class StringSubstring {

	public static void main(String[] args) {
		String palavra = "linguagem";
		
		String s1 = palavra.substring(0, 3); // Atribui à string 's1' os caracteres entre o índice 0 e 3 -> "lin"
		String s2 = palavra.substring(4, 5); // Atribui à string 's2' os caracteres entre o índice 4 e 5 -> "u"
		String s3 = palavra.substring(5); // Atribui à string 's3' os caracteres do índice 5 em diante -> "agem"
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
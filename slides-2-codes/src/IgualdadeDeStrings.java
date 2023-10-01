public class IgualdadeDeStrings {

	public static void main(String[] args) {
		String a = "Ana"; // No Java, só é possível colocar strings entre aspas duplas
		String b = "João";
		
		if (a.equals(b)) {
			System.out.println("As strings são iguais"); // Para não ter que digitar manualmente este comando, digite apenas "syso", pressione Ctrl + Spacebar e por último aprte "Enter" para inserir o comando
		}
		else {
			System.out.println("As strings são diferentes");
		}
		
		// Outra forma de escrever o 'if'
		if (!a.equals(b)) { // Lê-se "se 'a' não for igual a 'b', então exiba a mensagem abaixo
			System.out.println("As strings são diferentes");
		}
		else {
			System.out.println("As strings são iguais");
		}
	}
}
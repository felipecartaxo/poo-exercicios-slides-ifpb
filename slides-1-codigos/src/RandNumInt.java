import java.util.Random;

public class RandNumInt {
	
	public static void main(String[] args) {
		
		System.out.println("Seu número sorteado foi " + (new Random().nextInt(100)) + "!");
	}
}
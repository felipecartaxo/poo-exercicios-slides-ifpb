package partida;

public class Teste {

	public static void main(String[] args) {
		try {
			Main time1 = new Main();
			System.out.println(time1.getQuantGols());
			
			time1.marcarGol();
			System.out.println(time1.getQuantGols());
			
			for(int i = 0; i < 6; i++) {
				time1.marcarGol();
				System.out.println(time1.getQuantGols());
			}
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}

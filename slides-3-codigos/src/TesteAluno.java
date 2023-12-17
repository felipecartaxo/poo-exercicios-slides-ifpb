public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("joao", 100, 70) ;
		System.out.println(a1);
		System.out.println(a1.getMedia());
		System.out.println(a1.getSituacao());

		Aluno a2 = new Aluno("maria", 20, 90) ;
		System.out.println(a2);
		System.out.println(a2.getMedia());
		System.out.println(a2.getSituacao());
	}
}
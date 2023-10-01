public class TesteMatricula {

	public static void main(String[] args) {
		Matricula matricula = new Matricula("20222370187");
		String ano = matricula.getAno();
		String periodo = matricula.getPeriodo();
		String codigoCurso = matricula.getCodigoCurso();
		String sequencia = matricula.getSequencia();

		System.out.println(ano);			//2022
		System.out.println(periodo);		//2
		System.out.println(codigoCurso);	//37
		System.out.println(sequencia);		//0187
	}
}
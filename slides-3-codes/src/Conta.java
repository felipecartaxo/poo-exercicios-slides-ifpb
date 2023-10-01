public class Conta {
	
	private String numero;
	private String cpf;
	private double saldo;
	
	public Conta(String numero, String cpf) {				// Construtor
		this.numero = numero;
		this.cpf = cpf;
		this.saldo = 0;										// Inicializa o saldo sendo 0. Lembrando que 'saldo' não é passado no construtor, visto que é um valor que será processado de acordo com os métodos 'creditar()' e 'debitar()'
	}
		
	public void creditar(double valor) {					// Deposita na conta
		saldo += valor;
	}
	
	public void debitar(double valor) {						// Desconta da conta
		saldo -= valor;
	}
	
	public void transferir(double valor, Conta destino) { 	// Transfere um determinado valor de uma conta e para outra
		this.debitar(valor); 								// Primeiramente iremos debitar o valor da conta que fará a transferência
		destino.creditar(valor);							// Em seguida vamos creditar o valor na conta que é alvo da transferência
	}
	
	public void creditar(double ...lista) { 				// Permite adicionar um ou mais valores ao saldo de uma conta
		for (double valor : lista) { 						// for-each onde a variável 'valor' irá representar cada valor na lista à medida que o loop avança
			saldo += valor;
		}
	}
	
	public boolean vazia() { 								// Verifica se a conta está vazia
		if (saldo == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Conta clonar() {									// Cria uma cópia da conta atual, mantendo o mesmo número, CPF e saldo
		Conta novaConta = new Conta(this.numero, this.cpf); // Nesta linha, uma nova instância da classe 'Conta', chamada 'novaconta', é criada. Ela é inicializada com os mesmos valores de 'numero' e 'cpf' que a instância atual (a instância em que o método clonar() está sendo chamado). Isso significa que a nova conta terá o mesmo número e CPF que a conta original
		novaConta.creditar(this.saldo); 					// Passa o valor do saldo da conta original para a nova conta
		return novaConta; 									// Retorna 'novaconta', que é uma cópia da conta original
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", cpf=" + cpf + ", saldo=" + saldo + "]";
	}
}
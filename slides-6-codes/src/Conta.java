
public class Conta {
	private String numero;
	private String cpf;
	private double saldo;
	
	// Construtor
	public Conta(String numero, String cpf) throws Exception {
		if(!numeroValido(numero)) {
			throw new Exception("Insira um número no formato '12345'.");
		}
		if(!cpfValido(cpf)) {
			throw new Exception("Insira um CPF no formato '12345678910' ou '123.456.789-10'");
		}
		
		this.numero = numero;
		this.cpf = cpf;
		
		// Toda conta será criada com saldo 0
		this.saldo = 0;
	}
	
	// Deposita um determinado valor na conta
	public void creditar(double valor) throws Exception {
		if(valor <= 0) {
			throw new Exception("Insira um valor maior do que zero.");
		}
		// Na nossa regra de negócio, o banco só aceita depósitos de até R$ 10.000
		if(valor > 10000) { 
			throw new Exception("O valor máxixmo para depósitos é de R$ 10.000.");
		}
		
		this.saldo = this.saldo + valor;
	}
	
	// Deposita mais de um valor a partir de uma lista de valores
	public void creditar(double... valor) throws Exception {
		for(double valorAtual : valor) {
			if(valorAtual <= 0) {
				throw new Exception("Insira um valor maior do que zero.");
			}
			if(valorAtual > 10000) { // Na nossa regra de negócio, o banco só aceita depósitos de até R$ 10.000
				throw new Exception("O valor máxixmo para depósitos é de R$ 10.000.");
			}
						
			this.saldo = this.saldo + valorAtual;
		}
	}
	
	// Retira um determinado valor da conta
	public void debitar(double valor) throws Exception {
		if(this.saldo == 0) {
			throw new Exception("Você não possui saldo para ser debitada. Faça um depósito antes!");
		}
		if(valor <= 0) {
			throw new Exception("Insira um valor maior do que zero.");
		}
		if(valor > this.saldo) {
			throw new Exception("Valor da transferência é maior do que o saldo existente.");
		}
		
		this.saldo = this.saldo - valor;
	}
	
	// Retira mais de um valor a partir de uma lista de valores
	public void debitar(double... valor) throws Exception {
		for(double valorAtual : valor) {
			if(valorAtual <= 0) {
				throw new Exception("Insira um valor maior do que zero.");
			}
			if(valorAtual > this.saldo) {
				throw new Exception("Valor da transferência é maior do que o saldo existente.");
			}
			
			this.saldo = this.saldo - valorAtual;	
		}
	}
	
	public void transferir(double valor, Conta contaDestino) throws Exception {
		// Lançará exceção se a conta que receberá a transferência for a mesma conta que está fazendo a transferência
		if(this == contaDestino) {
			throw new Exception("As contas origem e destino são as mesmas.");
		}
		
		this.debitar(valor);
		contaDestino.creditar(valor);
	}
	
	// Verifica se a conta está vazia
	public String ehVazia() {
		if(this.saldo == 0) {
			return "A conta " + this.numero + " está vazia.";
		}
		else {
			return "A conta " + this.numero + " possui saldo igual a R$ " + String.format("%.2f", this.saldo);
		}
	}
	
	public boolean cpfValido(String cpf) {
		// Verifica se o CPF não é nulo e se é um CPF válido
	    if ((cpf != null) && (cpf.matches("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$")) || (cpf.matches("\\d{11}"))) {
	        return true;
	    } else {
	        return false;
	    }
	}
	public boolean numeroValido(String numero) {
	    // Verifica se a string tem 5 dígitos
	    if (numero != null && numero.matches("\\d{5}")) {
	        return true;
	    } else {
	        return false;
	    }
	}
	
	// Cria uma copia a partir de uma conta existente
	public Conta clonar() throws Exception {
		Conta novaConta = new Conta(this.numero, this.cpf);
		novaConta.creditar(this.saldo);
		
		return novaConta;
	}
	
	public void salvar() throws Exception { // A ser implementado
		// Método para salvar num arquivo .txt o histórico de transações de uma conta (extrato bancário)
		// Os nomes dos arquivos estão associados aos números das contas 
	}
	
	public void carregar() throws Exception { // A ser implementado
		// Método para ler um arquivo existente
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

	public String getSaldo() {
		return String.format("%.2f", this.saldo);
	}

	@Override
	public String toString() {
		return 	"Extrato do dia " + java.time.LocalDate.now() +
				"\n------------------------ " +
				"\nNúmero da conta = " + numero +
				"\nCPF do titular = " + cpf +
				"\nSaldo = R$ " + saldo;
	}
}
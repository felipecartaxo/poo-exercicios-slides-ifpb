package partida;

public class Main {
	private String nomeTime;
	private int quantGols;
	
	// O construtor pode ser melhorado para aceitar o nome dos times
	// Mas como no exemplo dos slides o propósito é setar ícones no swing, optei por manter do jeito que está
	public Main() {
		
		// Todo time começará com 0 gols
		this.quantGols = 0;
	}
	
	// Marca um gol
	public void marcarGol() {
		if (this.fimDePartida()) {
			return;
		}
		
		this.quantGols ++;
	}
	
	// Reinicia a partida
	public void reiniciarPartida() {
		this.quantGols = 0;
	}
	
	// Pela nossa regra de negócio, o time que marcar 5 gols vence a partida e mesma só contabilizará gols novamente se for reiniciada
	public boolean fimDePartida() {
		return this.quantGols >= 5;
	}
	
	// Getters e Setters
	public String getNomeTime() {
		return nomeTime;
	}

	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}

	public int getQuantGols() {
		return quantGols;
	}

	public void setQuantGols(int quantGols) {
		this.quantGols = quantGols;
	}
	
	// ToString
	@Override
	public String toString() {
		return "PartidaFutebol [nomeTime=" + nomeTime + ", quantGols=" + quantGols + "]";
	}
}
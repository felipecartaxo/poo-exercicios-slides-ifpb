public class Venda {
    private String data;
    private String nome;
    private int quant;
    private double valor;

    public Venda(String data, Produto produto, int quant) {
        this.data = data;
        this.nome = produto.getNome();
        this.quant = quant;

        this.valor = this.quant * produto.getPreco();
        produto.setEstoque(produto.getEstoque() - this.quant);
    }
        
    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double valor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuant() {
        return quant;
    }

    @Override
	public String toString() {
		return "Venda [data=" + data + ", nome=" + nome + ", quantidade=" + quant + ", valor=" + valor + "]";
	}
}
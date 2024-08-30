import java.util.Scanner;

public class LojaDeConveniencia {
	private String name;
	private int folga;
	private double pagar;
	private double saldo;
	private double depositar;
	private String funcao;
	private long cpf;
	private double precos;
	private String produtos;
	private String estoque;
	private String comprando;

	Scanner sc = new Scanner(System.in);

	public LojaDeConveniencia() {
		// Construtor padrão
	}

	public LojaDeConveniencia(String name, String funcao, long cpf) {
		this.name = name;
		this.funcao = funcao;
		this.cpf = cpf;
	}

	public LojaDeConveniencia(String produtos, double precos) {
		this.produtos = produtos;
		this.precos = precos;
	}

	// SETTERS
	public void setName(String name) {
		this.name = name;
	}

	public void setPreco(double precos) {
		this.precos = precos;
	}

	public void setComprando(String comprando) {
		this.comprando = comprando;
	}

	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}

	public void setEstoque(String estoque) {
		this.estoque = estoque;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public void setPagar(double pagar) {
		this.pagar = pagar;
	}

	public void setDepositar(double depositar) {
		this.depositar = depositar;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setFolga(int folga) {
		this.folga = folga;
	}

	// GETTERS
	public String getName() {
		return name;
	}

	public String getFuncao() {
		return funcao;
	}

	public long getCpf() {
		return cpf;
	}

	public String getEstoque() {
		return estoque;
	}

	public String getComprando() {
		return comprando;
	}

	public String getProdutos() {
		return produtos;
	}

	public double getPreco() {
		return precos;
	}

	public double getPagar() {
		return pagar;
	}

	public double getDepositar() {
		return depositar;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getFolga() {
		return folga;
	}

	public void consultarSaldo() {
		System.out.println("SALDO DISPONÍVEL: R$" + getSaldo());
	}

	public void consultarEstoque() {
		System.out.println("PRODUTOS EM ESTOQUE:");
		System.out.println(getEstoque());
	}

	public void fazerDeposito() {
		System.out.print("DIGITE O VALOR A DEPOSITAR: ");
		setDepositar(sc.nextDouble());
		saldo += getDepositar();
		System.out.println("NOVO SALDO: R$" + getSaldo());
	}
}

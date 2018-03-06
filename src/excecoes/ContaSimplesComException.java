package excecoes;
/**
 * Esta eh a implementacao simplificada de uma classe de conta bancaria.
 * Inspirado em codigo do prof. Jacques Sauve.
 * @author Livia
 *
 */
public class ContaSimplesComException {
	private String nome;
	private String cpf;
	private int numero;
	private double saldo;
	
	public ContaSimplesComException(String nome, String cpf, int numero){
		if(nome == null || cpf == null){
			throw new NullPointerException();
		}
		this.nome = nome;
		this.cpf = cpf;
		this.numero = numero;
		saldo = 0.0;
	}
	
	public String getCpf() {
		return cpf;
	}

	//deveria ter o mesmo comportamento do construtor quanto a excecoes
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumero() {
		return numero;
	}

	public String getNome(){
		return nome.toUpperCase();
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	//deveria ter o mesmo comportamento do construtor quanto a excecoes
	public void setNome(String novoNome){
		nome = novoNome;
	}
	
	public void depositar(double valor){
		if(valor > 0 ){
			saldo += valor;
		}
	}
	
	public boolean sacar(double valor){
		if(valor < 0){
			throw new ValorNegativoException("Valor de saque negativo!");
		}
		if(valor > saldo){
			return false;
		}
		saldo -= valor;
		return true;
	}
	
	public void transferir(ContaSimplesComException nova, double valor){
		nova.sacar(valor);
		depositar(valor);
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " saldo: " + getSaldo() + " num: " + getNumero();
	}

}

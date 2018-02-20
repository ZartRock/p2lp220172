package interfaces;


public class Produto {
	
	private final String VAZIO = "";
	private String nome;
	private double valor;
	
	public Produto(String nome, double valor) {
		checaNome(nome);
		checaValor(valor);
		this.nome = nome;
		this.valor = valor;		
	}
	
	private void checaNome(String nome){
		if(nome.equals(VAZIO)){
			throw new IllegalArgumentException("nome vazio invalido!");
		}
	}
	
	private void checaValor(double valor){
		if(valor <= 0){
			throw new IllegalArgumentException("valor negativo invalido!");
		}
	}
	public String getNome() { 	return nome; 	}
	public void setNome(String nome) { 	checaNome(nome); this.nome = nome; }
	
	public double getValor() { return valor; }
	public void setValor(double valor) { checaValor(valor); this.valor = valor; }
	
	@Override
	public String toString() { return "Nome: " + nome + "| Valor: " + valor; }
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Produto))
			return false;
		Produto outro = (Produto) obj;
		return getNome().equals(outro.getNome()) && getValor() == outro.getValor();
	}

}

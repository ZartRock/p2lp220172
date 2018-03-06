package excecoes;

import classes.Assento;

/* 
 * Introduzindo exceções
 * 
 * Por: Lívia Sampaio Campos
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
public class BicicletaComExcecao{
	protected double velocidadeAtual;
	private double velocidadeMaxima;
	private String modelo;
	private Assento assento;

	
	public BicicletaComExcecao(double velocidadeMaxima, String modelo, Assento assento) throws Exception{
		checaExcecaoObjetoNulo(modelo);
		checaExcecaoObjetoNulo(assento);
		//ou poderia ter feito assim
		/*if(modelo == null || assento == null){
			throw new NullPointerException("modelo ou assento nulos em bicicleta!");
		}*/
		
		if(modelo.equals("")){
			throw new IllegalArgumentException();
			//throw new Exception("mmm");
		}
		
		velocidadeAtual = 0;
		this.velocidadeMaxima = velocidadeMaxima;
		this.modelo = modelo;
		this.assento = assento;
	}
	
	public BicicletaComExcecao(double velocidadeMaxima, String modelo) throws Exception{
		this(velocidadeMaxima, modelo, new Assento("espuma", 125));
	}
	
	public String getAssento(){
		return assento.toString();
	}

	public double getVelocidadeMaxima(){
		return velocidadeMaxima;
	}

	public double getVelocidadeAtual(){
		return velocidadeAtual;
	}

	public String getModelo() {
		return modelo;
	}

	public void setAssento(Assento novo){
		//note que aqui tambem nao queremos assento nulos!
		checaExcecaoObjetoNulo(novo);
		assento = novo;

	}

	private void checaExcecaoObjetoNulo(Object obj){
		if(obj == null){
			throw new NullPointerException("Referencia null!");
		}
	}
	public void acelera() {
		velocidadeAtual = (velocidadeAtual + 2 > getVelocidadeMaxima()) ? getVelocidadeMaxima() : velocidadeAtual + 2;
	}
	public void desacelera() {
		velocidadeAtual = (velocidadeAtual - 2 < 0) ? 0 : velocidadeAtual - 2;
	}

	public void para(){
		velocidadeAtual = 0;
	}
	
	@Override
	public String toString() {
		return "Super bike " + getModelo();
	}
	
	@Override
	public boolean equals(Object b2){
		if(!(b2 instanceof BicicletaComExcecao)){
			return false;
		}
		BicicletaComExcecao b3 = (BicicletaComExcecao) b2;
		return this.getModelo().equals(b3.getModelo()) &&
				this.getAssento().equals(b3.getAssento());
	}
	public static void main(String[] args) {
		try{
		
			BicicletaComExcecao b = new BicicletaComExcecao(200, "xx");
		}catch(Exception e){
			
		}
	}

}

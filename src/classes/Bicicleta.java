package classes;

/* 
 * Mais objetos
 * 
 * Por: Lívia Sampaio Campos
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
public class Bicicleta{
	protected double velocidadeAtual;
	private double velocidadeMaxima;
	private String modelo;
	private Assento assento;

	
	public Bicicleta(double velocidadeMaxima, String modelo, Assento assento){	
		velocidadeAtual = 0;
		this.velocidadeMaxima = velocidadeMaxima;
		this.modelo = modelo;
		this.assento = assento;
	}
	
	public Bicicleta(double velocidadeMaxima, String modelo) {
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
		assento = novo;

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
	
	public boolean temConforto(double larguraQuadril){
		return assento.temConforto(larguraQuadril);
	}
	
	@Override
	public String toString() {
		return "Super bike " + getModelo();
	}
	
	@Override
	public boolean equals(Object b2){
		if(!(b2 instanceof Bicicleta)){
			return false;
		}
		Bicicleta b3 = (Bicicleta) b2;
		return this.getModelo().equals(b3.getModelo()) &&
				this.getAssento().equals(b3.getAssento());
	}

}

package interfaces;

public class PratoRetangular extends PratoPersonalizado {
	
	private double base;
	private double altura;
	
	public PratoRetangular(double precoBase, Personalizacao personalizacao, double base, double altura) {
		this(precoBase, personalizacao, base, altura, "");
	}

	public PratoRetangular(double precoBase, Personalizacao personalizacao, double base, double altura, String autor) {
		super(precoBase, personalizacao, autor);
		this.base = base;
		this.altura = altura;
	}
	@Override
	public String toString() {
		return super.toString()+" Formato retangular.";
	}
	
	public double getAreaTotal() {
		return base*altura;
	}
}

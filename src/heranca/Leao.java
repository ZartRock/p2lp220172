package heranca;

public class Leao extends Animal{

	public Leao(String nome, TipoDeComida t) {
		super(nome, t);
	}
	
	@Override
	public String comer() {
		nivelDeFome = nivelDeFome/2;
		return "Leao comendo";
	}

}

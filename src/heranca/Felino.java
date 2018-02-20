package heranca;

public class Felino extends Animal{

	public Felino(String nome, TipoDeComida t) {
		super(nome, t);
	}
	
	public String andar(){
		return "Felino andando";
	}

}

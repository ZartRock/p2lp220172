package heranca;

import interfaces.AnimalEstimacao;

public class Gato extends Felino implements AnimalEstimacao{

	public Gato(String nome, TipoDeComida tipo) {
		super(nome, tipo);
	}

	@Override
	public String serAmigavel() {
		return "gato sendo amigavel";
		
	}

	@Override
	public String brincar() {
		return "gato brincando...";
		
	}
}

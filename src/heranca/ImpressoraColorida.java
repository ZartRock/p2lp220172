package heranca;

public class ImpressoraColorida extends Impressora{

	public ImpressoraColorida(String modelo, String fabricante, int id) {
		super(modelo, fabricante, id);
	}
	
	@Override
	public void calculaGastoTinta(int ciano, int amarelo, int magenta, int preto) {
		gastoTinta += (ciano+amarelo+magenta+preto);	
	}
	
	@Override
	public String toString() {
		return "COLORIDA " + super.toString();
	}

}

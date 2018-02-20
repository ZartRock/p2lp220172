package heranca;

public class ImpressoraPreto extends Impressora{
	
	public ImpressoraPreto(String modelo, String fabricante, int id) {
		super(modelo, fabricante, id);
	}
	
	@Override
	public void calculaGastoTinta(int ciano, int amarelo, int magenta, int preto) {
		double media = (ciano+amarelo+magenta)/3 +preto;
		gastoTinta += media;	
	}
	
	@Override
	public String toString() {
		return "PRETO " + super.toString();
	}

}

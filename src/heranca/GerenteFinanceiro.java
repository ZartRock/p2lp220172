package heranca;

import java.io.Serializable;
import java.util.ArrayList;

public class GerenteFinanceiro implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Empregado> contas = new ArrayList<>();
	
	public void cadastraConta(Empregado f){
		contas.add(f);
	}
	
	public double calculaGastoTotal(){
		
		double total = 0;
		
		for (Empregado conta : contas) {
			total += conta.calculaPagamento();
		}
		
		return total;
	}
	
	public String geraFolhaPagamento() {
		String resultado = "";
		for (Empregado conta : contas) {
			//getNome() chamada polimorfica
			//calculaPagamento chamada polimorfica
			String folhaPagamento = conta.getNome() + " " + conta.calculaPagamento();
			resultado += folhaPagamento + "\n";
		}
		return resultado;
	}


}

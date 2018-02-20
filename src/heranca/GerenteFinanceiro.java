package heranca;

import java.util.ArrayList;

public class GerenteFinanceiro {
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

	public static void main(String[] args) {
		GerenteFinanceiro p2t1sa = new GerenteFinanceiro();
		Horista zezinho = new Horista("Zezinho da Disney", "123", 1);
		Assalariado huguinho = new Assalariado("Huguinho da Disney", "234", 2, 880);
		zezinho.setHorasTrabalhadas(10);
		zezinho.setPrecoPorHora(10);
		huguinho.setQtdDependentes(2);
		p2t1sa.cadastraConta(zezinho);
		p2t1sa.cadastraConta(huguinho);
		
		System.out.println("Gasto total: " + p2t1sa.calculaGastoTotal());
		
		//gera folha de pagamento e imprime
		System.out.println(p2t1sa.geraFolhaPagamento());
		
		
	}

}

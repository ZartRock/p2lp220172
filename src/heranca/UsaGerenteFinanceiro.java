package heranca;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import java.util.Scanner;

import arquivos.GerenteArquivo;
import utils.LeituraDeDados;

public class UsaGerenteFinanceiro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		GerenteFinanceiro p2t1sa = iniciarSistema();
		if(p2t1sa == null){
			System.out.println("Erro inesperado na abertura do arquivo dos dados");
			System.exit(1);
		}
		imprimeFolhaPagamento(p2t1sa);
		
		cadastroHorista(p2t1sa);
		cadastroAssalariado(p2t1sa);
		
		imprimeFolhaPagamento(p2t1sa);
		
		//gera folha de pagamento no arquivo
		Instant hoje = Instant.now();
		String gasto = hoje.toString() + " " + p2t1sa.calculaGastoTotal();
		salvar(gasto, "arq1.txt");
		String resultado = ler("arq1.txt");
		System.out.println("Gastos agora: \n " + resultado);
		fecharSistema(p2t1sa);
		
		
	}

	private static void cadastroHorista(GerenteFinanceiro p2t1sa) {
		System.out.println("Cadastrando horista...");
		String nome = LeituraDeDados.leLinha("Nome: ");
		String cpf = LeituraDeDados.leLinha("cpf: ");
		int matricula = LeituraDeDados.leIntPositivo("Matricula: ");
		Horista empregado = new Horista(nome, cpf, matricula);
		double precoHora = LeituraDeDados.leDouble("Preco da hora: ");
		int qtdHoras = LeituraDeDados.leIntPositivo("Quantidade de horas trabalhadas: ");
		empregado.setHorasTrabalhadas(qtdHoras);
		empregado.setPrecoPorHora(precoHora);
		p2t1sa.cadastraConta(empregado);
	}
	
	private static void cadastroAssalariado(GerenteFinanceiro p2t1sa) {
		System.out.println("Cadastrando assalariado...");
		String nome = LeituraDeDados.leLinha("Nome: ");
		String cpf = LeituraDeDados.leLinha("cpf: ");
		int matricula = LeituraDeDados.leIntPositivo("Matricula: ");
		double salarioBase = LeituraDeDados.leDouble("SalarioBase: ");
		Assalariado empregado = new Assalariado(nome, cpf, matricula, salarioBase);
		int qtdDependentes = LeituraDeDados.leIntPositivo("Quantidade de dependentes: ");
		empregado.setQtdDependentes(qtdDependentes);
		p2t1sa.cadastraConta(empregado);
	}

	private static void imprimeFolhaPagamento(GerenteFinanceiro g){
		System.out.println("Folha de pagamento... \n" + g.geraFolhaPagamento());
	}
	
	private static GerenteFinanceiro iniciarSistema(){
		GerenteFinanceiro g = null;
		try{
			g = (GerenteFinanceiro) GerenteArquivo.lerObjetos("financeiro.bin");
		}catch(FileNotFoundException e){
			g = new GerenteFinanceiro();
		}catch(ClassNotFoundException | IOException e){
			System.out.println(e.getMessage());
			
		}
		return g;
	}

	private static void fecharSistema(Object obj){
		try{
			GerenteArquivo.salvarObjeto(obj, "financeiro.bin");
		}catch(IOException e){
			System.out.println("excecao de fechamento ");
			e.printStackTrace();
			
		}
	}
	private static void salvar(String saida, String nomeArquivo) {
		try{
			GerenteArquivo.salvarAppend(saida, nomeArquivo);
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		
	}
	
	private static String ler(String nomeArquivo) {
		String resultado = "";
		try{
			resultado = GerenteArquivo.ler(nomeArquivo);
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		return resultado;
	}

}

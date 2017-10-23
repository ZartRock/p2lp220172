package javabasico;

import java.util.Scanner;

public class DiarioDeBordoP2 {

	public static void main(String[] args) {
		if(args.length != 1){
			System.out.println("Uso correto: DiarioDeBordoP2 <tam_diario>");
			System.exit(1);
		}
		int entrada = Integer.parseInt(args[0]);
		String[] datas = new String[entrada];
		String[] textos = new String[entrada];
		Scanner sc = new Scanner(System.in);
		final String MENU = "1- adicionar anotacao;\n"+
							"2- pesquisar i-esima anotacao;\n"+
							"3- listar anotacoes;\n"+
							"4- sair";
		final int ANOTAR = 1;
		final int PESQUISAR = 2;
		final int LISTAR = 3;
		final int SAIR = 4;
		
		int op;
		int qtdEntradas = 0;
		//manipular diario
		do{
			op = leInt(MENU, sc);
			switch(op){
			case ANOTAR:
				anotar(textos, datas, qtdEntradas, sc);
				break;
			case PESQUISAR:
				int i = leInt("Qual anotacao quer ver: ", sc);
				System.out.println(datas[i] + "-" + " " + textos[i]);
				break;
			case LISTAR:
				for (int j = 0; j < qtdEntradas; j++) {
					System.out.println(datas[j] + "-" + " " + textos[j]);
				}
				break;
			case SAIR:
				break;
			default:
				System.out.println("Opcao invalida!");
			}
		}while(qtdEntradas != textos.length && op != SAIR);
		sc.close();	
	}//main
	
	private static void anotar(String[] textos, String[] datas, int qtdEntradas, Scanner sc) {
		System.out.println("Data: ");
		datas[qtdEntradas] = sc.nextLine();
		System.out.println("Texto: ");
		textos[qtdEntradas++] = sc.nextLine();
	}

	private static int leInt(String msg, Scanner input){
		System.out.println(msg);
		int op = input.nextInt();
		input.nextLine();
		return op;
	}
}

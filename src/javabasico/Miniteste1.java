package javabasico;

import java.util.Scanner;

public class Miniteste1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = leLinha("Informe a frase: ");
		String palavra = lePalavra("Informe a palavra: ");
		int ocorrencias = contaOcorrencias(frase, palavra);
		System.out.println(frase);
		System.out.printf("Houveram %d ocorrencias da palavra %s na frase", ocorrencias, palavra);
		sc.close();
	
	}

	private static int contaOcorrencias(String frase, String palavra) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static String lePalavra(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String leLinha(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}

package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcecoesDeJava {

	public static void main(String[] args) {
		//exemploNullPointerException(null);
		exemploIndexOutOfBoundException();
		exemploInputMismatchException();
		exemplo2InputMismatchException();
		
	}
	
	private static void exemplo2InputMismatchException() {
		//outra forma de evitar a excecao InputMismatchException
		Scanner sc = new Scanner(System.in);
		while(!sc.hasNextInt()){
			sc.next();
			System.err.println("Vc deve digitar um inteiro, cara!");
		}
		int valor2 = sc.nextInt();
		System.out.println("Valor2: " + valor2);
		sc.close();
		
	}

	private static void exemploInputMismatchException() {
		Scanner sc = new Scanner(System.in);
		int valor = 0;
		boolean deuCerto = false;
		while(!deuCerto){
			try{
				valor = sc.nextInt();
				deuCerto = true;
			}catch(InputMismatchException e){
				System.err.println(valor + " Vc deve digitar um inteiro");
				System.out.println("livia");
			}
		}
		System.out.println("Valor: " + valor);
		sc.close();
		
	}

	private static void exemploIndexOutOfBoundException() {
		int[] valores = {1, 2, 3};
		for (int i = 0; i < 3; i++) {
			System.out.println(valores[i]);
		}
		
	}

	private static void exemploNullPointerException(String nome){
		System.out.println(nome.toString());
	}

}

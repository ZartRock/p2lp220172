package excecoes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainContaSimplesComException {

	public static void main(String[] args){
		ContaSimplesComException c = new ContaSimplesComException("livia", "1", 1);
		ContaSimplesComException c2 = new ContaSimplesComException("livia", "1", 1);
		ContaSimplesComException c3 = new ContaSimplesComException("livia", "1", 2);
		if(c.equals(c3)){
			System.out.println("Sao iguais!");
		}else{
			System.out.println("Nao sao iguais!");
		}
		
		//chamaCodigoComExcecaoPadrao();
		//chamaCodigoComExcecaoPadrao2();
		//chamaCodigoComExcecaoPadrao3();
		try{
			chamaCodigoComExcecaoNaoPadrao();
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		
	}

	private static void chamaCodigoComExcecaoNaoPadrao() throws FileNotFoundException{
		Scanner sc = new Scanner(new FileInputStream("teste.txt"));
		sc.close();
	}

	private static void chamaCodigoComExcecaoPadrao() {
		try{
			ContaSimplesComException c = new ContaSimplesComException(null, "123", 1);
		}catch(NullPointerException e){
			System.out.println(e.getMessage());
		}	
	}
	
	private static void chamaCodigoComExcecaoPadrao2() {
		String nome = "livia";
		ContaSimplesComException c;
		if(nome != null){
		 c = new ContaSimplesComException(nome, "123", 1);
		 System.out.println(c);
		}else{
			System.out.println("Informe outro nome valido!");
		}
	}
	
	private static void chamaCodigoComExcecaoPadrao3() {
		ContaSimplesComException c = new ContaSimplesComException("livia", "123", 1);
		c.transferir(null, 500);
	}

}

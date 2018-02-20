package heranca;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class UsaEmpregado {

	public static void main(String[] args) {
		Horista h1 = new Horista("Livia", "123", 1);
		System.out.println(h1.getCpf());
		System.out.println("h1: " + h1);
		Horista h2 = new Horista("LiviaM", "123", 2);
		System.out.println("h2: " + h2);
		System.out.println(h1.equals(h2));
		//System.out.println(geraExtrato(h1));
		Assalariado a1 = new Assalariado("temer", "12345", 3, 957);
		//System.out.println(geraExtrato(a1));
		
		System.out.println(geraExtratoG(h1));
		System.out.println(geraExtratoG(a1));
		
		ArrayList<Empregado> lista = new ArrayList<>();
		lista.add(a1);
		lista.add(h1);
		
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);
		
	}
	
/*	private static String geraExtrato(Horista h){
		LocalDate hoje = LocalDate.now();
		return hoje.toString() + " " + h.getNome() + " " + h.calculaPagamento();
	}
	
	private static String geraExtrato(Assalariado a){
		LocalDate hoje = LocalDate.now();
		return hoje.toString() + " " + a.getNome() + " " + a.calculaPagamento();
	}*/

	private static String geraExtratoG(Empregado e){
		System.out.println("Contra-cheque...");
		LocalDate hoje = LocalDate.now();
		return hoje.toString() + " " + e.getNome() + " " + e.calculaPagamento();
	}
}


package interfaces;

import java.util.Comparator;

public class mainEstoque {

	public static void main(String[] args) {
		EstoquePratos estoque = new EstoquePratos();
		
		//uma abordagem de strategy usando argumentos de métodos
		PratoPersonalizado p1 = estoque.criaPratoRetangular(5, "Estampa", 12, 6, "ana");
		PratoPersonalizado p2 = estoque.criaPratoRetangular(5, "Pintura", 10, 6, "mike");
		PratoPersonalizado p3 = estoque.criaPratoCircular(8, "Foto", 5, "brunnna");
		estoque.adicionaPrato(p1);
		estoque.adicionaPrato(p2);
		estoque.adicionaPrato(p3);
		System.out.println(estoque);
		System.out.println(estoque.getPratosOrdenados());
		System.out.println(estoque);
		Comparator<PratoPersonalizado> c = new EstrategiaPorPersonalizacao();
		System.out.println(estoque.getPratosOrdenados(c));
		
		//uma outra abordagem usando composicao+interfaces
		System.out.println(estoque.getPratosOrdenadosEspecial());//por personalizacao
		//muda a estrategia
		estoque.setComparator(new EstrategiaPorAutor());
		System.out.println(estoque.getPratosOrdenadosEspecial()); //por autor
	}

}

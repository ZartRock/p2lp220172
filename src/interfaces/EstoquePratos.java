package interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EstoquePratos {

	private List<PratoPersonalizado> pratos;
	private Comparator<PratoPersonalizado> c;
	
	public EstoquePratos(){
		pratos = new ArrayList<>();
		c = new EstrategiaPorPersonalizacao();
	}
	
	public void setComparator(Comparator<PratoPersonalizado> novo){
		c = novo;
	}
	
	public PratoPersonalizado criaPratoRetangular(double precoBase, String personalizacaoStr, double base, double altura, String autor) {
		Personalizacao personalizacao = criarPersonalizacao(personalizacaoStr);
		return new PratoRetangular(precoBase, personalizacao, base, altura, autor);
	}

	public PratoPersonalizado criaPratoTriangular(double precoBase, String personalizacaoStr, double base, double altura, String autor) {
		Personalizacao personalizacao = criarPersonalizacao(personalizacaoStr);
		return new PratoTriangular(precoBase, personalizacao, base, altura, autor);
	}

	public PratoPersonalizado criaPratoCircular(double precoBase, String personalizacaoStr, double raio, String autor) {
		Personalizacao personalizacao = criarPersonalizacao(personalizacaoStr);
		return new PratoCircular(precoBase, personalizacao, raio, autor);
	}

	private Personalizacao criarPersonalizacao(String personalizacaoStr)  {
		Personalizacao personalizacao;
		if(personalizacaoStr.equals("Estampa")){
			personalizacao = Personalizacao.ESTAMPA;
		}else if(personalizacaoStr.equals("Pintura")){
			personalizacao = Personalizacao.PINTURA;
		}else if(personalizacaoStr.equals("Foto")){
			personalizacao = Personalizacao.FOTO;
		}else{
			throw new IllegalArgumentException("Personalizacao invalid. Por favor, escolha outra opcao.");
		}
		return personalizacao;
	}

	public double calculaLucroTotal() {
		double lucroTotal = 0.0;
		for(PratoPersonalizado prato : pratos){
			lucroTotal += prato.calculaPrecoFinal();
		}
		return lucroTotal;
	}

	public boolean adicionaPrato(PratoPersonalizado pratoRetangular) {
		this.pratos.add(pratoRetangular);
		return true;
	}

	public int getQtdPratos() {
		return this.pratos.size();
	}
	
	public boolean removePrato(PratoPersonalizado prato){
		return this.pratos.remove(prato);
	}

	public List<PratoPersonalizado> getPratosOrdenados() {
		List<PratoPersonalizado> copia = new ArrayList<>(this.pratos);
		Collections.sort(copia);
		return copia;
	}
	
	public List<PratoPersonalizado> getPratosOrdenados(Comparator<PratoPersonalizado> c) {
		List<PratoPersonalizado> copia = new ArrayList<>(this.pratos);
		Collections.sort(copia, c);
		return copia;
	}
	
	public List<PratoPersonalizado> getPratosOrdenadosEspecial() {
		List<PratoPersonalizado> copia = new ArrayList<>(this.pratos);
		Collections.sort(copia, c);
		return copia;
	}
	
	@Override
	public String toString() {
		return pratos.toString();
	}
}

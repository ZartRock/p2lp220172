package classes;

public class Assento {

	private int tamanhoAssento; //mm
	private String descricaoAssento;
	
	public Assento(String descricao, int tamanho) {
		descricaoAssento = descricao;
		tamanhoAssento = tamanho;
	}
	
	public int getTamanhoAssento(){
		return tamanhoAssento;
	}
	
	public String getDescricaoAssento(){
		return descricaoAssento;
	}

	public void setTamanhoAssento(int tamanhoAssento) {
		this.tamanhoAssento = tamanhoAssento;
	}

	public void setDescricaoAssento(String descricaoAssento) {
		this.descricaoAssento = descricaoAssento;
	}
	
	public boolean temConforto(double larguraQuadril){
		return (tamanhoAssento - larguraQuadril) < 10;
	}
	@Override
	public String toString() {
		return "Descricao: " + getDescricaoAssento() + " Tamanho: " + getTamanhoAssento(); 
	}

}

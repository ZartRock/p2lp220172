package heranca;

public class Animal {
	private String nome;
	protected int nivelDeFome;
	private TipoDeComida comida;
	private String foto;
	private Ponto localizacao;
	private Dimensao fronteira;
	
	public Animal(String nome, TipoDeComida comida){
		this.nome = nome;
		this.comida = comida;
		this.foto = "padrao.txt";
		this.localizacao = new Ponto(0,0);
		this.fronteira = new Dimensao(640, 480);
	}
	
	public Ponto getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Ponto localizacao) {
		this.localizacao = localizacao;
	}

	public Dimensao getFronteira() {
		return fronteira;
	}

	public void setFronteira(Dimensao fronteira) {
		this.fronteira = fronteira;
	}

	public String getNome() {
		return nome;
	}

	public int getNivelDeFome() {
		return nivelDeFome;
	}

	public TipoDeComida getComida() {
		return comida;
	}

	public String getFoto() {
		return foto;
	}
	
	public void setFoto(String foto) {
		this.foto = foto;
	}

	public void fome(){
		nivelDeFome++;
	}
	
	public String comer(){
		nivelDeFome = 0;
		return "Animal comendo";
	}
	
	public String andar(){
		return "Animal andando";
	}
	
	public String falar(){
		return "Animal falando";
	}
	
	@Override
	public String toString() {
		return getNome() + " " + getFoto();
	}

}

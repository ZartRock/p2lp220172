package classes;
/* Aulas sobre o modulo de Criacao de Classes e Uso de Objetos
 * Por: Lívia Sampaio Campos
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
import java.time.LocalDate;

public class Pessoa {
	//atributos
	private String prioridade; //DEFICIENTE, GRAVIDA, COLO, IDOSO
	private int anoNascimento;
	private String nome;
	
	//construtor
	public Pessoa(int nascimento, String prioridade, String nome){
		anoNascimento = nascimento;
		this.nome = nome;
		this.prioridade = prioridade;
	}
	
	public Pessoa(String nome, int nascimento){
		this(nascimento, "", nome);
	}
	
	public int getAnoNascimento(){
		return anoNascimento;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getPrioridade(){
		return prioridade;
	}
	
	public void setPrioridade(String novo) {
		this.prioridade = novo.toUpperCase();
	}

	public void setNome(String novoNome){
		nome = novoNome;
	}
	
	public int calculaIdade(){
		LocalDate hoje = LocalDate.now(); 
		int anoAtual = hoje.getYear();
		int idade = anoAtual - getAnoNascimento();
		if(idade >= 60){
			setPrioridade("IDOSO");
		}
		return idade;
	}
	
	//metodos
	public String situacaoPreferencial(){
		if(prioridade.equals("")){
			return "Voce nao tem direito ao atendimento preferencial";
		}else {
			return prioridade;
		}
	}

	public String isPreferencial() {
		return prioridade.equals("") ? "NAO": "SIM";
	}

	@Override
	public String toString(){
		return "Nome: " + getNome() + 
				" Idade: " + calculaIdade()+
				" Eh preferencial: " + isPreferencial() ;
	}


}

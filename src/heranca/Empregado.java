package heranca;

import java.io.Serializable;

public abstract class Empregado implements Comparable<Empregado>, Serializable{
	private String cpf;
	private int matricula;
	private String nome;
	
	public Empregado(String nome, String cpf, int matricula) {
		this.cpf = cpf;
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}
	
	public abstract double calculaPagamento();
	
	@Override
	public String toString() {
		return getNome() + " " + getCpf();
	}
	
	@Override
	public boolean equals(Object arg0) {
		if(!(arg0 instanceof Empregado)){
			return false;
		}
		Empregado f = (Empregado) arg0;
		return getCpf().equals(f.getCpf());
	}
	
	@Override
	public int compareTo(Empregado e){
		return getNome().compareTo(e.getNome());
	}

}


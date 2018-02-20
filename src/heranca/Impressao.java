package heranca;

public class Impressao {
	private String horario;
	private double gastoTinta;
	private int idImpressora;
	
	public Impressao(String horario, int idImpressora, double gastoTinta){
		this.horario = horario;
		this.idImpressora = idImpressora;
		this.gastoTinta = gastoTinta;
	}

	public String getData() {
		return horario;
	}

	public double getGastoTinta() {
		return gastoTinta;
	}

	public int getIdImpressora() {
		return idImpressora;
	}
	
	@Override
	public String toString() {
		return getData() + " " + getIdImpressora() + " " + getGastoTinta();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((horario == null) ? 0 : horario.hashCode());
		result = prime * result + idImpressora;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Impressao other = (Impressao) obj;
		if (horario == null) {
			if (other.horario != null)
				return false;
		} else if (!horario.equals(other.horario))
			return false;
		if (idImpressora != other.idImpressora)
			return false;
		return true;
	}
	
	
	
	

}

package heranca;

public abstract class Impressora implements Comparable<Impressora>{
	private String modelo, fabricante;
	private int id;
	protected double gastoTinta;
	
	public Impressora(String modelo, String fabricante, int id){
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.id = id;
		gastoTinta = 0;
	}

	public String getModelo() {
		return modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public int getId() {
		return id;
	}

	public double getGastoTinta() {
		return gastoTinta;
	}
	
	public abstract void calculaGastoTinta(int ciano, int amarelo, int magenta, int preto);
	
	@Override
	public String toString() {
		return getFabricante() + "-" + getModelo();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fabricante == null) ? 0 : fabricante.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
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
		Impressora other = (Impressora) obj;
		if (fabricante == null) {
			if (other.fabricante != null)
				return false;
		} else if (!fabricante.equals(other.fabricante))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Impressora obj) {
		return getModelo().compareTo(obj.getModelo());
	}
	

}

package classes;

public class MainBicicleta {

	public static void main(String[] args) {
		Assento a1 = new Assento("gel", 120);
		Bicicleta b1 = new Bicicleta(10, "Caloi", a1);
		Bicicleta b2 = new Bicicleta(10, "Caloi");
		System.out.println(b1);
		Assento a2 = new Assento("espuma", 3);
		b1.setAssento(a2);
		System.out.println(b1.getAssento());
		System.out.println(b2);
	}
}

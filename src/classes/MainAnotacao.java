package classes;

public class MainAnotacao {

	public static void main(String[] args) {
		Anotacao a1 = new Anotacao("aprendendo criacao de classes e uso de objetos", "25/10/2017");
		
		System.out.println(a1.getData() + "- " + a1.getTexto());
		Anotacao a2 = new Anotacao("aprendendo criacao de classes e uso de objetos", "27/10/2017");

		System.out.println(a2.representacaoStringDaAnotacao());
		a1.setTexto("muitas duvidas em CC e UO");
		
		System.out.println(a1.representacaoStringDaAnotacao());

		System.out.println(a2.representacaoStringDaAnotacao());

	}

}

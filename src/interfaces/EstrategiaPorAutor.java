package interfaces;

import java.util.Comparator;

public class EstrategiaPorAutor implements Comparator<PratoPersonalizado>{

	@Override
	public int compare(PratoPersonalizado obj1, PratoPersonalizado obj2) {
		return obj1.getAutor().compareTo(obj2.getAutor());
	}
}

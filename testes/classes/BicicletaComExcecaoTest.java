package classes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BicicletaComExcecaoTest {

	private Bicicleta b1;
	@Before
	public void setUp() {
		b1 = new Bicicleta(10, "caloi");
	}

	@Test
	public void testBicicletaComExcecao(){
		
		try{
			new Bicicleta(10, null);
			fail("Deveria ter ocorrido NullPointerException");
		}catch(NullPointerException e){
			assertEquals("modelo ou assento nulos em bicicleta!", e.getMessage());
		}
	}

	
	@Test (expected = NullPointerException.class)
	public void testBicicletaComExcecao2(){		
			new Bicicleta(10, null);
	}
	
	@Test (expected = NullPointerException.class)
	public void testSetAssento(){		
		b1.setAssento(null);
	}

}

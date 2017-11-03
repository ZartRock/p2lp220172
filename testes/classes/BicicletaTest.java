package classes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/* 
 * Começando com Testes de Unidade usando JUnit.
 * Aproveitamos o esqueleto gerado pelo Eclipse.
 * 
 * Por: Lívia Sampaio Campos
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
public class BicicletaTest {

	private Bicicleta b1;
	@Before
	public void setUp() {
		b1 = new Bicicleta(10, "caloi");
	}

	@Test
	public void testBicicletaDoubleStringAssento() {
	//prefiro ter um método somente para testar os construtores
		//b2
		Bicicleta b2 = new Bicicleta(10, "caloi", new Assento("gel", 120));
		assertEquals("Descricao: gel Tamanho: 120", b2.getAssento());
	}

	@Test
	public void testBicicletaDoubleString() {
		//b1
		Bicicleta b1 = new Bicicleta(10, "caloi");
		assertEquals(10, b1.getVelocidadeMaxima(), 0.000001);
		assertEquals("caloi", b1.getModelo());
		assertEquals("Descricao: espuma Tamanho: 125", b1.getAssento());
		assertEquals(0, b1.getVelocidadeAtual(), 0.000001);
	}

	@Test
	public void testAcelera() {
		//Bicicleta b1 = new Bicicleta(10, "caloi");
		b1.acelera();
		assertEquals(2, b1.getVelocidadeAtual(), 0.000001);
		b1.acelera();
		assertEquals(4, b1.getVelocidadeAtual(), 0.000001);

		for (int i = 0; i < 4; i++) {//veja que temos varios pontos fazendo acelera com for; poderia criar um metodo privado para isso
			b1.acelera();
		}
		assertEquals(10, b1.getVelocidadeAtual(), 0.000001);
		b1.acelera();
		assertEquals(10, b1.getVelocidadeAtual(), 0.000001);
	}

	@Test
	public void testDesacelera() {
		//Bicicleta b1 = new Bicicleta(10, "caloi");
		b1.desacelera();
		assertEquals(0, b1.getVelocidadeAtual(), 0.000001);
		
		//desacelera
		for (int i = 0; i < 5; i++) {
			b1.acelera();
		}
		assertEquals(10, b1.getVelocidadeAtual(), 0.000001);
		for (int i = 0; i < 4; i++) {
			b1.desacelera();
		}
		assertEquals(2, b1.getVelocidadeAtual(), 0.000001);
		b1.desacelera();
		assertEquals(0, b1.getVelocidadeAtual(), 0.000001);
	}

	@Test
	public void testPara() {
		//Bicicleta b1 = new Bicicleta(10, "caloi");
		//para
		for (int i = 0; i < 4; i++) {
			b1.acelera();
		}
		assertEquals(8, b1.getVelocidadeAtual(), 0.000001);
		b1.para();
		assertEquals(0, b1.getVelocidadeAtual(), 0.000001);
	}

	@Test
	public void testToString() {
		//Bicicleta b1 = new Bicicleta(10, "caloi");
		//toString
		assertEquals("Super bike caloi", b1.toString());
	}
	
	@Test
	public void testEquals(){
		assertTrue(b1.equals(b1));
		Bicicleta b2 = new Bicicleta(10, "caloi", new Assento("gel", 120));
		assertFalse(b1.equals(b2));
		Bicicleta b3 = new Bicicleta(10, "caloi", new Assento("espuma", 125));
		assertTrue(b1.equals(b3)); // aqui chama o equals que pode não ser o esperado por java
		assertEquals(b1, b3); //aqui chama o equals do jeito esperado por java
	}

}

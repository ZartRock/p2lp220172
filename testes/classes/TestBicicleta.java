package classes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/* 
 * Começando com Testes de Unidade usando JUnit.
 * Observe que o estilo pode melhorar. Ter modularização dos 
 * testes.
 * 
 * Por: Lívia Sampaio Campos
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
public class TestBicicleta {

/*
 * criar uma bicicleta1 com velocidadeMáxima de 10 e modelo caloi
 * testar se a velocidadeMáxima da bicicleta1 é 10
 * testar se o modelo da bicicleta1 é caloi
 * testar se o assento da bicicleta1 é o padrao com descricao espuma e tamanho 125
 * testar se a velocidade atual da bicicleta1 é 0
 * criar uma bicleta2 com velocidadeMáxima de 10 e modelo caloi e assento gel 120
 * testar se o assento da bicicleta2 é gel 120
 * acelerar bicicleta1 
 * testar se a velocidade atual da bicicleta1 é 2
 * acelerar bicicleta1
 * testar se a velocidade atual da bicicleta1 é 4
 * desacelerar bicicleta1 
 * testar se a velocidade atual da bicicleta1 é 2
 * acelerar bicicleta1 4 vezes
 * testar se a velocidade atual da bicicleta1 é 10
 * acelerar bicicleta1
 * testar se a velocidade atual da bicicleta1 é 10
 * desacelerar a bicicleta1 5 vezes 
 * testar se a velocidade atual da bicicleta1 é 0
 * desacelerar bicicleta1
 * testar se a velocidade atual da bicicleta1 é 0
 * acelerar bicicleta1 4 vezes
 * testar se a velocidade atual da bicicleta1 é 8
 * parar bibicleta1
 * testar se a velocidade atual da bicicleta1 é 0
 * testar se a representação textual da bicicleta1 é Super bike caloi
 */

	@Test
	public void testGeral(){
		//b1
		Bicicleta b1 = new Bicicleta(10, "caloi");
		assertEquals(10, b1.getVelocidadeMaxima(), 0.000001);
		assertEquals("caloi", b1.getModelo());
		assertEquals("Descricao: espuma Tamanho: 125", b1.getAssento());
		assertEquals(0, b1.getVelocidadeAtual(), 0.000001);
		
		//acelera
		b1.acelera();
		assertEquals(2, b1.getVelocidadeAtual(), 0.000001);
		b1.acelera();
		assertEquals(4, b1.getVelocidadeAtual(), 0.000001);
		b1.desacelera();
		assertEquals(2, b1.getVelocidadeAtual(), 0.000001);
		for (int i = 0; i < 4; i++) {
			b1.acelera();
		}
		assertEquals(10, b1.getVelocidadeAtual(), 0.000001);
		b1.acelera();
		assertEquals(10, b1.getVelocidadeAtual(), 0.000001);
		
		//desacelera
		for (int i = 0; i < 5; i++) {
			b1.desacelera();
		}
		assertEquals(0, b1.getVelocidadeAtual(), 0.000001);
		b1.desacelera();
		assertEquals(0, b1.getVelocidadeAtual(), 0.000001);
		
		//para
		for (int i = 0; i < 4; i++) {
			b1.acelera();
		}
		assertEquals(8, b1.getVelocidadeAtual(), 0.000001);
		b1.para();
		assertEquals(0, b1.getVelocidadeAtual(), 0.000001);
		
		//toString
		assertEquals("Super bike caloi", b1.toString());
		
		//b2
		Bicicleta b2 = new Bicicleta(10, "caloi", new Assento("gel", 120));
		assertEquals("Descricao: gel Tamanho: 120", b2.getAssento());
		
	}

}

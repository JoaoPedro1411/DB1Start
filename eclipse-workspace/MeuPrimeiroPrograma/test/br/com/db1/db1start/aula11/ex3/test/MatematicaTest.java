package br.com.db1.db1start.aula11.ex3.test;

import org.junit.Test;

import br.com.db1.db1start.aula11.ex3.Matematica;
import org.junit.Assert;

public class MatematicaTest {
	
	@Test
	public void deveRetornarOMenorValor() {
		Matematica matematica = new Matematica();
		double menorValor = matematica.menorValor(10, 5);
		Assert.assertEquals(5, menorValor,0);
	}
	@Test
	public void deveRetornarOMenorValor2() {
		Matematica matematica = new Matematica();
		double menorValor = matematica.menorValor2(10, 5, 2);
		Assert.assertEquals(2, menorValor,0);
	}
	@Test
	public void deveRetornarMediaDe3Numero() {
		Matematica matematica = new Matematica();
		double media = matematica.mediaDe3Numero(10, 6, 8);
		Assert.assertEquals(8, media,0);
	}
	@Test
	public void deveRetornarAreaDoTriangulo() {
		Matematica matematica = new Matematica();
		double area = matematica.areaDoTriangulo(10, 5);
		Assert.assertEquals(25, area,0);
	}

}

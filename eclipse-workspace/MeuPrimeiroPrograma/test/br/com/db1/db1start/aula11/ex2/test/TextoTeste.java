package br.com.db1.db1start.aula11.ex2.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.db1start.aula11.ex2.Texto;

public class TextoTeste {
	
	@Test
	public void deveMudarParaLetraMaiuscula() {
		Texto texto = new Texto();
		String textoTransformado = texto.mudarTextoParaLetraMaiuscula("exemplo texto");
		Assert.assertEquals("EXEMPLO TEXTO", textoTransformado);
	}
	@Test
	public void deveMudarParaLetraMinuscula() {
		Texto texto = new Texto();
		String textoTransformado = texto.mudarTextoParaLetraMinuscula("EXEMPLO TEXTO");
		Assert.assertEquals("exemplo texto", textoTransformado);
	}
	@Test
	public void deveRetornarTamanhoDoTexto() {
		Texto texto = new Texto();
		int tamanhoDoTexto = texto.tamanhoDoTexto("DB1START");
		Assert.assertEquals(8, tamanhoDoTexto);
	}
	@Test
	public void deveRetornarTamanhoDoTextoComEspaco() {
		Texto texto = new Texto();
		int tamanhoDoTexto = texto.tamanhoDoTextoComEspaco(" DB1START ");
		Assert.assertEquals(10, tamanhoDoTexto);
	}
	@Test
	public void deveRetornarTamanhoDoTextoSemEspaco() {
		Texto texto = new Texto();
		int tamanhoDoTexto = texto.tamanhoDoTextoSemEspaco(" DB1START ");
		Assert.assertEquals(8, tamanhoDoTexto);
	}
	@Test
	public void deveRetornar4PrimeirasLetrasDoNome() {
		Texto texto = new Texto();
		String retorna4PrimeiraLetras = texto.retornar4PrimeirasLetrasDoNome("Jo�o Pedro Malheiro Oliveira");
		Assert.assertEquals("Jo�o", retorna4PrimeiraLetras);
	}
	@Test
	public void deveRetornarDepoisDa3LetraDoNome() {
		Texto texto = new Texto();
		String retornarDepoisDa3LetraDoNome = texto.retornarDepoisDa3LetraDoNome("Jo�o Pedro Malheiro Oliveira");
		Assert.assertEquals("o Pedro Malheiro Oliveira", retornarDepoisDa3LetraDoNome);
	}
	@Test
	public void deveRetornar4UltimasLetrasDoNome() {
		Texto texto = new Texto();
		String retorna4UltimasLetras = texto.retornar4UltimasLetrasDoNome("Jo�o Pedro Malheiro Oliveira");
		Assert.assertEquals("eira", retorna4UltimasLetras);
	}
	@Test
	public void deveRetornarAluno() {
		Texto texto = new Texto();
		String retornarAluno = texto.substituirNomeParaAluno("Jo�o Pedro Malheiro Oliveira");
		Assert.assertEquals("Aluno Pedro Malheiro Oliveira", retornarAluno);
	}
	@Test
	public void deveRetornarTextoComEspaco() {
		Texto texto = new Texto();
		String[] retornarComEspaco = texto.mostrarSeparado("banana, ma��, melancia");
		String[] retornoEsperado = new String[] {"banana", "ma��", "melancia"};
		retornoEsperado = retornarComEspaco;
		Assert.assertArrayEquals("banana ma�� melancia", retornoEsperado, retornarComEspaco);
	}
	@Test
	public void deveRetornarQuantidadeDeVogais() {
		Texto texto = new Texto();
		int quantidadeDeVogal = texto.contarVogais("Alfabeto");
		Assert.assertEquals(4, quantidadeDeVogal);
	}
	@Test
	public void deveRetornarQuantidadeDeConsoantes() {
		Texto texto = new Texto();
		int quantidadeDeConsoante = texto.contarConsoantes("Alfabeto");
		Assert.assertEquals(4, quantidadeDeConsoante);
	}
	@Test
	public void deveRetornarTextoInvertido() {
		Texto texto = new Texto();
		String textoInvertido = texto.inverterTexto("Java");
		Assert.assertEquals("avaJ", textoInvertido);
	}

}

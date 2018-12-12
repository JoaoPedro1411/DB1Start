package br.com.db1.db1start.aula18.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.db1start.aula18.Calculadora;
import br.com.db1.db1start.aula18.Opera�ao;

public class CalculadoraTest {
	
	@Test
	public void deveRetornarOperacaoSoma() {
		Calculadora calculadora = new Calculadora(1,  2);
		Integer soma = calculadora.executaOperacao(Opera�ao.SOMA);
		Assert.assertEquals(3, soma, 0);
	}
	@Test
	public void deveRetornarOperacaoSubtracao() {
		Calculadora calculadora = new Calculadora(1,  2);
		Integer subtracao = calculadora.executaOperacao(Opera�ao.SUBTRACAO);
		Assert.assertEquals(-1, subtracao, 0);
	}
	@Test
	public void deveRetornarOperacaoDivisao() {
		Calculadora calculadora = new Calculadora(2,  2);
		Integer divisao = calculadora.executaOperacao(Opera�ao.DIVISAO);
		Assert.assertEquals(1, divisao, 0);
	}
	@Test
	public void deveRetornarOperacaoMultiplicacao() {
		Calculadora calculadora = new Calculadora(1,  2);
		Integer multiplicacao = calculadora.executaOperacao(Opera�ao.MULTIPLICACAO);
		Assert.assertEquals(2, multiplicacao, 0);
	}

}

package br.com.db1.db1start.aula11.ex1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.db1start.aula11.ex1.Calculadora;

public class CalculadoraTest {
	
	@Test
	public void deveSomarDoisNumero() {
		Calculadora calculadora = new Calculadora();
		int valorSomado = calculadora.somarDoisNumero(10, 5);
		Assert.assertEquals(15, valorSomado);
	}
	
	@Test
	public void deveSubtrairDoisNumero() {
		Calculadora calculadora = new Calculadora();
		int valorSubtraido = calculadora.subtrairDoisNumero(10, 5);
		Assert.assertEquals(5, valorSubtraido);
	}
	@Test
	public void deveMultiplicarDoisNumero() {
		Calculadora calculadora = new Calculadora();
		int valorMultiplicado = calculadora.multiplicarDoisNumero(10, 5);
		Assert.assertEquals(50, valorMultiplicado);
	}
	@Test
	public void deveDividirDoisNumero() {
		Calculadora calculadora = new Calculadora();
		int valorDividido = calculadora.dividirDoisNumero(10, 5);
		Assert.assertEquals(2, valorDividido);
	}
	@Test
	public void deveVerificarNumeroPar() {
		Calculadora calculadora = new Calculadora();
		boolean valorVerificadoPar = calculadora.verificarNumeroPar(10);
		Assert.assertTrue(valorVerificadoPar);
	}
	@Test
	public void deveVerificarNumeroImpar() {
		Calculadora calculadora = new Calculadora();
		boolean valorVerificadoImpar = calculadora.verificarNumeroImpar(5);
		Assert.assertTrue(valorVerificadoImpar);
	}
	@Test
	public void deveVerificarMaiorNumero() {
		Calculadora calculadora = new Calculadora();
		int valorMaiorVerificado = calculadora.verificarMaiorNumero(10, 5);
		Assert.assertEquals(10, valorMaiorVerificado);
	}
	@Test
	public void deveContarNumerosImparesAte100() {
		Calculadora calculadora = new Calculadora();
		int quantidadeDeNumerosImpar = calculadora.contarNumerosImparesAte100(50);
		Assert.assertEquals(25, quantidadeDeNumerosImpar);
	}

}

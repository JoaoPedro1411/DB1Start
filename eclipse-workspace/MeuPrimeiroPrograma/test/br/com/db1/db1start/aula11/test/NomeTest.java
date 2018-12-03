package br.com.db1.db1start.aula11.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.db1start.aula11.Nome;

public class NomeTest {
	
	@Test 
	public void deveTransformarParaLetraMaiuscula() {
		Nome nome = new Nome();
		String valorTransformado = nome.transformarParaLetraMaiuscula("joão pedro");
		Assert.assertEquals("JOÃO PEDRO", valorTransformado);
	}
	
	@Test
	public void deveRetornarTamanhoDoNome() {
		Nome nome = new Nome();
		int tamanhoDoNome = nome.tamanhoDoNome("JOÃO PEDRO");
		Assert.assertEquals(10, tamanhoDoNome);
	}
	

}

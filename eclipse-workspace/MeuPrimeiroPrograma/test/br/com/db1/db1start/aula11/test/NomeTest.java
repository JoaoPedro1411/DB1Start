package br.com.db1.db1start.aula11.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.db1start.aula11.Nome;

public class NomeTest {
	
	@Test 
	public void deveTransformarParaLetraMaiuscula() {
		Nome nome = new Nome();
		String valorTransformado = nome.transformarParaLetraMaiuscula("jo�o pedro");
		Assert.assertEquals("JO�O PEDRO", valorTransformado);
	}
	
	@Test
	public void deveRetornarTamanhoDoNome() {
		Nome nome = new Nome();
		int tamanhoDoNome = nome.tamanhoDoNome("JO�O PEDRO");
		Assert.assertEquals(10, tamanhoDoNome);
	}
	

}

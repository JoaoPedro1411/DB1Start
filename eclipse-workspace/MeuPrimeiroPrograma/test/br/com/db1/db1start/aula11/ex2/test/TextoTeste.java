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

}

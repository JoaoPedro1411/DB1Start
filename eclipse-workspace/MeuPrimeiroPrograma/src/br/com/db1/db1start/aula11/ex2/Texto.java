package br.com.db1.db1start.aula11.ex2;

public class Texto {
	
	public String mudarTextoParaLetraMaiuscula(String texto) {
		return texto.toUpperCase();
	}
	public String mudarTextoParaLetraMinuscula(String texto) {
		return texto.toLowerCase();
	}
	public int tamanhoDoTexto(String texto) {
		return texto.length();
	}
	public int tamanhoDoTextoComEspaco(String texto) {
		return texto.length();
	}
	public int tamanhoDoTextoSemEspaco(String texto) {
		return texto.trim().length();
	}
	public String retornar4PrimeirasLetras() {
		
	}
}
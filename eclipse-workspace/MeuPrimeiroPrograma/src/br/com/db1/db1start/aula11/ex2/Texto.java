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
	public String retornar4PrimeirasLetrasDoNome(String texto) {
		String retorno = "";
		retorno = texto.substring(0, 4);
		return retorno;
	}
	public String retornarDepoisDa3LetraDoNome(String texto) {
		String retorno = "";
		retorno = texto.substring(3);
		return retorno;
	}
	public String retornar4UltimasLetrasDoNome(String texto) {
		String retorno = "";
		retorno = texto.substring(24);
		return retorno;
	}
	public String substituirNomeParaAluno(String texto) {
		int indexDoEspaco = texto.indexOf(" ");
		String aluno = texto.substring(0, indexDoEspaco);
		return texto.replace(aluno, "Aluno");
	}
	public String[] mostrarSeparado(String texto) {
		String[] separador = texto.split(",");
		return separador;
	}
	public int contarVogais(String texto) {
		String textoMinusculo = texto.toLowerCase();
		int tamanhoDoTexto = texto.length();
		String vogais = "aeiou";
		int totalVogais = 0;
		for(int i = 0; i < tamanhoDoTexto; i++) {
			if(vogais.indexOf(textoMinusculo.charAt(i)) >= 0)
				totalVogais++;
		}
		return totalVogais;
	}
	public int contarConsoantes(String texto) {
		String textoMinusculo = texto.toLowerCase();
		int tamanhoDoTexto = texto.length();
		String consoantes = "bcdfghjklmnpqrstvwxyz";
		int totalConsoantes = 0;
		for(int i = 0; i < tamanhoDoTexto; i++) {
			if(consoantes.indexOf(textoMinusculo.charAt(i)) >= 0)
				totalConsoantes++;
		}
		return totalConsoantes;
	}
	public String inverterTexto(String texto) {
		String inverterTexto = new StringBuffer(texto).reverse().toString();
		return inverterTexto;
	}
}

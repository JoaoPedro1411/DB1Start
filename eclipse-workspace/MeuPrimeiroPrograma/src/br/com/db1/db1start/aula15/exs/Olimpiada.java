package br.com.db1.db1start.aula15.exs;

import java.util.List;

public abstract class Olimpiada {
	
	private List<EsportesColetivos> coletivos;
	private List<EsportesIndividuais> individuais;
	public TipoOlimpiada tipoOlimpiada;
	
	public void jogos() {
		System.out.println("Jogo em");
	}

}

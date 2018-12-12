package br.com.db1.db1start.aula18;

public class Calculadora {
	
	private Integer num1;
	private Integer num2;
	
	public Calculadora(Integer num1, Integer num2) {
		this.num1 = num1;
		this.num2 = num2;	
	}
	public Integer executaOperacao(Operaçao operacao) {
		return operacao.executa(this.num1, this.num2);
	}

}

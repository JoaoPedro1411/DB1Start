package br.com.db1.db1start.aula11.ex1;

public class Calculadora {
	
	public Integer somarDoisNumero(Integer num1, Integer num2) {
		return num1 + num2;
	}
	public Integer subtrairDoisNumero(Integer num1, Integer num2) {
		return num1 - num2;
	}
	public Integer multiplicarDoisNumero(Integer num1, Integer num2) {
		return num1 * num2;
	}
	public Integer dividirDoisNumero(Integer num1, Integer num2) {
		return num1 / num2;
	}
	public boolean verificarNumeroPar(Integer num1) {
		return num1 %2 == 0;
	}
	public boolean verificarNumeroImpar(Integer num1) {
		return num1 %2 != 0;
	}
	public Integer verificarMaiorNumero(Integer num1, Integer num2) {
		return Math.max(num1, num2);
	}
	public Integer contarNumerosImparesAte100(Integer num1) {
		int num2 = 0;
		for (Integer i = num1; i < 100; i++) {
			if(i %2 != 0) {
				num2++;
			}
		}
	return num2;
	}
}

package br.com.db1.db1start.aula11.ex3;

public class Matematica {
	
	public double menorValor(double num1, double num2) {
		return Math.min(num1, num2);
	}
	public double menorValor2(double num1, double num2, double num3) {
		double numMenor = 0;
		if(num1 < num2)
			numMenor = Math.min(num1, num3);
		else
			numMenor = Math.min(num2, num3);
		return numMenor;
	}
	public double mediaDe3Numero(double num1, double num2, double num3) {
		double media = 0;
		media = (num1 + num2 + num3) / 3;
		return media;
	}
	public double areaDoTriangulo(double num1, double num2) {
		double area = 0;
		area = (num1 * num2) / 2;
		return area;
	}

}

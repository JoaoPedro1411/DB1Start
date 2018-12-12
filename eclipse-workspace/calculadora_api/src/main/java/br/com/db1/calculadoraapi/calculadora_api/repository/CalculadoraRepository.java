package br.com.db1.calculadoraapi.calculadora_api.repository;

import java.util.List;

import br.com.db1.calculadoraapi.calculadora_api.model.Calculadora;

public class CalculadoraRepository {

	private List<Calculadora> calc;

	public CalculadoraRepository(List<Calculadora> calc) {

		this.calc = new List<Calculadora>();

		Calculadora soma = new Calculadora(10, 10);
	}

}

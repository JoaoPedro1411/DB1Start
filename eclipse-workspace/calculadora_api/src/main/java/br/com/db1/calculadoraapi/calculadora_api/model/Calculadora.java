package br.com.db1.calculadoraapi.calculadora_api.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "calculadora")
public class Calculadora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "num1", nullable = false, length = 4)
	private Integer num1;

	@Column(name = "num2", nullable = false, length = 4)
	private Integer num2;

	@Enumerated
	@Column(name = "opm", nullable = false, length = 4)
	private OperacaoMatematica opm;

	@Column(name = "dataOperacao", nullable = false, length = 10)
	private LocalDateTime dataOperacao;

	@Column(name = "resultado", nullable = false, length = 10)
	private Integer resultado;

	public Calculadora(Integer num1, Integer num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public Integer executaOperacao(OperacaoMatematica opm) {
		return opm.executar(this.num1, this.num2);
	}

}

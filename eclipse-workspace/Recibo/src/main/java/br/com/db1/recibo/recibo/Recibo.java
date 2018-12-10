package br.com.db1.recibo.recibo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.db1.recibo.pessoa.Pessoa;

@Entity
@Table
public class Recibo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private Double valor;
	
	@Column
	private Date dataEmissao;
	
	@ManyToOne
	@JoinColumn(name = "emitente_id", referencedColumnName = "id", nullable = false)
	private Pessoa emitente;

	@ManyToOne
	@JoinColumn(name = "prestador_id", referencedColumnName = "id", nullable = false)
	private Pessoa prestador;


}

package br.com.db1.recibo.endereco;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.db1.recibo.cidade.Cidade;

@Entity
@Table(name = "endereco")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "cidade_id", referencedColumnName = "id", nullable = false)
	private Cidade cidade;

	@Column
	private String logradouro;

	@Column
	private String numero;

	@Column
	private String complemento;

	@Column
	private String cep;

	@Column
	private TipoLogradouro tipoLogradouro;

}

package br.com.db1.cidade.cidadeapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cidade")
public class Cidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome", nullable = false, length = 60)
	private String nome;

	@Enumerated
	@Column(name = "uf", nullable = false, length = 2)
	private Uf uf;
	
	protected Cidade() {
		
	}
	
	

}

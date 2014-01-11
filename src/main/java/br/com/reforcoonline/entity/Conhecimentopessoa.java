package br.com.reforcoonline.entity;

// Generated 04/01/2014 16:22:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Conhecimentopessoa generated by hbm2java
 */
@Entity
@Table(name = "conhecimentopessoa", uniqueConstraints = @UniqueConstraint(columnNames = {
		"idConhecimento", "idPessoa" }))
public class Conhecimentopessoa implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Pessoa pessoa;
	private Conhecimento conhecimento;

	public Conhecimentopessoa() {
	}

	public Conhecimentopessoa(int id, Pessoa pessoa, Conhecimento conhecimento) {
		this.id = id;
		this.pessoa = pessoa;
		this.conhecimento = conhecimento;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPessoa", nullable = false)
	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idConhecimento", nullable = false)
	public Conhecimento getConhecimento() {
		return this.conhecimento;
	}

	public void setConhecimento(Conhecimento conhecimento) {
		this.conhecimento = conhecimento;
	}

}

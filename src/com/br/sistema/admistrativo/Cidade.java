package com.br.sistema.admistrativo;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Cidade
 *
 */
@Entity

public class Cidade implements Serializable {

	   
	@Id
	@GeneratedValue(generator = "idCidade")
	@SequenceGenerator(name = "idCidade", sequenceName = "idCidade", allocationSize = 1)
	private Integer idCidade;
	@Column
	private Integer codigo;
	@Column
	private String nomeCidade;
	@Column
	private String uf;
	private static final long serialVersionUID = 1L;

	public Cidade() {
		super();
	}   
	public Integer getIdCidade() {
		return this.idCidade;
	}

	public void setIdCidade(Integer idCidade) {
		this.idCidade = idCidade;
	}   
	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}   
	public String getNomeCidade() {
		return this.nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}   
	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
   
}

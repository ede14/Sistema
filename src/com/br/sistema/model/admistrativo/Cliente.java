package com.br.sistema.model.admistrativo;

import com.br.sistema.model.admistrativo.Cidade;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;
import static javax.persistence.TemporalType.DATE;

/**
 * Entity implementation class for Entity: Cliente
 *
 */
@Entity

public class Cliente implements Serializable {

	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "idCliente")
	@SequenceGenerator(name = "idCliente", sequenceName = "idCliente", allocationSize = 1)
	private Integer idCliente;
	@Column
	private String endereco;
	@Column
	private String bairro;
	@Column
	private Cidade cidade;
	@Column
	private String numero;
	@Column
	private String telefone;
	@Temporal(DATE)
	private Date dataCadastro;
	@Column
	private String cep;
	@Column
	private Boolean ativo;
	private static final long serialVersionUID = 1L;

	public Cliente() {
		super();
	}   
	public Integer getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}   
	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}   
	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}   
	public Cidade getCidade() {
		return this.cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}   
	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}   
	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}   
	public Date getDataCadastro() {
		return this.dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}   
	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}   
	public Boolean getAtivo() {
		return this.ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
   
}

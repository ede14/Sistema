package com.br.sistema.model.admistrativo;

import com.br.sistema.model.admistrativo.Cidade;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

/**
 * Entity implementation class for Entity: Fornecedor
 *
 */
@Entity

public class Fornecedor implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "idForncedor")
	@SequenceGenerator(name = "idForncedor", sequenceName = "idForncedor", allocationSize = 1)
	private Integer idForncedor;
	@Column
	private String razaoSocial;
	@Column
	private String nomeFantasia;
	@Column
	private String cnpj;
	@Column
	private String ie;
	@Column
	private String endereco;
	@Column
	private String bairro;
	@Column
	private Cidade cidade;
	@Column
	private String telefone;
	@Column
	private String responsavel;
	@Column
	private String observacao;
	private static final long serialVersionUID = 1L;

	public Fornecedor() {
		super();
	}   
	public Integer getIdForncedor() {
		return this.idForncedor;
	}

	public void setIdForncedor(Integer idForncedor) {
		this.idForncedor = idForncedor;
	}   
	public String getRazaoSocial() {
		return this.razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}   
	public String getNomeFantasia() {
		return this.nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}   
	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}   
	public String getIe() {
		return this.ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
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
	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}   
	public String getResponsavel() {
		return this.responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}   
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
   
}

package com.br.sistema.admistrativo;

import com.br.sistema.admistrativo.Cliente;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ClienteJuridico
 *
 */
@Entity

public class ClienteJuridico extends Cliente implements Serializable {

	@Column
	private String razaoSocial;
	@Column
	private String nomeFantasia;
	@Column
	private String cnpj;
	@Column
	private String ie;
	@Column
	private String resposnsavel;
	@Column
	private String obs;
	private static final long serialVersionUID = 1L;

	public ClienteJuridico() {
		super();
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
	public String getResposnsavel() {
		return this.resposnsavel;
	}

	public void setResposnsavel(String resposnsavel) {
		this.resposnsavel = resposnsavel;
	}   
	public String getObs() {
		return this.obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}
   
}

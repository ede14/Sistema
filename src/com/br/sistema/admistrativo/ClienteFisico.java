package com.br.sistema.admistrativo;

import com.br.sistema.admistrativo.Cliente;
import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;
import static javax.persistence.TemporalType.DATE;

/**
 * Entity implementation class for Entity: ClienteFisico
 *
 */
@Entity

public class ClienteFisico extends Cliente implements Serializable {

	@Column
	private String rg;
	@Column
	private String cpf;
	@Temporal(DATE)
	private Date dataNascimento;
	@Column
	private String obs;
	private static final long serialVersionUID = 1L;

	public ClienteFisico() {
		super();
	}   
	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}   
	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}   
	public Date getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}   
	public String getObs() {
		return this.obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}
   
}

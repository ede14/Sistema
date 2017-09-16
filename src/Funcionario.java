

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;
import static javax.persistence.GenerationType.SEQUENCE;

/**
 * Entity implementation class for Entity: Fumcionario
 *
 */
@Entity

public class Funcionario implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "idFuncionario")
	@SequenceGenerator(name = "idFuncionario", sequenceName = "idFuncionario", allocationSize = 1)
	private Integer idFuncionario;
	@Column
	private String nomeFuncionario;
	@Column
	private int rg;
	@Column
	private int cpf;
	@Column
	private Date dataNascimento;
	@Column
	private Date dataAdmissao;
	@Column
	private Date dataDemissao;
	@Column
	private String endereco;
	@Column
	private String bairro;
	@Column
	private Cidade cidade;
	@Column
	private Integer numero;
	@Column
	private String complemento;
	@Column
	private String pispasep;
	@Column
	private String telefone;
	@Column
	private String telefoneOpcional;
	@Column
	private String usuario;
	@Column
	private String senha;
	@Column
	private Boolean ativo;
	@Column
	private String cargo;
	@Column
	private String email;
	
	
	private static final long serialVersionUID = 1L;

	public Funcionario() {
		super();
	}   
	public Integer getIdFuncionario() {
		return this.idFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}   
	public String getNomeFuncionario() {
		return this.nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}   
	public int getRg() {
		return this.rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}   
	public int getCpf() {
		return this.cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}   
	public Date getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}   
	public Date getDataAdmissao() {
		return this.dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}   
	public Date getDataDemissao() {
		return this.dataDemissao;
	}

	public void setDataDemissao(Date dataDemissao) {
		this.dataDemissao = dataDemissao;
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
	   
	public Integer getNumero() {
		return this.numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}   
	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}   
	public String getPispasep() {
		return this.pispasep;
	}

	public void setPispasep(String pispasep) {
		this.pispasep = pispasep;
	}   
	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}   
	public String getTelefoneOpcional() {
		return this.telefoneOpcional;
	}

	public void setTelefoneOpcional(String telefoneOpcional) {
		this.telefoneOpcional = telefoneOpcional;
	}   
	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}   
	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}   
	public Boolean getAtivo() {
		return this.ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}   
	
   
}

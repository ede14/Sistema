package com.br.sistema.admistrativo;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;
import static javax.persistence.GenerationType.SEQUENCE;

/**
 * Entity implementation class for Entity: Produto
 *
 */
@Entity

public class Produto implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "idProduto")
	@SequenceGenerator(name = "idProduto", sequenceName = "idProduto", allocationSize = 1)
	private Integer idProduto;
	@Column
	private String nomeProduto;
	@Column
	private String unidade;
	@Column
	private String ean;
	@Column
	private String ncm;
	@Column
	private String cest;
	@Column
	private String origem;
	@Column
	private Double preco_compra;
	@Column
	private Double preco_venda;
	@Column
	private Double peso;
	@Column
	private Fornecedor fornecedor;
	@Column
	private String marca;
	@Column
	private String imagem;
	@Column
	private Integer estoque;
	@Column
	private Integer estoqueMin;
	@Column
	private String icms_cst;
	@Column
	private Double icms_perc;
	@Column
	private String ipi_cst;
	@Column
	private Double ipi_perc;
	@Column
	private String pis_cst;
	@Column
	private String pis_perc;
	@Column
	private String cofins_cst;
	@Column
	private Double cofins_perc;
	@Column
	private Double trib_st_perc;
	@Column
	private String descricao;
	private static final long serialVersionUID = 1L;

	public Produto() {
		super();
	}   
	public Integer getIdProduto() {
		return this.idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}   
	public String getNomeProduto() {
		return this.nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}   
	public String getUnidade() {
		return this.unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}   
	public String getEan() {
		return this.ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}   
	public String getNcm() {
		return this.ncm;
	}

	public void setNcm(String ncm) {
		this.ncm = ncm;
	}   
	public String getCest() {
		return this.cest;
	}

	public void setCest(String cest) {
		this.cest = cest;
	}   
	public String getOrigem() {
		return this.origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}   
	public Double getPreco_compra() {
		return this.preco_compra;
	}

	public void setPreco_compra(Double preco_compra) {
		this.preco_compra = preco_compra;
	}   
	public Double getPreco_venda() {
		return this.preco_venda;
	}

	public void setPreco_venda(Double preco_venda) {
		this.preco_venda = preco_venda;
	}   
	public Double getPeso() {
		return this.peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}   
	public Fornecedor getFornecedor() {
		return this.fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}   
	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}   
	public String getImagem() {
		return this.imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}   
	public Integer getEstoque() {
		return this.estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}   
	public Integer getEstoqueMin() {
		return this.estoqueMin;
	}

	public void setEstoqueMin(Integer estoqueMin) {
		this.estoqueMin = estoqueMin;
	}   
	public String getIcms_cst() {
		return this.icms_cst;
	}

	public void setIcms_cst(String icms_cst) {
		this.icms_cst = icms_cst;
	}   
	public Double getIcms_perc() {
		return this.icms_perc;
	}

	public void setIcms_perc(Double icms_perc) {
		this.icms_perc = icms_perc;
	}   
	public String getIpi_cst() {
		return this.ipi_cst;
	}

	public void setIpi_cst(String ipi_cst) {
		this.ipi_cst = ipi_cst;
	}   
	public Double getIpi_perc() {
		return this.ipi_perc;
	}

	public void setIpi_perc(Double ipi_perc) {
		this.ipi_perc = ipi_perc;
	}   
	public String getPis_cst() {
		return this.pis_cst;
	}

	public void setPis_cst(String pis_cst) {
		this.pis_cst = pis_cst;
	}   
	public String getPis_perc() {
		return this.pis_perc;
	}

	public void setPis_perc(String pis_perc) {
		this.pis_perc = pis_perc;
	}   
	public String getCofins_cst() {
		return this.cofins_cst;
	}

	public void setCofins_cst(String cofins_cst) {
		this.cofins_cst = cofins_cst;
	}   
	public Double getCofins_perc() {
		return this.cofins_perc;
	}

	public void setCofins_perc(Double cofins_perc) {
		this.cofins_perc = cofins_perc;
	}   
	public Double getTrib_st_perc() {
		return this.trib_st_perc;
	}

	public void setTrib_st_perc(Double trib_st_perc) {
		this.trib_st_perc = trib_st_perc;
	}   
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
   
}

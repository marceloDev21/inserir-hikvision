package br.com.apicadastrohikvision.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fields")
public class Fields implements Serializable {

	private static final long serialVersionUID = 5935836358441880615L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	private String nomePai;
	private String nomeMae;
	private String documentoIdentidade;
	private String dataNascimento;
	private String cpf;
	private String dataExpedicao;
	private String naturalidade;
	private String registro;
	private String dataValidade;
	private String categoriaHabilitacao;
	private String numeroControle1;
	private String numeroControle2;
	private String dataPrimeiraHabilitacao;
	private String dataEmissao;
	private String local;
	private String observacao;
	private String numeroSeguranca;
	private String estadoEmissor;
	private String orgaoEmissor;

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fields other = (Fields) obj;
		return Objects.equals(id, other.id);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getDocumentoIdentidade() {
		return documentoIdentidade;
	}

	public void setDocumentoIdentidade(String documentoIdentidade) {
		this.documentoIdentidade = documentoIdentidade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataExpedicao() {
		return dataExpedicao;
	}

	public void setDataExpedicao(String dataExpedicao) {
		this.dataExpedicao = dataExpedicao;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public String getCategoriaHabilitacao() {
		return categoriaHabilitacao;
	}

	public void setCategoriaHabilitacao(String categoriaHabilitacao) {
		this.categoriaHabilitacao = categoriaHabilitacao;
	}

	public String getNumeroControle1() {
		return numeroControle1;
	}

	public void setNumeroControle1(String numeroControle1) {
		this.numeroControle1 = numeroControle1;
	}

	public String getNumeroControle2() {
		return numeroControle2;
	}

	public void setNumeroControle2(String numeroControle2) {
		this.numeroControle2 = numeroControle2;
	}

	public String getDataPrimeiraHabilitacao() {
		return dataPrimeiraHabilitacao;
	}

	public void setDataPrimeiraHabilitacao(String dataPrimeiraHabilitacao) {
		this.dataPrimeiraHabilitacao = dataPrimeiraHabilitacao;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getNumeroSeguranca() {
		return numeroSeguranca;
	}

	public void setNumeroSeguranca(String numeroSeguranca) {
		this.numeroSeguranca = numeroSeguranca;
	}

	public String getEstadoEmissor() {
		return estadoEmissor;
	}

	public void setEstadoEmissor(String estadoEmissor) {
		this.estadoEmissor = estadoEmissor;
	}

	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}

	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}

}

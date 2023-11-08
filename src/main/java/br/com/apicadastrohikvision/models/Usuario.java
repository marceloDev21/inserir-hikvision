package br.com.apicadastrohikvision.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

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
	private String dataEmissao;
	private String estadoEmissor;
	private String orgaoEmissor;
	@Column(columnDefinition = "LONGTEXT", name = "result_image")
	private String resultImage;
	@Column(columnDefinition = "LONGTEXT", name = "analyse_image")
	private String analyseImage;
	private String email;
	private String celular;
	@Column(name = "nome_esposa")
	private String nomeEsposa;
	@Column(name = "cpf_esposa")
	private String cpfEsposa;
	@Column(name = "email_esposa")
	private String emailEsposa;
	@Column(name = "celular_esposa")
	private String celularEsposa;

	@Column(columnDefinition = "LONGTEXT", name = "documento_frente")
	private String documentoFrente;
	@Column(columnDefinition = "LONGTEXT", name = "documento_verso")
	private String documentoVerso;
	@Column(columnDefinition = "LONGTEXT", name = "documento_retrato")
	private String documentoRetrato;
	@Column(columnDefinition = "LONGTEXT", name = "documento_assinatura")
	private String documentoAssinatura;

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
		Usuario other = (Usuario) obj;
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

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
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

	public String getResultImage() {
		return resultImage;
	}

	public void setResultImage(String resultImage) {
		this.resultImage = resultImage;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getNomeEsposa() {
		return nomeEsposa;
	}

	public void setNomeEsposa(String nomeEsposa) {
		this.nomeEsposa = nomeEsposa;
	}

	public String getCpfEsposa() {
		return cpfEsposa;
	}

	public void setCpfEsposa(String cpfEsposa) {
		this.cpfEsposa = cpfEsposa;
	}

	public String getEmailEsposa() {
		return emailEsposa;
	}

	public void setEmailEsposa(String emailEsposa) {
		this.emailEsposa = emailEsposa;
	}

	public String getCelularEsposa() {
		return celularEsposa;
	}

	public void setCelularEsposa(String celularEsposa) {
		this.celularEsposa = celularEsposa;
	}

	public String getAnalyseImage() {
		return analyseImage;
	}

	public void setAnalyseImage(String analyseImage) {
		this.analyseImage = analyseImage;
	}

	public String getDocumentoFrente() {
		return documentoFrente;
	}

	public void setDocumentoFrente(String documentoFrente) {
		this.documentoFrente = documentoFrente;
	}

	public String getDocumentoVerso() {
		return documentoVerso;
	}

	public void setDocumentoVerso(String documentoVerso) {
		this.documentoVerso = documentoVerso;
	}

	public String getDocumentoRetrato() {
		return documentoRetrato;
	}

	public void setDocumentoRetrato(String documentoRetrato) {
		this.documentoRetrato = documentoRetrato;
	}

	public String getDocumentoAssinatura() {
		return documentoAssinatura;
	}

	public void setDocumentoAssinatura(String documentoAssinatura) {
		this.documentoAssinatura = documentoAssinatura;
	}

}

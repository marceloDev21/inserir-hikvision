package br.com.apicadastrohikvision.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "ocr")
public class Ocr implements Serializable {

	private static final long serialVersionUID = 5935836358441880615L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String tod;
	private String tcn;
	
	@OneToOne(optional = true, cascade = CascadeType.ALL)
	@JoinColumn(name = "fields_id", referencedColumnName = "id", nullable = false)
	private Fields fields;
	
	@OneToOne(optional = true, cascade = CascadeType.ALL)
	@JoinColumn(name = "back_result_id", referencedColumnName = "id", nullable = false)
	private BackResult backResult;
	
	@OneToOne(optional = true, cascade = CascadeType.ALL)
	@JoinColumn(name = "front_result_id", referencedColumnName = "id", nullable = false)
	private FrontResult frontResult;
	
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
		Ocr other = (Ocr) obj;
		return Objects.equals(id, other.id);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTod() {
		return tod;
	}

	public void setTod(String tod) {
		this.tod = tod;
	}

	public String getTcn() {
		return tcn;
	}

	public void setTcn(String tcn) {
		this.tcn = tcn;
	}

	public Fields getFields() {
		return fields;
	}

	public void setFields(Fields fields) {
		this.fields = fields;
	}

	public BackResult getBackResult() {
		return backResult;
	}

	public void setBackResult(BackResult backResult) {
		this.backResult = backResult;
	}

	public FrontResult getFrontResult() {
		return frontResult;
	}

	public void setFrontResult(FrontResult frontResult) {
		this.frontResult = frontResult;
	}

	
}
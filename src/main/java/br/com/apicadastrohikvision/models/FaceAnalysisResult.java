package br.com.apicadastrohikvision.models;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "face_analysis_result")
public class FaceAnalysisResult implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String outputImage;
	private boolean passed;
	private double score;
	
	@OneToMany
	@JoinColumn(name = "face_analysis_result_id", referencedColumnName = "id")
	private List<FailedFacePropertiesResults> failedFacePropertiesResults;

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
		FaceAnalysisResult other = (FaceAnalysisResult) obj;
		return Objects.equals(id, other.id);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOutputImage() {
		return outputImage;
	}

	public void setOutputImage(String outputImage) {
		this.outputImage = outputImage;
	}

	public boolean isPassed() {
		return passed;
	}

	public void setPassed(boolean passed) {
		this.passed = passed;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public List<FailedFacePropertiesResults> getFailedFacePropertiesResults() {
		return failedFacePropertiesResults;
	}

	public void setFailedFacePropertiesResults(List<FailedFacePropertiesResults> failedFacePropertiesResults) {
		this.failedFacePropertiesResults = failedFacePropertiesResults;
	}



}

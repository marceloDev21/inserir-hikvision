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
@Table(name = "front_result")
public class FrontResult implements Serializable {

	private static final long serialVersionUID = 5935836358441880615L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(optional = true, cascade = CascadeType.ALL)
	@JoinColumn(name = "image_id", referencedColumnName = "id", nullable = true)
	private Image image;
	
	private boolean lowQuality;

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
		FrontResult other = (FrontResult) obj;
		return Objects.equals(id, other.id);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public boolean isLowQuality() {
		return lowQuality;
	}

	public void setLowQuality(boolean lowQuality) {
		this.lowQuality = lowQuality;
	}

}
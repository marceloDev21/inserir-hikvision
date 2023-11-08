package br.com.apicadastrohikvision.models.body;

public class FaceAnalysisBody {

	private Long serialNumber;
	private String enableReturnResultImage;
	private Face face;
	private Back back;
	private String imageType;

	public Long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getEnableReturnResultImage() {
		return enableReturnResultImage;
	}

	public void setEnableReturnResultImage(String enableReturnResultImage) {
		this.enableReturnResultImage = enableReturnResultImage;
	}

	public Back getBack() {
		return back;
	}

	public void setBack(Back back) {
		this.back = back;
	}

	public Face getFace() {
		return face;
	}

	public void setFace(Face face) {
		this.face = face;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

}
package br.com.apicadastrohikvision.models.body;

public class OcrBody {

	private Long serialNumber;
	private String frontImage;
	private String backImage;
	private String tod;
	private String returnOcrResult = "true";
	private String returnImageResult = "true";

	public Long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getFrontImage() {
		return frontImage;
	}

	public void setFrontImage(String frontImage) {
		this.frontImage = frontImage;
	}

	public String getTod() {
		return tod;
	}

	public void setTod(String tod) {
		this.tod = tod;
	}

	public String getReturnOcrResult() {
		return returnOcrResult;
	}

	public void setReturnOcrResult(String returnOcrResult) {
		this.returnOcrResult = returnOcrResult;
	}

	public String getReturnImageResult() {
		return returnImageResult;
	}

	public void setReturnImageResult(String returnImageResult) {
		this.returnImageResult = returnImageResult;
	}

	public String getBackImage() {
		return backImage;
		
	}

	public void setBackImage(String backImage) {
		this.backImage = backImage;
		
	}

}
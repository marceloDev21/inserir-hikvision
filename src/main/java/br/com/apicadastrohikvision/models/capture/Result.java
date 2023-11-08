package br.com.apicadastrohikvision.models.capture;

public class Result {

	private Boolean captured;
	private String capturedFrameIndex;

	public Boolean getCaptured() {
		return captured;
	}

	public void setCaptured(Boolean captured) {
		this.captured = captured;
	}

	public String getCapturedFrameIndex() {
		return capturedFrameIndex;
	}

	public void setCapturedFrameIndex(String capturedFrameIndex) {
		this.capturedFrameIndex = capturedFrameIndex;
	}

}

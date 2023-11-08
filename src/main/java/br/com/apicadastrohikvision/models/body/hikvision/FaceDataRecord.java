package br.com.apicadastrohikvision.models.body.hikvision;

public class FaceDataRecord {
	
	private String faceLibType;
	
	private String FDID ;
	
	private String FPID;

	
	public String getFaceLibType() {
		return faceLibType;
	}

	public void setFaceLibType(String faceLibType) {
		this.faceLibType = faceLibType;
	}

	public String getFDID() {
		return FDID;
	}

	public void setFDID(String fDID) {
		FDID = fDID;
	}

	public String getFPID() {
		return FPID;
	}

	public void setFPID(String fPID) {
		FPID = fPID;
	}

	
	
	
}

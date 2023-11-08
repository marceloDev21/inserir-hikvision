package br.com.apicadastrohikvision.models.body.hikvision;

import java.io.File;

public class FaceRequest {
	
	private FaceDataRecord FaceDataRecord;
	
	private File FaceImage;
	

	public FaceDataRecord getFaceDataRecord() {
		return FaceDataRecord;
	}

	public void setFaceDataRecord(FaceDataRecord faceDataRecord) {
		FaceDataRecord = faceDataRecord;
	}

	public File getFaceImage() {
		return FaceImage;
	}

	public void setFaceImage(File faceImage) {
		FaceImage = faceImage;
	}

	
	
	
}

package br.com.apicadastrohikvision.models.capture;

import java.util.ArrayList;

public class FrameResults {
	private Boolean compliant;
	private ArrayList<String> feedback;

	public Boolean getCompliant() {
		return compliant;
	}

	public void setCompliant(Boolean compliant) {
		this.compliant = compliant;
	}

	public ArrayList<String> getFeedback() {
		return feedback;
	}

	public void setFeedback(ArrayList<String> feedback) {
		this.feedback = feedback;
	}

}

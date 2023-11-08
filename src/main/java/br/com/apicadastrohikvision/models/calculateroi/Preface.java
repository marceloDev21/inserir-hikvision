package br.com.apicadastrohikvision.models.calculateroi;

import org.springframework.stereotype.Component;

@Component
public class Preface {
	private Profile profile;
	private Resolution resolution;


	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Resolution getResolution() {
		return resolution;
	}

	public void setResolution(Resolution resolution) {
		this.resolution = resolution;
	}

}

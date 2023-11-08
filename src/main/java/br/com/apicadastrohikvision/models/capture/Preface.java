package br.com.apicadastrohikvision.models.capture;

import java.util.ArrayList;
import java.util.List;

public class Preface {

	private Profile profile;
	private Integer rotation;
	private List<Frame> frames = new ArrayList<Frame>();
	private ResolutionPreview resolutionPreview;
	private ResolutionCapture resolutionCapture;

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Integer getRotation() {
		return rotation;
	}

	public void setRotation(Integer rotation) {
		this.rotation = rotation;
	}

	public List<Frame> getFrames() {
		return frames;
	}

	public void setFrames(List<Frame> frames) {
		this.frames = frames;
	}

	public ResolutionPreview getResolutionPreview() {
		return resolutionPreview;
	}

	public void setResolutionPreview(ResolutionPreview resolutionPreview) {
		this.resolutionPreview = resolutionPreview;
	}

	public ResolutionCapture getResolutionCapture() {
		return resolutionCapture;
	}

	public void setResolutionCapture(ResolutionCapture resolutionCapture) {
		this.resolutionCapture = resolutionCapture;
	}

}

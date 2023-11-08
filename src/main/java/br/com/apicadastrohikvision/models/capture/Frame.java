package br.com.apicadastrohikvision.models.capture;

import java.util.ArrayList;
import java.util.List;

public class Frame {
	private String data;
	private List<String> tags = new ArrayList<String>();
	private Double timestamp;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public Double getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Double timestamp) {
		this.timestamp = timestamp;
	}
}

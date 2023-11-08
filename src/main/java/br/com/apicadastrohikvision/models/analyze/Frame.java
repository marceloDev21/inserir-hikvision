package br.com.apicadastrohikvision.models.analyze;

import java.util.ArrayList;

public class Frame {

	private String data;
	private ArrayList<Object> tags;
	private double timestamp;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public ArrayList<Object> getTags() {
		return tags;
	}

	public void setTags(ArrayList<Object> tags) {
		this.tags = tags;
	}

	public double getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(double timestamp) {
		this.timestamp = timestamp;
	}

}

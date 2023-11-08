package br.com.apicadastrohikvision.models.analyze;

import java.util.ArrayList;

public class WorkflowData {
	private String workflow;
	private int rotation;
	private ArrayList<Frame> frames;

	public String getWorkflow() {
		return workflow;
	}

	public void setWorkflow(String workflow) {
		this.workflow = workflow;
	}

	public int getRotation() {
		return rotation;
	}

	public void setRotation(int rotation) {
		this.rotation = rotation;
	}

	public ArrayList<Frame> getFrames() {
		return frames;
	}

	public void setFrames(ArrayList<Frame> frames) {
		this.frames = frames;
	}

}

package br.com.apicadastrohikvision.models.analyze;

public class Video {
	private WorkflowData workflow_data;
	private MetaData meta_data;

	public WorkflowData getWorkflow_data() {
		return workflow_data;
	}

	public void setWorkflow_data(WorkflowData workflow_data) {
		this.workflow_data = workflow_data;
	}

	public MetaData getMeta_data() {
		return meta_data;
	}

	public void setMeta_data(MetaData meta_data) {
		this.meta_data = meta_data;
	}

}

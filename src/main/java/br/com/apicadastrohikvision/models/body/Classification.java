package br.com.apicadastrohikvision.models.body;

import java.util.ArrayList;
import java.util.List;

public class Classification {

	private List<String> pageTypes = new ArrayList<String>();

	public List<String> getPageTypes() {
		return pageTypes;
	}

	public void setPageTypes(List<String> pageTypes) {
		this.pageTypes = pageTypes;
	}
	
}

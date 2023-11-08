package br.com.apicadastrohikvision.models.body.usuario;

import java.util.ArrayList;

public class UserInfoSearchCond {

	private String searchID;
	private Integer searchResultPosition;
	private Integer maxResults;
	private ArrayList<EmployeeNoList> employeeNoList = new ArrayList<EmployeeNoList>();

	// Getter Methods

	public String getSearchID() {
		return searchID;
	}

	public float getSearchResultPosition() {
		return searchResultPosition;
	}

	public float getMaxResults() {
		return maxResults;
	}

	// Setter Methods

	public void setSearchID(String searchID) {
		this.searchID = searchID;
	}

	public void setSearchResultPosition(Integer searchResultPosition) {
		this.searchResultPosition = searchResultPosition;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public ArrayList<EmployeeNoList> getEmployeeNoList() {
		return employeeNoList;
	}

	public void setEmployeeNoList(ArrayList<EmployeeNoList> employeeNoList) {
		this.employeeNoList = employeeNoList;
	}

}

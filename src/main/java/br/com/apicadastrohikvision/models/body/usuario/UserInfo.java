package br.com.apicadastrohikvision.models.body.usuario;

import java.util.ArrayList;

public class UserInfo {

	private String employeeNo;
	private String name;
	private String userType;
	private Valid valid;
	private String doorRight;
	private ArrayList<RightPlan> rightPlan = new ArrayList<RightPlan>();

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Valid getValid() {
		return valid;
	}

	public void setValid(Valid valid) {
		this.valid = valid;
	}

	public String getDoorRight() {
		return doorRight;
	}

	public void setDoorRight(String doorRight) {
		this.doorRight = doorRight;
	}

	public ArrayList<RightPlan> getRightPlan() {
		return rightPlan;
	}

	public void setRightPlan(ArrayList<RightPlan> rightPlan) {
		this.rightPlan = rightPlan;
	}

}

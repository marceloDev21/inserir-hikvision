package br.com.apicadastrohikvision.models.response;

import br.com.apicadastrohikvision.models.body.usuario.RightPlan;
import br.com.apicadastrohikvision.models.body.usuario.Valid;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class UserInfo {

	private String employeeNo;
	private String name;
	private String userType;
	private boolean closeDelayEnabled;
	@JsonProperty("Valid")
	private Valid Valid;
	private String belongGroup;
	private String password;
	private String doorRight;
	@JsonProperty("RightPlan")
	private ArrayList<RightPlan> RightPlan = new ArrayList<RightPlan>();
	private int maxOpenDoorTime;
	private int openDoorTime;
	private int roomNumber;
	private int floorNumber;
	private boolean localUIRight;
	private String gender;
	private int numOfCard;
	private int numOfFace;
	private int numOfFP;
	@JsonProperty("PersonInfoExtends")
	private ArrayList<PersonInfoExtends> PersonInfoExtends = new ArrayList<PersonInfoExtends>();

	public String getBelongGroup() {
		return belongGroup;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMaxOpenDoorTime() {
		return maxOpenDoorTime;
	}

	public void setMaxOpenDoorTime(int maxOpenDoorTime) {
		this.maxOpenDoorTime = maxOpenDoorTime;
	}

	public int getOpenDoorTime() {
		return openDoorTime;
	}

	public void setOpenDoorTime(int openDoorTime) {
		this.openDoorTime = openDoorTime;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public boolean isLocalUIRight() {
		return localUIRight;
	}

	public void setLocalUIRight(boolean localUIRight) {
		this.localUIRight = localUIRight;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getNumOfCard() {
		return numOfCard;
	}

	public void setNumOfCard(int numOfCard) {
		this.numOfCard = numOfCard;
	}

	public int getNumOfFace() {
		return numOfFace;
	}

	public void setNumOfFace(int numOfFace) {
		this.numOfFace = numOfFace;
	}

	public ArrayList<br.com.apicadastrohikvision.models.response.PersonInfoExtends> getPersonInfoExtends() {
		return PersonInfoExtends;
	}

	public void setPersonInfoExtends(
			ArrayList<br.com.apicadastrohikvision.models.response.PersonInfoExtends> personInfoExtends) {
		PersonInfoExtends = personInfoExtends;
	}

	public void setBelongGroup(String belongGroup) {
		this.belongGroup = belongGroup;
	}

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
		return Valid;
	}

	public void setValid(Valid valid) {
		Valid = valid;
	}

	public String getDoorRight() {
		return doorRight;
	}

	public void setDoorRight(String doorRight) {
		this.doorRight = doorRight;
	}

	public ArrayList<br.com.apicadastrohikvision.models.body.usuario.RightPlan> getRightPlan() {
		return RightPlan;
	}

	public void setRightPlan(
			ArrayList<br.com.apicadastrohikvision.models.body.usuario.RightPlan> rightPlan) {
		RightPlan = rightPlan;
	}

	public boolean isCloseDelayEnabled() {
		return closeDelayEnabled;
	}

	public void setCloseDelayEnabled(boolean closeDelayEnabled) {
		this.closeDelayEnabled = closeDelayEnabled;
	}

	public int getNumOfFP() {
		return numOfFP;
	}

	public void setNumOfFP(int numOfFP) {
		this.numOfFP = numOfFP;
	}
}

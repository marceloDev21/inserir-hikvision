package br.com.apicadastrohikvision.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class UserInfoSearch {
    private String searchID ;
    private String responseStatusStrg;
    private int numOfMatches;
    private int totalMatches;
    @JsonProperty("UserInfo")
    private ArrayList<UserInfo> UserInfo = new ArrayList<UserInfo>();

    public String getSearchID() {
        return searchID;
    }

    public String getResponseStatusStrg() {
        return responseStatusStrg;
    }

    public void setResponseStatusStrg(String responseStatusStrg) {
        this.responseStatusStrg = responseStatusStrg;
    }

    public int getNumOfMatches() {
        return numOfMatches;
    }

    public void setNumOfMatches(int numOfMatches) {
        this.numOfMatches = numOfMatches;
    }

    public int getTotalMatches() {
        return totalMatches;
    }

    public void setTotalMatches(int totalMatches) {
        this.totalMatches = totalMatches;
    }

    public ArrayList<UserInfo> getUserInfo() {
        return UserInfo;
    }

    public void setUserInfo(
            ArrayList<UserInfo> userInfo) {
        UserInfo = userInfo;
    }

    public void setSearchID(String searchID) {
        this.searchID = searchID;
    }
}

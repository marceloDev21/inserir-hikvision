package br.com.apicadastrohikvision.models.body.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class UserInfoDelCond {
    @JsonProperty("EmployeeNoList")
    private List<EmployeeNoList> employeeNoList;

    public List<EmployeeNoList> getEmployeeNoList() {
        return employeeNoList;
    }

    public void setEmployeeNoList(
            List<EmployeeNoList> employeeNoList) {
        this.employeeNoList = employeeNoList;
    }
}

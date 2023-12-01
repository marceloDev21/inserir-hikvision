package br.com.apicadastrohikvision.models.body.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeletarUsuarioRequest {
    @JsonProperty("UserInfoDelCond")
    private UserInfoDelCond userInfoDelCond;

    public UserInfoDelCond getUserInfoDelCond() {
        return userInfoDelCond;
    }

    public void setUserInfoDelCond(
            UserInfoDelCond userInfoDelCond) {
        this.userInfoDelCond = userInfoDelCond;
    }
}

package br.com.apicadastrohikvision.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BuscarUsuariosResponse {
    @JsonProperty("UserInfoSearch")
    private UserInfoSearch UserInfoSearch;

    public br.com.apicadastrohikvision.models.response.UserInfoSearch getUserInfoSearch() {
        return UserInfoSearch;
    }

    public void setUserInfoSearch(
            br.com.apicadastrohikvision.models.response.UserInfoSearch userInfoSearch) {
        UserInfoSearch = userInfoSearch;
    }
}

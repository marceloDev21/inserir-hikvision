package br.com.apicadastrohikvision.models.body.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class DeletarFaceUsuarioRequest {
    @JsonProperty("FPID")
    private List<FPID> fpid;

    public List<FPID> getFpid() {
        return fpid;
    }

    public void setFpid(List<FPID> fpid) {
        this.fpid = fpid;
    }
}

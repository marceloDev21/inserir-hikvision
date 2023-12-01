package br.com.apicadastrohikvision.controllers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.apicadastrohikvision.models.body.request.DeletarUsuarioRequest;
import br.com.apicadastrohikvision.models.body.request.UserInfoDelCond;
import br.com.apicadastrohikvision.models.body.usuario.BodyGetAllUser;

import br.com.apicadastrohikvision.models.body.request.EmployeeNoList;
import br.com.apicadastrohikvision.models.body.usuario.UserInfoSearchCond;
import br.com.apicadastrohikvision.models.response.BuscarUsuariosResponse;
import br.com.apicadastrohikvision.models.response.UserInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.apache.commons.httpclient.methods.PostMethod;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import com.fasterxml.jackson.databind.ObjectMapper;
import br.com.apicadastrohikvision.config.RestTemplateBuilder;
import br.com.apicadastrohikvision.models.body.usuario.BodySetUser;
import net.coobird.thumbnailator.Thumbnails;

@RestController
@RequestMapping("api/v1/hikvision")
public class HikvisionUsuarioController {


    @PutMapping("/inserir-usuario")
    @ResponseBody
    public ResponseEntity<String> setUser(@RequestBody BodySetUser bodySetUser) {
        String url =
                "http://192.168.0.101/ISAPI/AccessControl/UserInfo/SetUp?format=json";
        HttpHeaders headers = new HttpHeaders();
        // can set the content Type
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<BodySetUser> request = new HttpEntity<>(bodySetUser, headers);

        RestTemplate restTemplate =
                RestTemplateBuilder.securityRestTemplateBuilder("admin", "connect@123");
        ResponseEntity<String> response =
                restTemplate.exchange(url, HttpMethod.PUT, request, String.class);
        return response;
    }

    @PostMapping("/buscar-todos")
    public ResponseEntity<String> buscarTodosUsuarios() {

        BodyGetAllUser bgu = new BodyGetAllUser();
        bgu.setUserInfoSearchCond(new UserInfoSearchCond());

        bgu.getUserInfoSearchCond().setSearchID("1");
        bgu.getUserInfoSearchCond().setSearchResultPosition(0);
        bgu.getUserInfoSearchCond().setMaxResults(200);
//      bgu.getUserInfoSearchCond().setEmployeeNoList(new ArrayList<EmployeeNoList>());

        String url = "http://192.168.0.123" +
                "/ISAPI/AccessControl/UserInfo/Search?format=json";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<BodyGetAllUser> request = new HttpEntity<>(bgu, headers);

        RestTemplate restTemplate =
                RestTemplateBuilder.securityRestTemplateBuilder("admin", "connect@123");

        PostMethod method = new PostMethod(url);
        // Converte o objeto para JSON
        String requestEntity = new Gson().toJson(bgu).toString();

        method.setRequestHeader("Content-Type", "application/json");
        method.setRequestBody(requestEntity);

        method.setDoAuthentication(true);
        ResponseEntity<String> response =
                restTemplate.exchange(url, HttpMethod.POST, request, String.class);

        return response;
    }

    @PostMapping("/numeros-usuarios")
    public List<String> retornaNumeroUsuarios() throws JsonMappingException,
            JsonProcessingException {


        BodyGetAllUser bgu = new BodyGetAllUser();
        bgu.setUserInfoSearchCond(new UserInfoSearchCond());

        bgu.getUserInfoSearchCond().setSearchID("1");
        bgu.getUserInfoSearchCond().setSearchResultPosition(0);
        bgu.getUserInfoSearchCond().setMaxResults(200);
//        bgu.getUserInfoSearchCond().setEmployeeNoList(new ArrayList<EmployeeNoList>());

        String url = "http://192.168.0.123" +
                "/ISAPI/AccessControl/UserInfo/Search?format=json";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<BodyGetAllUser> request = new HttpEntity<>(bgu, headers);

        RestTemplate restTemplate =
                RestTemplateBuilder.securityRestTemplateBuilder("admin", "connect@123");

        PostMethod method = new PostMethod(url);
        // Converte o objeto para JSON
        String requestEntity = new Gson().toJson(bgu).toString();

        method.setRequestHeader("Content-Type", "application/json");
        method.setRequestBody(requestEntity);

        method.setDoAuthentication(true);
        ResponseEntity<String> response =
                restTemplate.exchange(url, HttpMethod.POST, request, String.class);

        String responseBody = response.getBody();
        ObjectMapper objectMapper = new ObjectMapper();

        BuscarUsuariosResponse buscarUsuariosResponse =
                objectMapper.readValue(responseBody, BuscarUsuariosResponse.class);

        List<String> numeroDosUsuarios = new ArrayList<>();

        for (UserInfo userInfo : buscarUsuariosResponse.getUserInfoSearch()
                .getUserInfo()) {
            numeroDosUsuarios.add(userInfo.getEmployeeNo());
        }
        System.out.print("Id dos ususarios => " + numeroDosUsuarios);
        return numeroDosUsuarios;
    }

    @PostMapping("/inserir-face")
    @ResponseBody
    public ResponseEntity<String> setFace(
            @RequestParam("FaceImage") MultipartFile FaceImage,
            @RequestParam("idFace") String idFace) throws IOException {

        // Redimensiona a imagem para ficar com tamanho até 200KB
        int larguraRedimensionada = 1000;
        int alturaRedimensionada = 800;
        int tamanhoDesejadoKB = 200;

        // Cria um novo arquivo temporário para armazenar a imagem redimensionada
        File tempFile = File.createTempFile("tempImage", ".jpg");
        tempFile.deleteOnExit();

        // Redimensiona a imagem usando o Thumbnailator
        Thumbnails.of(FaceImage.getInputStream())
                .size(larguraRedimensionada, alturaRedimensionada)
                .outputFormat("jpg")
                .outputQuality(1.0) // Qualidade inicial (100%)
                .toFile(tempFile);

        // Ajusta a qualidade iterativamente até atingir o tamanho desejado
        while (tempFile.length() / 1024 > tamanhoDesejadoKB) {
            Thumbnails.of(tempFile)
                    .scale(1.0)
                    .outputQuality(0.9) // Reduz a qualidade em 10% em cada iteração
                    .toFile(tempFile);
        }


        String url =
                "http://192.168.0.101/ISAPI/Intelligent/FDLib/FaceDataRecord?format=json";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);

        LinkedMultiValueMap<String, Object> form = new LinkedMultiValueMap<>();
        form.add("FaceDataRecord",
                 "{\"faceLibType\":\"blackFD\",\"FDID\":\"1\",\"FPID\":\"" + idFace +
                         "\"}");
        form.add("FaceImage", new FileSystemResource(tempFile));

        HttpEntity<MultiValueMap<String, Object>> request =
                new HttpEntity<>(form, headers);

        RestTemplate restTemplate =
                RestTemplateBuilder.securityRestTemplateBuilder("admin", "connect@123");
        ResponseEntity<String> response =
                restTemplate.exchange(url, HttpMethod.POST, request, String.class);

        return response;
    }

    @PutMapping("/deletar")
    public ResponseEntity<String> deletarUsuario(String idUsuario) {
        String url = "http://192.168.0.123" +
                "/ISAPI/AccessControl/UserInfo/Delete?format=json";
        HttpHeaders headers = new HttpHeaders();
        // can set the content Type
        headers.setContentType(MediaType.APPLICATION_JSON);
        DeletarUsuarioRequest deletarUsuarioRequest = new DeletarUsuarioRequest();
        deletarUsuarioRequest.setUserInfoDelCond(new UserInfoDelCond());
        deletarUsuarioRequest.getUserInfoDelCond().setEmployeeNoList(new ArrayList<>());
        EmployeeNoList employeeNoList = new EmployeeNoList();
        employeeNoList.setEmployeeNo(idUsuario);
        deletarUsuarioRequest.getUserInfoDelCond().getEmployeeNoList()
                .add(employeeNoList);

        HttpEntity<DeletarUsuarioRequest> request =
                new HttpEntity<>(deletarUsuarioRequest, headers);

        RestTemplate restTemplate =
                RestTemplateBuilder.securityRestTemplateBuilder("admin", "connect@123");
        return restTemplate.exchange(url, HttpMethod.PUT, request, String.class);

    }

    @PutMapping("/deletar-todos")
    public ResponseEntity<String> deletarTodosUsuario() throws JsonProcessingException {

        List<String> idsDosUsuarios = retornaNumeroUsuarios();

        for (String idUsuario : idsDosUsuarios) {
            ResponseEntity<String> response = deletarUsuario(idUsuario);

            if (response.getStatusCode().is2xxSuccessful()) {
                System.out.println(
                        "Usuário com ID " + idUsuario + " deletado com sucesso.");
            } else {
                System.out.println("Falha ao deletar usuário com ID " + idUsuario);

            }
        }

        return ResponseEntity.ok(
                "Processo de exclusão de todos os usuarios foi concluído com sucesso.");
    }
}

package br.com.apicadastrohikvision.controllers;

import java.io.File;
import java.io.IOException;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import br.com.apicadastrohikvision.config.RestTemplateBuilder;
import br.com.apicadastrohikvision.models.body.usuario.BodySetUser;
import net.coobird.thumbnailator.Thumbnails;

@RestController
@RequestMapping("api/v1/hikvision")
public class HikvisionUsuarioController {

	@PutMapping("/inserir-usuario")
	@ResponseBody
	public ResponseEntity<String> setUser(@RequestBody BodySetUser bodySetUser) {
		String url = "http://192.168.0.101/ISAPI/AccessControl/UserInfo/SetUp?format=json";
		HttpHeaders headers = new HttpHeaders();
		// can set the content Type
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<BodySetUser> request = new HttpEntity<>(bodySetUser, headers);

		RestTemplate restTemplate = RestTemplateBuilder.securityRestTemplateBuilder("admin", "connect@123");
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.PUT, request, String.class);
		return response;
	}

	@PostMapping("/usuario")
	public ResponseEntity<String> getUser() {

//		BodyGetUser bgu = new BodyGetUser();
//		bgu.setUserInfoSearchCond(new UserInfoSearchCond());
//
//		bgu.getUserInfoSearchCond().setSearchID("1");
//		bgu.getUserInfoSearchCond().setSearchResultPosition(0);
//		bgu.getUserInfoSearchCond().setMaxResults(1);
//		bgu.getUserInfoSearchCond().setEmployeeNoList(new ArrayList<EmployeeNoList>());
//
//		EmployeeNoList enl = new EmployeeNoList();
//
//		bgu.getUserInfoSearchCond().getEmployeeNoList().add(enl);
//
//		String url = "http://192.168.0.124" + "/ISAPI/AccessControl/UserInfo/Search?format=json";
//
//		HttpClient client = new HttpClient();
//		UsernamePasswordCredentials creds = new UsernamePasswordCredentials("admin", ".Connect@123");
//		client.getState().setCredentials(AuthScope.ANY, creds);
//
//		PostMethod method = new PostMethod(url);
//		// Converte o objeto para JSON
//		String requestEntity = new Gson().toJson(bgu).toString();
//
//		method.setRequestHeader("Content-Type", "application/json");
//		method.setRequestBody(requestEntity);
//
//		method.setDoAuthentication(true);
//

		return ResponseEntity.noContent().build();
	}

	@PostMapping("/usuarios")
	public ResponseEntity<String> geUser() {

//		BodyGetAllUser bgu = new BodyGetAllUser();
//		bgu.setUserInfoSearchCond(new UserInfoSearchCond());
//
//		bgu.getUserInfoSearchCond().setSearchID("1");
//		bgu.getUserInfoSearchCond().setSearchResultPosition(0);
//		bgu.getUserInfoSearchCond().setMaxResults(1);
//		bgu.getUserInfoSearchCond().setEmployeeNoList(new ArrayList<EmployeeNoList>());
//
//		String url = "http://192.168.0.124" + "/ISAPI/AccessControl/UserInfo/Search?format=json";
//
//		HttpClient client = new HttpClient();
//		UsernamePasswordCredentials creds = new UsernamePasswordCredentials("admin", ".Connect@123");
//		client.getState().setCredentials(AuthScope.ANY, creds);
//
//		PostMethod method = new PostMethod(url);
//		// Converte o objeto para JSON
//		String requestEntity = new Gson().toJson(bgu).toString();
//
//		method.setRequestHeader("Content-Type", "application/json");
//		method.setRequestBody(requestEntity);
//
//		method.setDoAuthentication(true);
//

		return ResponseEntity.noContent().build();
	}

	@PostMapping("/inserir-face")
	@ResponseBody
	public ResponseEntity<String> setFace(@RequestParam("FaceImage") MultipartFile FaceImage, @RequestParam("idFace") String idFace) throws IOException {
		
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
		

        String url = "http://192.168.0.101/ISAPI/Intelligent/FDLib/FaceDataRecord?format=json";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);

        LinkedMultiValueMap<String, Object> form = new LinkedMultiValueMap<>();
        form.add("FaceDataRecord", "{\"faceLibType\":\"blackFD\",\"FDID\":\"1\",\"FPID\":\""+idFace+"\"}");
        form.add("FaceImage", new FileSystemResource(tempFile));

        HttpEntity<MultiValueMap<String, Object>> request = new HttpEntity<>(form, headers);

        RestTemplate restTemplate = RestTemplateBuilder.securityRestTemplateBuilder("admin", "connect@123");
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, request, String.class);

        return response;
	}

}

package br.com.apicadastrohikvision.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import br.com.apicadastrohikvision.models.body.OpenDoorBody;

@RestController()
@RequestMapping("/api/v1/raspberrypi")
public class GPIOController {

	@PostMapping("/open-door")
	public ResponseEntity<String> greeting() {

		try {

			RestTemplate restTemplate = new RestTemplate();

			OpenDoorBody body = new OpenDoorBody();
			
			String respPreface = restTemplate.postForObject("http://192.168.0.82:8080/raspberrypi/open-door", body,
					String.class);

			if (respPreface == null) {
				return ResponseEntity.notFound().build();
			}

//			return ResponseEntity.status(HttpStatus.CREATED).body(respPreface);
			return ResponseEntity.status(HttpStatus.CREATED).body(respPreface);

		} catch (HttpStatusCodeException e) {

			System.out.println(e.getMessage());
			return null;
		}

	}

}
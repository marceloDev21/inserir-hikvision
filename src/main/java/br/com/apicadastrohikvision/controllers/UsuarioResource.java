package br.com.apicadastrohikvision.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.apicadastrohikvision.models.Usuario;
import br.com.apicadastrohikvision.services.UsuarioServiceImpl;

@Component
@RestController
@RequestMapping(value = "/api/v1/usuario")
public class UsuarioResource {
	@Autowired
	private UsuarioServiceImpl usuarioService;

	@GetMapping("/all")
	public List<Usuario> getAll() {

		return usuarioService.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Usuario> getById(@Valid @PathVariable Long id) {
		Optional<Usuario> usuario = usuarioService.findById(id);
		return usuario.isPresent() ? ResponseEntity.ok(usuario.get()) : ResponseEntity.notFound().build();
	}

	@GetMapping("/cpf")
	public ResponseEntity<Usuario> getByCpf(@Valid @RequestParam String cpf) {
		Optional<Usuario> usuario = usuarioService.findByCpf(cpf);
		return usuario.isPresent() ? ResponseEntity.ok(usuario.get()) : ResponseEntity.notFound().build();
	}

	@PostMapping()
	public ResponseEntity<Usuario> inserir(@Valid @RequestBody Usuario usuario) {

		Usuario usuarioSalvo = usuarioService.incluir(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioSalvo);
	}

	@PutMapping("{id}")
	public ResponseEntity<Usuario> alterar(@PathVariable Long id, @Valid @RequestBody Usuario usuario) {

		Optional<Usuario> usuarioSalvo = usuarioService.findById(id);

		if (!usuarioSalvo.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		usuarioSalvo.get().setNome(usuario.getNome());
		Usuario usuarioEditar = usuarioService.alterar(usuarioSalvo.get());
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(usuarioEditar);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long id) {
		usuarioService.remover(id);
	}
}

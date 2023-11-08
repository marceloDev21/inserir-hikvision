package br.com.apicadastrohikvision.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.apicadastrohikvision.models.Usuario;

@Service
public interface UsuarioService {

	List<Usuario> findAll();

	Optional<Usuario> findById(Long id);

	Usuario incluir(Usuario ecesso);

	Usuario alterar(Usuario ecesso);

	void remover(Long id);
}

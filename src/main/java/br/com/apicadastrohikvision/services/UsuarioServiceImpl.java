package br.com.apicadastrohikvision.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apicadastrohikvision.models.Usuario;
import br.com.apicadastrohikvision.repositories.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	@Override
	public Optional<Usuario> findById(Long id) {

		return usuarioRepository.findById(id);
	}

	public Optional<Usuario> findByCpf(String cpf) {
		return usuarioRepository.findByCpf(cpf);
	}

	@Override
	public Usuario incluir(Usuario usuario) {

		Optional<Usuario> us = usuarioRepository.findByCpf(usuario.getCpf());
		if (us.isPresent()) {
			return us.get();
		}
		return usuarioRepository.saveAndFlush(usuario);
	}

	@Override
	public Usuario alterar(Usuario usuario) {

		return usuarioRepository.saveAndFlush(usuario);
	}

	@Override
	public void remover(Long id) {
		usuarioRepository.deleteById(id);

	}

}

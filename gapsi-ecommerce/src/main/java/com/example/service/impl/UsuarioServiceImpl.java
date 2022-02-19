package com.example.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Usuario;
import com.example.repository.UsuarioRepository;
import com.example.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario obtenerUsuario(Long lIdUsuario) {
		Optional<Usuario> u = this.usuarioRepository.findById(lIdUsuario);
		return u.isPresent() ? u.get(): null ;
	}

}

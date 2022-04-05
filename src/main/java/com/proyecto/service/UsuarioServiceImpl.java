package com.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.proyecto.entidad.Opcion;
import com.proyecto.entidad.Rol;
import com.proyecto.entidad.Usuario;
import com.proyecto.repository.UsuarioRepository;


@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public Usuario login(Usuario bean) {
		return repository.login(bean);
	}

	@Override
	public List<Opcion> traerEnlacesDeUsuario(int idUsuario) {
		return repository.traerEnlacesDeUsuario(idUsuario);
	}

	@Override
	public List<Rol> traerRolesDeUsuario(int idUsuario) {
		return repository.traerRolesDeUsuario(idUsuario);
	}

	@Override
	public Page<Usuario> findAll(Pageable pageable) {	
		return repository.findAll(pageable);
	}

	@Override
	public Usuario findById(int id) {		
		return repository.findById(id).orElse(null);
	}

	@Override
	public Usuario save(Usuario bean) {		
		return repository.save(bean);
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);		
	}

}

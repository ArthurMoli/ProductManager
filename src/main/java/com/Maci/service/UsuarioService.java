package com.Maci.service;

import com.Maci.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    public List<Usuario> findAll();
    public Optional<Usuario> findById(Long id);
    public Usuario create(Usuario newUsuario);
    public Usuario update(Usuario updatedUsuario, Long id);
    public void deleteById(Long id);
}

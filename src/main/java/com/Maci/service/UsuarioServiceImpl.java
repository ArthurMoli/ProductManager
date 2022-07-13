package com.Maci.service;

import com.Maci.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import com.Maci.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
    public class UsuarioServiceImpl implements UsuarioService{
        @Autowired
        UsuarioRepository usuarioRepository;

        @Override
    public List<Usuario> findAll() {return usuarioRepository.findAll();}
@Override
public Optional<Usuario> findById(Long id){return usuarioRepository.findById(id);}

    @Override
    public Usuario create(Usuario newUsuario) {
        return usuarioRepository.save(newUsuario);
    }
@Override
public Usuario update(Usuario updateUsuario, Long id) {
            Optional<Usuario> u = usuarioRepository.findById(id);
            if (u.isEmpty()){return null;}
            u.get().setNome(updateUsuario.getNome());
            u.get().setUsername(updateUsuario.getUsername());
            u.get().setSenha(updateUsuario.getSenha());
    return usuarioRepository.save(u.get());}

    @Override
    public void deleteById(Long id) {

    }

}

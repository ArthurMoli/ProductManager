package com.Maci.service;

import com.Maci.model.Servicos;

import java.util.List;
import java.util.Optional;

public interface ServicosService {
    public List <Servicos> findAll();
    public Optional<Servicos> findById(Long id);
    public Servicos create(Servicos newServicos);
    public Servicos update(Servicos updatedServicos, Long Id);
    public void deleteById(Long id);
}

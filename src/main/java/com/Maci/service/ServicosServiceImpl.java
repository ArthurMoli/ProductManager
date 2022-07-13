package com.Maci.service;

import com.Maci.model.Usuario;
import com.Maci.repository.ServicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicosServiceImpl implements ServicosService{
    @Autowired
    ServicosRepository servicosRepository;
    @Override
    public List<ServicosService> findAll() {return servicosRepository.findAll();}
}

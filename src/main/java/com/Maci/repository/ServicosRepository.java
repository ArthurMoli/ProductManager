package com.Maci.repository;

import com.Maci.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicosRepository extends JpaRepository <Usuario, Long> {
}

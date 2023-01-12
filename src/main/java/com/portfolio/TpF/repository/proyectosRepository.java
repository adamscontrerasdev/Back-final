package com.portfolio.TpF.repository;

import com.portfolio.TpF.model.proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface proyectosRepository extends JpaRepository <proyectos, Long> {
    
}

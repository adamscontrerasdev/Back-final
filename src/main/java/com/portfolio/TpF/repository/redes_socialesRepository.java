package com.portfolio.TpF.repository;

import com.portfolio.TpF.model.redes_sociales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface redes_socialesRepository extends JpaRepository <redes_sociales, Long> {
    
}


package com.portfolio.TpF.repository;

import com.portfolio.TpF.model.experiencias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface experienciasRepository extends JpaRepository <experiencias, Long> {
    
}

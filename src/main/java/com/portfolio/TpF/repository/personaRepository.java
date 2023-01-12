
package com.portfolio.TpF.repository;

import com.portfolio.TpF.model.persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository 
public interface personaRepository extends JpaRepository <persona, Long> {

   
    
}

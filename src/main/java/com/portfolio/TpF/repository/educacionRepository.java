
package com.portfolio.TpF.repository;


import com.portfolio.TpF.model.educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface educacionRepository extends JpaRepository <educacion, Long>  {
    
}

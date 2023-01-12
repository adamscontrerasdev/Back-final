package com.portfolio.TpF.repository;

import com.portfolio.TpF.model.hard_skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface hard_skillsRepository extends JpaRepository <hard_skills, Long> {
    
}

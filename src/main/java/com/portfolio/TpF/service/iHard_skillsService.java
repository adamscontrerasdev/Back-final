package com.portfolio.TpF.service;

import com.portfolio.TpF.model.hard_skills;
import java.util.List;


public interface iHard_skillsService {
    
    public List<hard_skills> verHSkill();

    public void crearHSkill(hard_skills haskill);

    public void borrarHSkill(Long id);

    public hard_skills buscarHSkill(Long id);

    public void editarHSkill(hard_skills haskill);

}

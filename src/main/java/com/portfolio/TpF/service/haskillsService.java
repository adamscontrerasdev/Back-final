package com.portfolio.TpF.service;

import com.portfolio.TpF.model.hard_skills;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.TpF.repository.hard_skillsRepository;

@Service
public class haskillsService implements iHard_skillsService {

  
    @Autowired
    public hard_skillsRepository haRepo;

    @Override
    public List<hard_skills> verHSkill() {
        return haRepo.findAll();
    }

    @Override
    public void crearHSkill(hard_skills hskill) {
        haRepo.save(hskill);
    }

    @Override
    public void borrarHSkill(Long id) {
        haRepo.deleteById(id);
    }

    @Override
    public hard_skills buscarHSkill(Long id) {
        return haRepo.findById(id).orElse(null);
    }

    @Override
    public void editarHSkill(hard_skills skill) {
        haRepo.save(skill);
    }

}

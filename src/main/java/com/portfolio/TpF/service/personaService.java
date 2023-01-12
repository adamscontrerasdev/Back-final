package com.portfolio.TpF.service;

import com.portfolio.TpF.model.persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.TpF.repository.personaRepository;

@Service
public class personaService implements iPersonaService {

    @Autowired
    public personaRepository persoRepo;

    @Override
    public List<persona> verPersonas() {
        return persoRepo.findAll();
    }

        @Override
    public void crearPersona(persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public void editarPersona(persona per) {
        persoRepo.save(per);
    }
}


package com.portfolio.TpF.service;

import com.portfolio.TpF.model.experiencias;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.TpF.repository.experienciasRepository;

@Service
public class experienciaslaboralesService implements iExpercienciasService {

    @Autowired
    public experienciasRepository expeRepo;

    @Override
    public List<experiencias> verExperiencias() {
        return expeRepo.findAll();
    }

    @Override
    public void crearExperiencia(experiencias exp) {
        expeRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expeRepo.deleteById(id);
    }

    @Override
    public experiencias buscarExperiencia(Long id) {
        return expeRepo.findById(id).orElse(null);
    }

    @Override
    public void editarExperiencia(experiencias per) {
        expeRepo.save(per);
    }

}

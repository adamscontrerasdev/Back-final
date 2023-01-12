package com.portfolio.TpF.service;

import com.portfolio.TpF.model.redes_sociales;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.TpF.repository.redes_socialesRepository;


@Service
public class redes_socialesService implements iRedes_socialesService {

    @Autowired
    public redes_socialesRepository sofRepo;

    @Override
    public List<redes_sociales> verSSkill() {
        return sofRepo.findAll();
    }

    @Override
    public void crearSSkill(redes_sociales per) {
        sofRepo.save(per);
    }

    @Override
    public void borrarSSkill(Long id) {
        sofRepo.deleteById(id);
    }

    @Override
    public redes_sociales buscarSSkill(Long id) {
        return sofRepo.findById(id).orElse(null);
    }

    @Override
    public void editarSSkill(redes_sociales per) {
        sofRepo.save(per);
    }

}

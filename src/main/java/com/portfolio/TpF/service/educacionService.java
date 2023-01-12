package com.portfolio.TpF.service;

import com.portfolio.TpF.model.educacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.TpF.repository.educacionRepository;

@Service
public class educacionService implements iEducacionService {

    @Autowired
    public educacionRepository estuRepo;

    @Override
    public List<educacion> verEstudio() {
        return estuRepo.findAll();
    }

    @Override
    public void crearEstudio(educacion per) {
        estuRepo.save(per);
    }

    @Override
    public void borrarEstudio(Long id) {
        estuRepo.deleteById(id);
    }

    @Override
    public educacion buscarEstudio(Long id) {
        return estuRepo.findById(id).orElse(null);
    }

    @Override
    public void editarEstudio(educacion per) {
        estuRepo.save(per);
    }

}

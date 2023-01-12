package com.portfolio.TpF.service;

import com.portfolio.TpF.model.proyectos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.TpF.repository.proyectosRepository;

@Service
public class proyectosService  implements iProyectosService{
    
    @Autowired
    public proyectosRepository proRepo;

    @Override
    public List<proyectos> verproyectos() {
        return proRepo.findAll();
    }

    @Override
    public void crearproyecto(proyectos pro) {
        proRepo.save(pro);
    }

    @Override
    public void borrarproyecto(Long id) {
        proRepo.deleteById(id);
    }

    @Override
    public proyectos buscarproyecto(Long id) {
        return proRepo.findById(id).orElse(null);
    }

    @Override
    public void editarproyecto(proyectos pro) {
        proRepo.save(pro);
    }
}

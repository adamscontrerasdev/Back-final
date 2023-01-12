package com.portfolio.TpF.service;

import com.portfolio.TpF.model.proyectos;
import java.util.List;


public interface iProyectosService {
    
        public List<proyectos> verproyectos();

    public void crearproyecto(proyectos pro);

    public void borrarproyecto(Long id);

    public proyectos buscarproyecto(Long id);

    public void editarproyecto(proyectos pro);

}

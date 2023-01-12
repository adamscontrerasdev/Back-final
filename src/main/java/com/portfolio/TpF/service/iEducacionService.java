package com.portfolio.TpF.service;

import com.portfolio.TpF.model.educacion;
import java.util.List;


public interface iEducacionService {
    public List<educacion> verEstudio();

    public void crearEstudio(educacion per);

    public void borrarEstudio(Long id);

    public educacion buscarEstudio(Long id);

    public void editarEstudio(educacion per);

}

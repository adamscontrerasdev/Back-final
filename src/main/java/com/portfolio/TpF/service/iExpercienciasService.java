
package com.portfolio.TpF.service;

import com.portfolio.TpF.model.experiencias;
import java.util.List;


public interface iExpercienciasService {
    
    
      public List<experiencias> verExperiencias();

    public void crearExperiencia(experiencias exp);

    public void borrarExperiencia(Long id);

    public experiencias buscarExperiencia(Long id);

    public void editarExperiencia(experiencias per);
}

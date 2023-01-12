package com.portfolio.TpF.service;

import com.portfolio.TpF.model.persona;
import java.util.List;

public interface iPersonaService {

    public List<persona> verPersonas();

    public void crearPersona(persona per);

    public void borrarPersona(Long id);

    public persona buscarPersona(Long id);

    public void editarPersona(persona per);

}

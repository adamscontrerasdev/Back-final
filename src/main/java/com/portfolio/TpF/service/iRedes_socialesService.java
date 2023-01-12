package com.portfolio.TpF.service;

import com.portfolio.TpF.model.redes_sociales;
import java.util.List;

public interface iRedes_socialesService {

    public List<redes_sociales> verSSkill();

    public void crearSSkill(redes_sociales per);

    public void borrarSSkill(Long id);

    public redes_sociales buscarSSkill(Long id);

    public void editarSSkill(redes_sociales per);

}

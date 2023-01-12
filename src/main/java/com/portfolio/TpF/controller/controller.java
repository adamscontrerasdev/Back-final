package com.portfolio.TpF.controller;

import com.portfolio.TpF.model.persona;
import com.portfolio.TpF.model.educacion;
import com.portfolio.TpF.model.experiencias;
import com.portfolio.TpF.model.hard_skills;
import com.portfolio.TpF.model.proyectos;
import com.portfolio.TpF.model.redes_sociales;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.TpF.service.iProyectosService;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.portfolio.TpF.service.iPersonaService;
import com.portfolio.TpF.service.iEducacionService;
import com.portfolio.TpF.service.iExpercienciasService;
import com.portfolio.TpF.service.iHard_skillsService;
import com.portfolio.TpF.service.iRedes_socialesService;

@RestController
@CrossOrigin
public class controller {

    @Autowired
    private iPersonaService persoser;
    @Autowired
    private iExpercienciasService expeser;
    @Autowired
    private iEducacionService estuser;

    @Autowired
    private iHard_skillsService hardser;
    @Autowired
    private iProyectosService proyecser;
    @Autowired
    private iRedes_socialesService redes;

    @PostMapping("/new/persona")
    public void agregarPersonas(@RequestBody persona perso) {
        persoser.crearPersona(perso);
    }

    @PutMapping("/edit/persona")
    public void editarPersonas(@RequestBody persona perso) {
        persoser.editarPersona(perso);
    }

    @GetMapping("/ver/personas")
    @ResponseBody
    public List<persona> verPersonas() {
        return persoser.verPersonas();
    }

    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id) {
        persoser.borrarPersona(id);
    }

    @GetMapping("/buscar/{id}")
    public persona buscarPersona(@PathVariable Long id) {
        return persoser.buscarPersona(id);
    }

    @PutMapping("/editar/{id}")
    public void editarPersona(@PathVariable Long id,
            @RequestParam String newnombre) {

        persona perso = persoser.buscarPersona(id);

        perso.setNombre(newnombre);

        persoser.editarPersona(perso);
    }
//EXPERIENCIA

    @GetMapping("/ver/experiencia")
    @ResponseBody
    public List<experiencias> verexperiencia() {
        return expeser.verExperiencias();
    }

    @PutMapping("/edit/experiencia")
    public void editarExperiencia(@RequestBody experiencias exp) {
        expeser.editarExperiencia(exp);
    }

    @GetMapping("/buscar/exp/{id}")
    public experiencias buscarExp(@PathVariable Long id) {
        return expeser.buscarExperiencia(id);
    }

    @PostMapping("/new/exp")
    public void agregarExp(@RequestBody experiencias exp) {
        expeser.crearExperiencia(exp);
    }

    @DeleteMapping("/borrar/exp/{id}")
    public void borrarExp(@PathVariable Long id) {
        expeser.borrarExperiencia(id);
    }
//-----------------------------------------------------------
//EDUCACION

    @GetMapping("/ver/educacion")
    @ResponseBody
    public List<educacion> verEstudio() {
        return estuser.verEstudio();
    }

    @PutMapping("/edit/educacion")
    public void editarEducacion(@RequestBody educacion exp) {
        estuser.editarEstudio(exp);
    }

    @GetMapping("/buscar/edu/{id}")
    public educacion buscarEdu(@PathVariable Long id) {
        return estuser.buscarEstudio(id);
    }

    @PostMapping("/new/educacion")
    public void agregarEdu(@RequestBody educacion exp) {
        estuser.crearEstudio(exp);
    }

    @DeleteMapping("/borrar/edu/{id}")
    public void borrarEdu(@PathVariable Long id) {
        estuser.borrarEstudio(id);
    }
//------------------------------------------------------
//HADRSKILLSS

    @GetMapping("/ver/hardskill")
    @ResponseBody
    public List<hard_skills> verHSkill() {
        return hardser.verHSkill();
    }


    @PutMapping("/edit/hard")
    public void editarHard(@RequestBody hard_skills skill) {
        hardser.editarHSkill(skill);
    }

    @GetMapping("/buscar/hard/{id}")
    public hard_skills buscarHard(@PathVariable Long id) {
        return hardser.buscarHSkill(id);
    }

    @PostMapping("/new/hard")
    public void agregarHard(@RequestBody hard_skills skill) {
       hardser.crearHSkill(skill);
    }

    @DeleteMapping("/borrar/hard/{id}")
    public void borrarHard(@PathVariable Long id) {
        hardser.borrarHSkill(id);
    }
//--------------------------------------------------------
    //PROYECTOS

    @GetMapping("/ver/proyectos")
    @ResponseBody
    public List<proyectos> verProyecto() {
        return proyecser.verproyectos();
    }
    
        @PutMapping("/edit/pro")
    public void editarPro(@RequestBody proyectos skill) {
        proyecser.editarproyecto(skill);
    }

    @GetMapping("/buscar/pro/{id}")
    public proyectos buscarPro(@PathVariable Long id) {
        return proyecser.buscarproyecto(id);
    }

    @PostMapping("/new/pro")
    public void agregarPro(@RequestBody proyectos pro) {
       proyecser.crearproyecto(pro);
    }

    @DeleteMapping("/borrar/pro/{id}")
    public void borrarPro(@PathVariable Long id) {
       proyecser.borrarproyecto(id);
    }
    
        @GetMapping("/ver/redes")
    @ResponseBody
    public List<redes_sociales> redesVer() {
        return redes.verSSkill();
    }


}



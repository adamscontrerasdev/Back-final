package com.portfolio.TpF.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class proyectos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre_proyecto;
    private String descripcion;
    private String url_pagina;
    private String imagen;
    private long persona_id;

    public proyectos(long id, String nombre_proyecto, String descripcion, String url_pagina, String imagen, int persona_id) {
        this.id = id;
        this.nombre_proyecto = nombre_proyecto;
        this.descripcion = descripcion;
        this.url_pagina = url_pagina;
        this.imagen = imagen;
        this.persona_id = persona_id;
    }
    
    





    public proyectos() {
    }

}

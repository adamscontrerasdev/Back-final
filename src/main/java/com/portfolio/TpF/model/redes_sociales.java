package com.portfolio.TpF.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class redes_sociales {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String url_red;
    private String persona_id;


    public redes_sociales() {
    }

    public redes_sociales(long id, String nombre, String url_red, String persona_id) {
        this.id = id;
        this.nombre = nombre;
        this.url_red = url_red;
        this.persona_id = persona_id;
    }




}

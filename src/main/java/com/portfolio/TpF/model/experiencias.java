package com.portfolio.TpF.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class experiencias {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String imagen;
    private String nombre_de_experiencia;
    private String descripcion_rapida;
    private String persona_id;


    public experiencias() {
    }

    public experiencias(long id, String iamgen, String nombre_de_experiencia, String descripcion_rapida, String persona_id) {
        this.id = id;
        this.imagen = iamgen;
        this.nombre_de_experiencia = nombre_de_experiencia;
        this.descripcion_rapida = descripcion_rapida;
        this.persona_id = persona_id;
    }
    
    
  


}

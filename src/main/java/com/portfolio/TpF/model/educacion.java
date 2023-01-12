package com.portfolio.TpF.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter 
public class educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String imagen;
    private String instituto;
    private String descripcion_rapida;
    private String persona_id;
    private String img_instituto;

    public educacion() {
    }

    public educacion(long id, String imagen, String instituto, String descripcion_rapida, String persona_id, String img_instituto) {
        this.id = id;
        this.imagen = imagen;
        this.instituto = instituto;
        this.descripcion_rapida = descripcion_rapida;
        this.persona_id = persona_id;
        this.img_instituto = img_instituto;
    }


    
}

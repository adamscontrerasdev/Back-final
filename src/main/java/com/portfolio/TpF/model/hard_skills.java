
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

public class hard_skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String tecnologia;
    private String porcentaje;
    private String color;
    private String color_secundario;
    private String persona_id;

    public hard_skills() {
    }

    public hard_skills(long id, String tecnologia, String porcentaje, String color, String color_secundario, String persona_id) {
        this.id = id;
        this.tecnologia = tecnologia;
        this.porcentaje = porcentaje;
        this.color = color;
        this.color_secundario = color_secundario;
        this.persona_id = persona_id;
    }
    
    
    
    
    
}

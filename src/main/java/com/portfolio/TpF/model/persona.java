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

public class persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;
    private int telefono;
    private String fecha_nacimiento;
    private String perfil_url;
    private String titulo;
    private String banner_url;
    private String sobre_mi;

    public persona(long id, String nombre, String apellido, String correo, String contraseña, int telefono, String fecha_nacimiento, String perfil_url, String titulo, String banner_url, String sobre_mi) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.perfil_url = perfil_url;
        this.titulo = titulo;
        this.banner_url = banner_url;
        this.sobre_mi = sobre_mi;
    }


    


    public persona() {
    }

}

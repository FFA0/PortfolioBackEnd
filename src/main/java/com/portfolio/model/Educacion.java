
package com.portfolio.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Basic
    @Column(name = "nombreEdu", nullable = false)
    private String nombre;
    @Column(name = "descripcionEdu", nullable = false)
    private String descripcion;
    @Column(name = "urlEdu")
    private String url;
    
    @ManyToOne
    @JsonBackReference
    private Persona persona;

    public Educacion() {}

    public Educacion(Long id, String nombre, String descripcion, 
                     String url, Persona persona) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.url = url;
        this.persona = persona;
    }      
}

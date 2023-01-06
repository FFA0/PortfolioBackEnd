
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
public class Tecnologia {
    @Id    
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Basic
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "porcentaje", nullable = false)
    private int porcentaje;

    @ManyToOne
    @JsonBackReference
    private Persona persona;

    public Tecnologia() {
    }

    public Tecnologia(Long id, String nombre, int porcentaje, Persona persona) {
        this.id = id;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.persona = persona;
    }
}

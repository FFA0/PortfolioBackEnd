
package com.portfolio.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Localidad {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Basic
    @Column(name = "Localidad")
    private String Localidad;
    
    public Localidad() {
    }   

    public Localidad(Long id, String Localidad) {
        this.id = id;
        this.Localidad = Localidad;
    }
}

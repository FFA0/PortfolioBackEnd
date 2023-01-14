
package com.portfolio.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Basic
    @Column(name = "nombrePro", nullable = false)
    private String nombre;
    @Column(name = "descripcionPro", nullable = false)
    private String descripcion;
    @Column(name = "fechaInicio", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "fechaFinal", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaFinal;
    @Column(name = "urlProyecto")
    private String urlProyecto;
    
    
    @ManyToOne
    @JsonBackReference
    private Persona persona;

    public Proyecto() {
    }

    public Proyecto(Long id, String nombre, String descripcion, Date fechaInicio, 
                    Date fechaFinal, Persona persona) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }
}

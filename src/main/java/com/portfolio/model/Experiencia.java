
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
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Basic
    @Column(name = "tituloPuesto", nullable = false)
    private String tituloPuesto;
    @Column(name = "empresa", nullable = false)
    private String empresa;
    @Column(name = "trabajoActual", nullable = false)
    private boolean trabajoActual;
    @Column(name = "actividad", nullable = false)
    private String actividad;
    @Column(name = "fechaInicio", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "fechaFinal", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaFinal;
    @Column(name = "url")
    private String urlFoto;
    
    @ManyToOne
    @JsonBackReference
    private Persona persona;
    
    @ManyToOne
    private TipoEmpleo tipo;
          
    public Experiencia() {
    }  

    public Experiencia(Long id, String tituloPuesto, String empresa, 
                       boolean trabajoActual, String actividad, 
                       Date fechaInicio, Date fechaFinal, String urlFoto, 
                       Persona persona, TipoEmpleo tipo) {
        this.id = id;
        this.tituloPuesto = tituloPuesto;
        this.empresa = empresa;
        this.trabajoActual = trabajoActual;
        this.actividad = actividad;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.urlFoto = urlFoto;
        this.persona = persona;
        this.tipo = tipo;
    }

    
}

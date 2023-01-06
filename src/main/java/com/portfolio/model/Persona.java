
package com.portfolio.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Basic
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "apellido", nullable = false)
    private String apellido;
    @Column(name = "titulo", nullable = false)
    private String titulo;
    @Column(name = "acerca", nullable = false)
    private String acerca;
    @Column(name = "urlFoto")
    private String urlFoto;
    @Column(name = "urlBanner")
    private String urlBanner;
    @Column(name = "usuario", nullable = false)
    private String usuario;
    @Column(name = "contrasena", nullable = false)
    private String contrasena;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    @JsonManagedReference
    private List<Educacion> listaEducacion;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    @JsonManagedReference
    private List<Experiencia> listaExperiencia;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    @JsonManagedReference
    private List<Proyecto> listaProyecto;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    @JsonManagedReference
    private List<Tecnologia> listaTecnologia;
    
    @ManyToOne
    private Localidad localidad;
    
    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String titulo, 
                    String acerca, String urlFoto, String urlBanner, 
                    String usuario, String contrasena, 
                    List<Educacion> listaEducacion, 
                    List<Experiencia> listaExperiencia, 
                    List<Proyecto> listaProyecto, 
                    List<Tecnologia> listaTecnologia, Localidad localidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.acerca = acerca;
        this.urlFoto = urlFoto;
        this.urlBanner = urlBanner;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.listaEducacion = listaEducacion;
        this.listaExperiencia = listaExperiencia;
        this.listaProyecto = listaProyecto;
        this.listaTecnologia = listaTecnologia;
        this.localidad = localidad;
    }

    
}

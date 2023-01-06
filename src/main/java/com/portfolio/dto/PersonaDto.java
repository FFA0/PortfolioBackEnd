
package com.portfolio.dto;

import com.portfolio.model.Educacion;
import com.portfolio.model.Experiencia;
import com.portfolio.model.Localidad;
import com.portfolio.model.Proyecto;
import com.portfolio.model.Tecnologia;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonaDto {
    
    private Long id;
    private String nombre;
    private String apellido;
    private String titulo;
    private String acerca;
    private String urlFoto;
    private List<Educacion> listaEducacion;
    private List<Experiencia> listaExperiencia;
    private List<Proyecto> listaProyecto;
    private List<Tecnologia> listaTecnologia;
    private Localidad localidad;

    public PersonaDto() {
    }
    
    public PersonaDto(Long id, String nombre, String apellido, String titulo, 
                      String acerca, String urlFoto, 
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
        this.listaEducacion = listaEducacion;
        this.listaExperiencia = listaExperiencia;
        this.listaProyecto = listaProyecto;
        this.listaTecnologia = listaTecnologia;
        this.localidad = localidad;
    }

    
}

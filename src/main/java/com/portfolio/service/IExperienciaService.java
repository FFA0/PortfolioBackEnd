
package com.portfolio.service;

import com.portfolio.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    public Experiencia crearExperiencia(Experiencia exp);
    
    public List<Experiencia> traerLista();
    
    public void editarExperiencia(Long id, Experiencia exp);
    
    public void eliminarExperiencia(Long id);
}

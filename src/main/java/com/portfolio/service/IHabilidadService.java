
package com.portfolio.service;

import com.portfolio.model.Habilidad;
import java.util.List;


public interface IHabilidadService {
    public Habilidad crearTecnologia(Habilidad hab);
    
    public List<Habilidad> traerLista();
    
    public void editarTecnologia(Long id, Habilidad hab);
    
    public void eliminarTecnologia(Long id);
}

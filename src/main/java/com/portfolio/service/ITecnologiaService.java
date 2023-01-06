
package com.portfolio.service;

import com.portfolio.model.Tecnologia;
import java.util.List;


public interface ITecnologiaService {
    public Tecnologia crearTecnologia(Tecnologia tec);
    
    public List<Tecnologia> traerLista();
    
    public void editarTecnologia(Long id, Tecnologia tec);
    
    public void eliminarTecnologia(Long id);
}

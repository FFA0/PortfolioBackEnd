
package com.portfolio.service;

import com.portfolio.model.Educacion;
import java.util.List;


public interface IEducacionService {
    public Educacion crearEducacion(Educacion edu);
    
    public List<Educacion> traerLista();    
       
    public void editarEducacion(Long id, Educacion edu);
    
    public void eliminarEducacion(Long id);
}

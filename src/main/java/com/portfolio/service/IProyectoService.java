
package com.portfolio.service;

import com.portfolio.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    public Proyecto crearProyecto(Proyecto pro);
    
    public List<Proyecto> traerLista();
    
    public void editarProyecto(Long id, Proyecto pro);
    
    public void eliminarProyecto(Long id);

}

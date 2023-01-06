
package com.portfolio.service;

import com.portfolio.model.Localidad;
import java.util.List;


public interface ILocalidadService {
    public void crearDomicilio(Localidad dom);
    
    public List<Localidad> traerLista();
        
    public void editarDomicilio(Long id, Localidad dom);
    
    public void eliminarDomicilio(Long id);
}

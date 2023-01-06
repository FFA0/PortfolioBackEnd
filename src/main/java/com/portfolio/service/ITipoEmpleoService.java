
package com.portfolio.service;

import com.portfolio.model.TipoEmpleo;
import java.util.List;


public interface ITipoEmpleoService {
    public void crearTipoEmpleo(TipoEmpleo tipo);
    
    public List<TipoEmpleo> traerLista();
    
    public void editarTipoEmpleo(Long id, TipoEmpleo tipo);
    
    public void eliminarTipo(Long id);
}

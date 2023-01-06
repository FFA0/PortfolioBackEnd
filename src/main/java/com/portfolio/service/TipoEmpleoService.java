
package com.portfolio.service;

import com.portfolio.model.TipoEmpleo;
import com.portfolio.repository.TipoEmpleoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class TipoEmpleoService implements ITipoEmpleoService{
    
    @Autowired
    private TipoEmpleoRepository tipoRepo;
    
    @Override
    public void crearTipoEmpleo(TipoEmpleo tipo){
        tipoRepo.save(tipo);
    }
    
    @Override
    public List<TipoEmpleo> traerLista(){
        return tipoRepo.findAll();
    }
    
    @Override
    public void editarTipoEmpleo(Long id, TipoEmpleo tipo){
        TipoEmpleo t = tipoRepo.findById(id).get();
        
        t.setTipo(tipo.getTipo());
        
        tipoRepo.save(t);
    }
    
    @Override
    public void eliminarTipo(Long id){
        tipoRepo.deleteById(id);
    }
}

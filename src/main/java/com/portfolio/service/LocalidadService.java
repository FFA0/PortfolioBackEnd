
package com.portfolio.service;

import com.portfolio.model.Localidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.repository.LocalidadRepository;

@Service
public class LocalidadService implements ILocalidadService{
    
    @Autowired
    private LocalidadRepository locaRepo;
    
    @Override
    public void crearDomicilio(Localidad loc){
        locaRepo.save(loc);
    }
    
    @Override
    public List<Localidad> traerLista(){
        return locaRepo.findAll();
    }
    
    @Override
    public void editarDomicilio(Long id, Localidad loc){
        Localidad d = locaRepo.findById(id).get();
        
        d.setLocalidad(loc.getLocalidad());
        
        locaRepo.save(d);
    }
    
    @Override
    public void eliminarDomicilio(Long id){
        locaRepo.deleteById(id);
    }
}


package com.portfolio.service;

import com.portfolio.model.Habilidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.repository.HabilidadRepository;

@Service
public class HabilidadService implements IHabilidadService{
    @Autowired
    private HabilidadRepository tecnoRepo;
    
    @Override
    public Habilidad crearTecnologia(Habilidad hab){
        return tecnoRepo.save(hab);
    }
    
    @Override
    public List<Habilidad> traerLista(){
        return tecnoRepo.findAll();
    }
    
    @Override
    public void editarTecnologia(Long id, Habilidad hab){
        Habilidad t = tecnoRepo.findById(id).get();
        
        t.setNombre(hab.getNombre());
        t.setPorcentaje(hab.getPorcentaje());
        
        tecnoRepo.save(t);
    }
    
    @Override
    public void eliminarTecnologia(Long id){
        tecnoRepo.deleteById(id);
    }
}

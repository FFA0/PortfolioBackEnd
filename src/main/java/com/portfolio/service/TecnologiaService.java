
package com.portfolio.service;

import com.portfolio.model.Tecnologia;
import com.portfolio.repository.TecnologiaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiaService implements ITecnologiaService{
    @Autowired
    private TecnologiaRepository tecnoRepo;
    
    @Override
    public Tecnologia crearTecnologia(Tecnologia tec){
        return tecnoRepo.save(tec);
    }
    
    @Override
    public List<Tecnologia> traerLista(){
        return tecnoRepo.findAll();
    }
    
    @Override
    public void editarTecnologia(Long id, Tecnologia tec){
        Tecnologia t = tecnoRepo.findById(id).get();
        
        t.setNombre(tec.getNombre());
        t.setPorcentaje(tec.getPorcentaje());
        
        tecnoRepo.save(t);
    }
    
    @Override
    public void eliminarTecnologia(Long id){
        tecnoRepo.deleteById(id);
    }
}

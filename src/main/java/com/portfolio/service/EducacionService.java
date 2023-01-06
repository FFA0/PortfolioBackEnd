
package com.portfolio.service;

import com.portfolio.model.Educacion;
import com.portfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    private EducacionRepository eduRepo;
    
    @Override
    public Educacion crearEducacion(Educacion edu){
        return eduRepo.save(edu);
    }
    
    @Override
    public List<Educacion> traerLista(){
        return eduRepo.findAll();
    }
    
    @Override
    public void editarEducacion(Long id,Educacion edu){
       Educacion ed = eduRepo.findById(id).get();
       
       ed.setDescripcion(edu.getDescripcion());
       ed.setNombre(edu.getNombre());       
       ed.setUrl(edu.getUrl());       
       
       eduRepo.save(ed);
    }
    
    @Override
    public void eliminarEducacion(Long id){
        eduRepo.deleteById(id);
    }
}

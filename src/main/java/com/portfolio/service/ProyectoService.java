
package com.portfolio.service;

import com.portfolio.model.Proyecto;
import com.portfolio.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    
    @Autowired
    private ProyectoRepository proRepo;
    
    @Override
    public Proyecto crearProyecto(Proyecto pro){
       return proRepo.save(pro);
    }
    
    @Override
    public List<Proyecto> traerLista(){
        return proRepo.findAll();
    }
    
    @Override
    public void editarProyecto(Long id, Proyecto pro){
        Proyecto p = proRepo.findById(id).get();
        
        p.setNombre(pro.getNombre());
        p.setDescripcion(pro.getDescripcion());
        p.setFecha(pro.getFecha());
        
        proRepo.save(p);
    }
    
    @Override
    public void eliminarProyecto(Long id){
        proRepo.deleteById(id);
    }        
}

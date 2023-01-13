
package com.portfolio.service;

import com.portfolio.dto.PersonaDto;
import com.portfolio.model.Persona;
import com.portfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    private PersonaRepository persRepo;
    
    @Override
    public void crearPersona(Persona pers){
        persRepo.save(pers);
    }   
    
    @Override
    public List<Persona> traerLista(){
        return persRepo.findAll();
    }
    
    @Override
    public void editarPersona(Long id, PersonaDto pers){
       Persona per = persRepo.findById(id).get();
       
       per.setNombre(pers.getNombre());
       per.setApellido(pers.getApellido());
       per.setTitulo(pers.getTitulo());
       per.setAcerca(pers.getAcerca());
       per.setUrlFoto(pers.getUrlFoto());       
       per.setLocalidad(pers.getLocalidad());
       per.setUrlBanner(pers.getUrlBanner());       
       
       persRepo.save(per);
    }
    
    @Override
    public void eliminarPersona(Long id){
        persRepo.deleteById(id);
    }
    
    @Override
    public Persona encontrarPersona(Long id){
        return persRepo.findById(id).orElse(null);
    }
    
    @Override
    public PersonaDto login(String usuario, String contrasena){
        Persona per = persRepo.findByUsuarioAndContrasena(usuario, contrasena);
        
        PersonaDto perDto = new PersonaDto(
                                         per.getId(),
                                         per.getNombre(), 
                                         per.getApellido(), 
                                         per.getTitulo(), 
                                         per.getAcerca(), 
                                         per.getUrlFoto(),
                                         per.getUrlBanner(),
                                         per.getListaEducacion(),
                                         per.getListaExperiencia(),
                                         per.getListaProyecto(),
                                         per.getListaTecnologia(),
                                         per.getLocalidad()
                                    );
        
        return perDto;
        
    }
}

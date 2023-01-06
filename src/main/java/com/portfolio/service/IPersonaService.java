
package com.portfolio.service;

import com.portfolio.dto.PersonaDto;
import com.portfolio.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public void crearPersona(Persona pers);
    
    public List<Persona> traerLista();
    
    public void editarPersona(Long id, PersonaDto pers);
    
    public void eliminarPersona(Long id);
    
    public Persona encontrarPersona(Long id);
    
    public PersonaDto login(String usuario, String contrasena);
}

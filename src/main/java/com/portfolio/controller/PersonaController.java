
package com.portfolio.controller;

import com.portfolio.dto.Login;
import com.portfolio.dto.PersonaDto;
import com.portfolio.model.Persona;
import com.portfolio.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://portfolio-5166b.web.app")
public class PersonaController {
    
    @Autowired
    private IPersonaService IPersServ;
    
    @PostMapping("/persona/crear")
    public void crearPersona(@RequestBody Persona pers){
        IPersServ.crearPersona(pers);
    }
    
    @PutMapping("/persona/editar/{id}")
    public void editarPersona(@PathVariable Long id, @RequestBody PersonaDto pers){
         IPersServ.editarPersona(id, pers);
    }
    
    @GetMapping("/persona/lista")
    @ResponseBody
    public List<Persona> traerLista(){
        return IPersServ.traerLista();
    }
    
    @DeleteMapping("/persona/eliminar/{id}")
    public void eliminarPersona(@PathVariable Long id){
        IPersServ.eliminarPersona(id);
    }
    
    @GetMapping("persona/encontrar/{id}")
    @ResponseBody
    public Persona encontrarPersona(@PathVariable Long id){
        return IPersServ.encontrarPersona(id);
    }
    
    @PostMapping("persona/login")
    @ResponseBody
    public PersonaDto login(@RequestBody Login log){
        return IPersServ.login(log.getUsuario(), 
                               log.getContrasena());
    }
}

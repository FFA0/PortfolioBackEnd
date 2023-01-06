
package com.portfolio.controller;

import com.portfolio.model.Experiencia;
import com.portfolio.service.IExperienciaService;
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
public class ExperienciaController {
    @Autowired
    private IExperienciaService iExpServ;
    
    @PostMapping("/experiencia/crear")
    public Experiencia crearExperiencia(@RequestBody Experiencia exp){
        return iExpServ.crearExperiencia(exp);
    }
    
    @PutMapping("/experiencia/editar/{id}")
    public void editarExp(@PathVariable Long id, @RequestBody Experiencia exp){
        iExpServ.editarExperiencia(id, exp);
    }
    
    @GetMapping("/experiencia/lista")
    @ResponseBody
    public List<Experiencia> traerLista(){
        return iExpServ.traerLista();
    }
    
    @DeleteMapping("/experiencia/eliminar/{id}")
    public void eliminarExperiencia(@PathVariable Long id){
        iExpServ.eliminarExperiencia(id);
    }
}

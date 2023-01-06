
package com.portfolio.controller;

import com.portfolio.model.Educacion;
import com.portfolio.service.IEducacionService;
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
public class EducacionController {
    
    @Autowired
    private IEducacionService IEduServ;
    
    @PostMapping("/educacion/crear")
    public Educacion crearEducacion(@RequestBody Educacion edu){
        return IEduServ.crearEducacion(edu);
    }
    
    @PutMapping("/educacion/editar/{id}")
    public void editarEdu(@PathVariable Long id, @RequestBody Educacion edu){
        IEduServ.editarEducacion(id, edu);
    }
    
    @GetMapping("/educacion/lista")
    @ResponseBody
    public List<Educacion> traerLista(){
        return IEduServ.traerLista();
    }
    
    @DeleteMapping("/educacion/eliminar/{id}")
    public void eliminarEducacion(@PathVariable Long id){
        IEduServ.eliminarEducacion(id);
    }
}

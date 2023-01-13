
package com.portfolio.controller;

import com.portfolio.model.Habilidad;
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
import com.portfolio.service.IHabilidadService;

@RestController
@CrossOrigin(origins = "https://portfolio-5166b.web.app")
public class HabilidadController {
    
    @Autowired
    private IHabilidadService iTecServ;
    
    @PostMapping("/habilidad/crear")
    public Habilidad crearTecnologia(@RequestBody Habilidad tec){
        return iTecServ.crearTecnologia(tec);
    }
    
    @PutMapping("/habilidad/editar/{id}")
    public void editarTec(@PathVariable Long id, @RequestBody Habilidad tec){
        iTecServ.editarTecnologia(id, tec);
    }
    
    @GetMapping("/habilidad/lista")
    @ResponseBody
    public List<Habilidad> traerTecnologias(){
        return iTecServ.traerLista();
    }
    
    @DeleteMapping("/habilidad/eliminar/{id}")
    public void eliminarTecnologia(@PathVariable Long id){
       iTecServ.eliminarTecnologia(id);
    }
}

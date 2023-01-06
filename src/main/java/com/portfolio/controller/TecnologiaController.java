
package com.portfolio.controller;

import com.portfolio.model.Tecnologia;
import com.portfolio.service.ITecnologiaService;
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
public class TecnologiaController {
    
    @Autowired
    private ITecnologiaService iTecServ;
    
    @PostMapping("/tecnologia/crear")
    public Tecnologia crearTecnologia(@RequestBody Tecnologia tec){
        return iTecServ.crearTecnologia(tec);
    }
    
    @PutMapping("/tecnologia/editar/{id}")
    public void editarTec(@PathVariable Long id, @RequestBody Tecnologia tec){
        iTecServ.editarTecnologia(id, tec);
    }
    
    @GetMapping("/tecnologia/lista")
    @ResponseBody
    public List<Tecnologia> traerTecnologias(){
        return iTecServ.traerLista();
    }
    
    @DeleteMapping("/tecnologia/eliminar/{id}")
    public void eliminarTecnologia(@PathVariable Long id){
       iTecServ.eliminarTecnologia(id);
    }
}

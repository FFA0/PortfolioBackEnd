
package com.portfolio.controller;

import com.portfolio.model.Proyecto;
import com.portfolio.service.IProyectoService;
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
public class ProyectoController {
    
    @Autowired
    private IProyectoService iProServ;
    
    @PostMapping("/proyecto/crear")
    public Proyecto crearProyecto(@RequestBody Proyecto pro){
       return iProServ.crearProyecto(pro);
    }
    
    @PutMapping("/proyecto/editar/{id}")
    public void editarPro(@PathVariable Long id, @RequestBody Proyecto pro){
        iProServ.editarProyecto(id, pro);
    }
    
    @GetMapping("/proyecto/lista")
    @ResponseBody
    public List<Proyecto> traerProyectos(){
        return iProServ.traerLista();
    }
    
    @DeleteMapping("/proyecto/eliminar/{id}")
    public void eliminarProyecto(@PathVariable Long id){
        iProServ.eliminarProyecto(id);
    }
}

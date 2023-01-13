
package com.portfolio.controller;

import com.portfolio.model.Localidad;
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
import com.portfolio.service.ILocalidadService;

@RestController
@CrossOrigin(origins = "https://portfolio-5166b.web.app")
public class LocalidadController {
    
    @Autowired
    private ILocalidadService  iDomServ;
    
    @PostMapping("/domicilio/crear")
    public void crearDomicilio(@RequestBody Localidad dom){
        iDomServ.crearDomicilio(dom);
    }
    
    @PutMapping("/domicilio/editar/{id}")
    public void editarDom(@PathVariable Long id, @RequestBody Localidad dom){
        iDomServ.editarDomicilio(id, dom);
    }
    
    @GetMapping("/domicilio/lista")
    @ResponseBody
    public List<Localidad> traerLista(){
        return iDomServ.traerLista();
    }
    
    @DeleteMapping("/domicilio/eliminar/{id}")
    public void eliminarDomicilio(@PathVariable Long id){
        iDomServ.eliminarDomicilio(id);
    }
}

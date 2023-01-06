
package com.portfolio.controller;

import com.portfolio.model.TipoEmpleo;
import com.portfolio.service.ITipoEmpleoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://portfolio-5166b.web.app")
public class TipoEmpleoController {
    
    @Autowired
    private ITipoEmpleoService iTipoServ;
    
    @PostMapping("/tipoempleo/crear")
    public void crearProyecto(@RequestBody TipoEmpleo tipo){
        iTipoServ.crearTipoEmpleo(tipo);
    }
    
    @PutMapping("/tipoempleo/editar/{id}")
    public void editarTipo(@PathVariable Long id, @RequestBody TipoEmpleo tipo){
        iTipoServ.editarTipoEmpleo(id, tipo);
    }
    
    @GetMapping("/tipoempleo/lista")
    public List<TipoEmpleo> traerLista(){
        return iTipoServ.traerLista();
    }
    
    @DeleteMapping("/tipoempleo/eliminar/{id}")
    public void eliminarTipo(@PathVariable Long id){
        iTipoServ.eliminarTipo(id);
    }
    
}


package com.portfolio.repository;

import com.portfolio.model.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{
    
    public Persona findByUsuarioAndContrasena(String usuario, String contrasena);      
}

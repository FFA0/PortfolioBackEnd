
package com.portfolio.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TipoEmpleo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Basic
    @Column(name = "tipo")
    private String tipo; 
    
    public TipoEmpleo() {
    }

    public TipoEmpleo(Long id, String tipo, List<Experiencia> listaExp) {
        this.id = id;
        this.tipo = tipo;
    }
    
    
}

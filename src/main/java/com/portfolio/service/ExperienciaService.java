package com.portfolio.service;

import com.portfolio.model.Experiencia;
import com.portfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {

    @Autowired
    private ExperienciaRepository expRepo;

    @Override
    public Experiencia crearExperiencia(Experiencia exp) {
        return expRepo.save(exp);
    }

    @Override
    public List<Experiencia> traerLista() {
        return expRepo.findAll();
    }

    @Override
    public void editarExperiencia(Long id, Experiencia exp) {
        Experiencia e = expRepo.findById(id).get();

        e.setTituloPuesto(exp.getTituloPuesto());
        e.setEmpresa(exp.getEmpresa());
        e.setTrabajoActual(exp.isTrabajoActual());
        e.setActividad(exp.getActividad());
        e.setFechaInicio(exp.getFechaInicio());
        e.setFechaFinal(exp.getFechaFinal());
        e.setTipo(exp.getTipo());
        e.setUrlFoto(exp.getUrlFoto());

        expRepo.save(e);
    }

    @Override
    public void eliminarExperiencia(Long id) {
        expRepo.deleteById(id);
    }
}

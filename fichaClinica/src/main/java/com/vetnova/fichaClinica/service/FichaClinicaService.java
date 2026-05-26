package com.vetnova.fichaClinica.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vetnova.fichaClinica.model.FichaClinica;
import com.vetnova.fichaClinica.repository.FichaClinicaRepository;

@Service
public class FichaClinicaService {
    @Autowired
    private FichaClinicaRepository fichaClinicaRepository;

    public FichaClinica guardarFichaClinica(FichaClinica ficha) {
        return fichaClinicaRepository.save(ficha);
    }
    
    public List<FichaClinica> listarFichasClinicas() {
        return fichaClinicaRepository.findAll();
    }

    public Optional<FichaClinica> obtenerFichaClinicaPorId(Long id) {
        return fichaClinicaRepository.findById(id);
    }

    public void eliminarFichaClinica(Long id) {
        fichaClinicaRepository.deleteById(id);
    }
}

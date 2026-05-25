package com.vetnova.fichaClinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vetnova.fichaClinica.model.FichaClinica;
import com.vetnova.fichaClinica.service.FichaClinicaService;

@RestController
@RequestMapping("/api/fichas")
public class FichaClinicaController {
    @Autowired
    private FichaClinicaService fichaClinicaService;
    
    @GetMapping
    public ResponseEntity<List<FichaClinica>> getFichas(){
        List<FichaClinica> fichas = fichaClinicaService.listarFichasClinicas();
        if(fichas.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(fichas, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<FichaClinica> crearFicha(@RequestBody FichaClinica ficha) {
        FichaClinica nuevaFicha = fichaClinicaService.guardarFichaClinica(ficha);
        return new ResponseEntity<>(nuevaFicha, HttpStatus.CREATED);

    }

    @GetMapping("/{id}")
    public ResponseEntity<FichaClinica> getFichaPorId(@PathVariable Long id) {
        FichaClinica ficha = fichaClinicaService.obtenerFichaClinicaPorId(id).orElse(null);
        if (ficha == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(ficha, HttpStatus.OK);

    }
}
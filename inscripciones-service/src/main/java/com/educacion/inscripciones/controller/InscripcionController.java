package com.educacion.inscripciones.controller;

import com.educacion.inscripciones.dto.InscripcionRequestDTO;
import com.educacion.inscripciones.dto.InscripcionResponseDTO;
import com.educacion.inscripciones.service.InscripcionService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inscripciones")
public class InscripcionController {

    @Autowired
    private InscripcionService inscripcionService;

    @PostMapping
    public InscripcionResponseDTO registrarInscripcion(
            @Valid @RequestBody InscripcionRequestDTO dto) {

        return inscripcionService.registrarInscripcion(dto);
    }

    @GetMapping
    public Object listarInscripciones() {
        return inscripcionService.listarInscripciones();
    }
}

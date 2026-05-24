package com.educacion.cursos.controller;

import com.educacion.cursos.dto.CursoRequestDTO;
import com.educacion.cursos.dto.CursoResponseDTO;
import com.educacion.cursos.entity.Curso;
import com.educacion.cursos.service.CursoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<CursoResponseDTO> listarCursos() {
        return cursoService.listarCursos();
    }

    @PostMapping
    public CursoResponseDTO guardarCurso(@Valid @RequestBody CursoRequestDTO dto) {
        return cursoService.guardarCurso(dto);
    }

    @GetMapping("/{id}")
    public Curso obtenerCurso(@PathVariable Long id) {
        return cursoService.buscarCurso(id);
    }
}
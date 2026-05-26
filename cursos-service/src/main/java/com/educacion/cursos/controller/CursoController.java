package com.educacion.cursos.controller;

import com.educacion.cursos.entity.Curso;
import com.educacion.cursos.service.CursoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    // GET ALL
    @GetMapping
    public List<Curso> listarCursos() {
        return cursoService.listarCursos();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public Curso obtenerCurso(@PathVariable Long id) {
        return cursoService.obtenerCurso(id);
    }

    // CREATE
    @PostMapping
    public Curso guardarCurso(@RequestBody Curso curso) {
        return cursoService.guardarCurso(curso);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Curso actualizarCurso(
            @PathVariable Long id,
            @RequestBody Curso curso) {

        return cursoService.actualizarCurso(id, curso);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void eliminarCurso(@PathVariable Long id) {
        cursoService.eliminarCurso(id);
    }
}

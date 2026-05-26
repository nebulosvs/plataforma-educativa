package com.educacion.cursos.service;

import com.educacion.cursos.entity.Curso;
import com.educacion.cursos.repository.CursoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    // GET ALL
    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }

    // GET BY ID
    public Curso obtenerCurso(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    // CREATE
    public Curso guardarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    // UPDATE
    public Curso actualizarCurso(Long id, Curso cursoActualizado) {

        Curso curso = cursoRepository.findById(id).orElse(null);

        if (curso != null) {

            curso.setNombre(cursoActualizado.getNombre());
            curso.setInstructor(cursoActualizado.getInstructor());
            curso.setDuracion(cursoActualizado.getDuracion());
            curso.setCosto(cursoActualizado.getCosto());

            return cursoRepository.save(curso);
        }

        return null;
    }

    // DELETE
    public void eliminarCurso(Long id) {
        cursoRepository.deleteById(id);
    }
}

package com.educacion.cursos.service;

import com.educacion.cursos.dto.CursoRequestDTO;
import com.educacion.cursos.dto.CursoResponseDTO;
import com.educacion.cursos.entity.Curso;
import com.educacion.cursos.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<CursoResponseDTO> listarCursos() {
        return cursoRepository.findAll()
                .stream()
                .map(this::convertirDTO)
                .collect(Collectors.toList());
    }

    public CursoResponseDTO guardarCurso(CursoRequestDTO dto) {

        Curso curso = Curso.builder()
                .nombre(dto.getNombre())
                .instructor(dto.getInstructor())
                .duracion(dto.getDuracion())
                .costo(dto.getCosto())
                .build();

        Curso guardado = cursoRepository.save(curso);

        return convertirDTO(guardado);
    }

    public Curso buscarCurso(Long id) {
        return cursoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Curso no encontrado"));
    }

    private CursoResponseDTO convertirDTO(Curso curso) {
        return CursoResponseDTO.builder()
                .id(curso.getId())
                .nombre(curso.getNombre())
                .instructor(curso.getInstructor())
                .duracion(curso.getDuracion())
                .costo(curso.getCosto())
                .build();
    }
}
package com.educacion.inscripciones.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InscripcionService {

    @Autowired
    private InscripcionRepository inscripcionRepository;

    @Autowired
    private CursoClient cursoClient;

    public InscripcionResponseDTO registrarInscripcion(InscripcionRequestDTO dto) {

        List<DetalleInscripcion> detalles = new ArrayList<>();
        List<DetalleResponseDTO> cursosResponse = new ArrayList<>();

        double total = 0;

        for (Long cursoId : dto.getCursos()) {

            // Obtener curso desde microservicio cursos
            CursoDTO curso = cursoClient.obtenerCurso(cursoId);

            // Crear detalle de inscripción
            DetalleInscripcion detalle = new DetalleInscripcion();
            detalle.setCursoId(curso.getId());
            detalle.setNombreCurso(curso.getNombre());
            detalle.setCosto(curso.getCosto());

            detalles.add(detalle);

            // DTO respuesta
            DetalleResponseDTO detalleResponse = new DetalleResponseDTO();
            detalleResponse.setNombreCurso(curso.getNombre());
            detalleResponse.setCosto(curso.getCosto());

            cursosResponse.add(detalleResponse);

            total += curso.getCosto();
        }

        // Crear inscripción
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setEstudiante(dto.getEstudiante());
        inscripcion.setTotal(total);
        inscripcion.setDetalles(detalles);

        // Guardar en BD
        inscripcionRepository.save(inscripcion);

        // Respuesta final
        return new InscripcionResponseDTO(
                dto.getEstudiante(),
                cursosResponse,
                total
        );
    }

    //  MÉTODO GET
    public List<Inscripcion> listarInscripciones() {
        return inscripcionRepository.findAll();
    }
}

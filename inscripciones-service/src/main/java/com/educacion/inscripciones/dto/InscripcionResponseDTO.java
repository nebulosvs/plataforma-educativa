package com.educacion.inscripciones.dto;

import java.util.List;

public class InscripcionResponseDTO {

    private String estudiante;

    private List<DetalleResponseDTO> cursos;

    private Double total;

    public InscripcionResponseDTO() {
    }

    public InscripcionResponseDTO(String estudiante, List<DetalleResponseDTO> cursos, Double total) {
        this.estudiante = estudiante;
        this.cursos = cursos;
        this.total = total;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public List<DetalleResponseDTO> getCursos() {
        return cursos;
    }

    public void setCursos(List<DetalleResponseDTO> cursos) {
        this.cursos = cursos;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
package com.educacion.inscripciones.dto;

import java.util.List;

public class InscripcionRequestDTO {

    private String estudiante;
    private List<Long> cursos;

    public InscripcionRequestDTO() {
    }

    public InscripcionRequestDTO(String estudiante, List<Long> cursos) {
        this.estudiante = estudiante;
        this.cursos = cursos;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public List<Long> getCursos() {
        return cursos;
    }

    public void setCursos(List<Long> cursos) {
        this.cursos = cursos;
    }
}
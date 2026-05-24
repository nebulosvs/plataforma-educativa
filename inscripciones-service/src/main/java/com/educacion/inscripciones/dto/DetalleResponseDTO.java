package com.educacion.inscripciones.dto;

public class DetalleResponseDTO {

    private String nombreCurso;

    private Double costo;

    public DetalleResponseDTO() {
    }

    public DetalleResponseDTO(String nombreCurso, Double costo) {
        this.nombreCurso = nombreCurso;
        this.costo = costo;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }
}
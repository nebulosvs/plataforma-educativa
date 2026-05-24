package com.educacion.inscripciones.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "INSCRIPCIONES")
public class Inscripcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String estudiante;

    private Double total;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "inscripcion_id")
    private List<DetalleInscripcion> detalles;

    public Inscripcion() {
    }

    public Inscripcion(Long id, String estudiante, Double total, List<DetalleInscripcion> detalles) {
        this.id = id;
        this.estudiante = estudiante;
        this.total = total;
        this.detalles = detalles;
    }

    public Long getId() {
        return id;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public Double getTotal() {
        return total;
    }

    public List<DetalleInscripcion> getDetalles() {
        return detalles;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public void setDetalles(List<DetalleInscripcion> detalles) {
        this.detalles = detalles;
    }
}
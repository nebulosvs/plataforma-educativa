package com.educacion.inscripciones.repository;

import com.educacion.inscripciones.entity.DetalleInscripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleInscripcionRepository extends JpaRepository<DetalleInscripcion, Long> {
}
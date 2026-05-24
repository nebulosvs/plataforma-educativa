package com.educacion.cursos.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CursoResponseDTO {

    private Long id;
    private String nombre;
    private String instructor;
    private Integer duracion;
    private Double costo;
}
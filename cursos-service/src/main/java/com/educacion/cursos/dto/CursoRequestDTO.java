package com.educacion.cursos.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CursoRequestDTO {

    @NotBlank
    private String nombre;

    @NotBlank
    private String instructor;

    @NotNull
    private Integer duracion;

    @NotNull
    private Double costo;
}
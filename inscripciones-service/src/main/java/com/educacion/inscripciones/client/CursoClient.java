package com.educacion.inscripciones.client;

import com.educacion.inscripciones.dto.CursoDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class CursoClient {

    private final WebClient webClient;

    public CursoClient() {

        this.webClient = WebClient.builder()
                .baseUrl("http://cursos-service:8081/api/cursos")
                .build();
    }

    public CursoDTO obtenerCurso(Long id) {

        return webClient.get()
                .uri("/{id}", id)
                .retrieve()
                .bodyToMono(CursoDTO.class)
                .block();
    }
}